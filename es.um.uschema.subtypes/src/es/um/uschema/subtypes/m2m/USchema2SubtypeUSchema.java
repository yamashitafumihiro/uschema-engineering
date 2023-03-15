package es.um.uschema.subtypes.m2m;

import java.util.List;

import es.um.uschema.USchema.EntityType;
import es.um.uschema.USchema.RelationshipType;
import es.um.uschema.USchema.SchemaType;
import es.um.uschema.USchema.StructuralFeature;
import es.um.uschema.USchema.StructuralVariation;
import es.um.uschema.USchema.USchema;
import es.um.uschema.utils.USchemaFactory;
import es.um.uschema.utils.compare.CompareFeature;
import es.um.uschema.subtypes.discovery.DependencyAnalyzer;
import es.um.uschema.subtypes.util.types.EntitySubtype;

public class USchema2SubtypeUSchema
{
    private USchemaFactory factory = new USchemaFactory();
    private CompareFeature comparer = new CompareFeature();

    public USchema m2m(USchema schema, List<DependencyAnalyzer> analyzers)
    {
        for (DependencyAnalyzer analyzer : analyzers)
            m2m(schema, analyzer);

        return schema;
    }

    public USchema m2m(USchema schema, DependencyAnalyzer analyzer)
    {
        for (EntitySubtype subtype : analyzer.getSubtypes())
        {
            String newName = analyzer.getSchemaType().getName() + "_"
                    + analyzer.getDiscriminatorSeeker().getDiscriminatorValues().get(subtype);

            if (analyzer.getSchemaType() instanceof EntityType)
                createEntityType(schema, analyzer.getSchemaType(), newName,
                        ((EntityType) analyzer.getSchemaType()).isRoot(), subtype.getVariations());

            else if (analyzer.getSchemaType() instanceof RelationshipType)
                createRelationshipType(schema, analyzer.getSchemaType(), newName, subtype.getVariations());
        }

        return schema;
    }

    private void createEntityType(USchema schema, SchemaType parent, String name, boolean isRoot,
            List<StructuralVariation> variations)
    {
        EntityType newEntityType = factory.createEntityType(name, isRoot);
        newEntityType.getVariations().addAll(variations);
        newEntityType.getParents().add(parent);

        // For each optional structural feature, if all other variations do contain an
        // equal feature, then this feature is no longer optional.
        for (StructuralVariation v : variations)
            for (StructuralFeature f : v.getStructuralFeatures())
                if (f.isOptional() && variations.stream().filter(v2 -> v != v2)
                        .allMatch(v2 -> v2.getFeatures().stream().anyMatch(f2 -> comparer.compare(f, f2))))
                    f.setOptional(false);

        schema.getEntities().add(newEntityType);
    }

    private void createRelationshipType(USchema schema, SchemaType parent, String name,
            List<StructuralVariation> variations)
    {
        RelationshipType newRelationshipType = factory.createRelationshipType(name);
        newRelationshipType.getVariations().addAll(variations);
        newRelationshipType.getParents().add(parent);

        // For each optional structural feature, if all other variations do contain an
        // equal feature, then this feature is no longer optional.
        for (StructuralVariation v : variations)
            for (StructuralFeature f : v.getStructuralFeatures())
                if (variations.stream().filter(v2 -> v != v2)
                        .allMatch(v2 -> v2.getFeatures().stream().anyMatch(f2 -> comparer.compare(f, f2))))
                    f.setOptional(false);

        schema.getRelationships().add(newRelationshipType);
    }
}
