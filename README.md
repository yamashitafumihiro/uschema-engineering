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
* `es.um.uschema.xtext.orion.parent`: Project containing the Orion language, the Orion engine and its corresponding editors.
* `es.um.uschema.alloy`: Project containing the validation of the Orion taxonomy using the Alloy language.
* `es.um.uschema.subtypes`: Project containing *Eirene*, the entity inheritance discovery algorithm.

List of related publications:

* Alberto Hernández Chillón, José Ramón Hoyos, Jesús García Molina, Diego Sevilla Ruiz, [Discovering Entity Inheritance Relationships in Document Stores](https://www.sciencedirect.com/science/article/abs/pii/S0950705121006560). Knowledge-Based Systems 230: 107394.

* Alberto Hernández Chillón, Diego Sevilla Ruiz, Jesús García Molina, [Towards a Taxonomy of Schema Changes for NoSQL Databases: The Orion Language](https://link.springer.com/chapter/10.1007/978-3-030-89022-3_15). The 40th International Conference on Conceptual Modeling, ER 2021, St. John's, NL, Canada.

* Alberto Hernández Chillón, Diego Sevilla Ruiz, Jesús García Molina, [Athena: A Database-Independent Schema Definition Language](https://link.springer.com/chapter/10.1007/978-3-030-88358-4_4). CoMoNoS 2021, under ER 2021 conference, St. John's, NL, Canada.
