# U-Schema Engineering Processes

This repository contains the Eclipse projects related to several DSLs related to U-Schema: Athena, Orion, Deimos, and SkiQL. It also contains the *Eirene* tool, an algorithm able to discover entity inheritance relationships in U-Schema models, and the *SchemaDifferentiation* utility to generate Mongoose schemas and Morphia ODMs from U-Schemas.

The engineering processes stored here depend on the U-Schema core projects that are found in the corresponding [U-Schema repository](https://github.com/modelum/uschema).

```bash
$ git clone https://github.com/modelum/uschema
$ git clone https://github.com/modelum/uschema-engineering
```

In addition to this, *Eirene* also depends on the inference process stored in the [U-Schema inference repository](https://github.com/modelum/uschema-inference).

```bash
$ git clone https://github.com/modelum/uschema-inference
```

The repository contains the following projects:

* `es.um.uschema.xtext.athena.parent`: Project containing the Athena language, its corresponding editors and the Athena engine.
* `es.um.uschema.xtext.skiql.parent`: Project containing the SkiQL language and the web-based U-Schema visualization.
* `es.um.uschema.subtypes`: Project containing *Eirene*, the entity inheritance discovery algorithm.
