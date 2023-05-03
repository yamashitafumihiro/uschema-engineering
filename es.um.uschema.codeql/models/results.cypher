CREATE (x: UnrecognizedEntityType);
CREATE (x: Developer { _id: "", email: "", permissions: "", is_active: true, suspended_acc: ""});
CREATE (x: DeveloperInfo { name: "", team: "", about_me: ""});
CREATE (x: Ticket { _id: "", message: "", repository_id: "", developer_id: "", created_time: "", last_activity_date: ""});
CREATE (x: Repository { _id: "", title: "", url: "", developers: [], num_forks: 0, num_stars: 0, tags: []});

CREATE (x: Access { entity: "Developer", file: "mongodb_count.js", line: 25, message: "countDocuments: Developer"});
MATCH (x: Access), (y: Developer)
WHERE x.entity = "Developer"
CREATE (x)-[r:countDocuments]->(y);

CREATE (x: Access { entity: "Developer", file: "mongodb_find1.js", line: 20, message: "findOne: Developer"});
MATCH (x: Access), (y: Developer)
WHERE x.entity = "Developer"
CREATE (x)-[r:findOne]->(y);

CREATE (x: Access { entity: "Developer", file: "mongodb_update1.js", line: 24, message: "updateOne: Developer"});
MATCH (x: Access), (y: Developer)
WHERE x.entity = "Developer"
CREATE (x)-[r:updateOne]->(y);

CREATE (x: Access { entity: "Developer", file: "running.js", line: 13, message: "findOne: Developer"});
MATCH (x: Access), (y: Developer)
WHERE x.entity = "Developer"
CREATE (x)-[r:findOne]->(y);

CREATE (x: MongooseSchema { entity: "Developer", file: "models/Developer.js", line: 20, message: "model: Developer"});
MATCH (x: MongooseSchema), (y: Developer)
WHERE x.entity = "Developer"
CREATE (x)-[r:MongooseModel]->(y);

CREATE (x: MongooseSchema { entity: "Developerinfo", file: "models/DeveloperInfo.js", line: 11, message: "model: DeveloperInfo"});
MATCH (x: MongooseSchema), (y: Developerinfo)
WHERE x.entity = "Developerinfo"
CREATE (x)-[r:MongooseModel]->(y);

CREATE (x: Access { entity: "Repository", file: "mongodb_delete1.js", line: 16, message: "deleteOne: Repository"});
MATCH (x: Access), (y: Repository)
WHERE x.entity = "Repository"
CREATE (x)-[r:deleteOne]->(y);

CREATE (x: Access { entity: "Repository", file: "mongodb_delete2.js", line: 17, message: "deleteMany: Repository"});
MATCH (x: Access), (y: Repository)
WHERE x.entity = "Repository"
CREATE (x)-[r:deleteMany]->(y);

CREATE (x: Access { entity: "Repository", file: "mongodb_find2.js", line: 21, message: "find: Repository"});
MATCH (x: Access), (y: Repository)
WHERE x.entity = "Repository"
CREATE (x)-[r:find]->(y);

CREATE (x: Access { entity: "Repository", file: "mongodb_insert2.js", line: 23, message: "insertMany: Repository"});
MATCH (x: Access), (y: Repository)
WHERE x.entity = "Repository"
CREATE (x)-[r:insertMany]->(y);

CREATE (x: Access { entity: "Repository", file: "mongodb_update2.js", line: 25, message: "updateMany: Repository"});
MATCH (x: Access), (y: Repository)
WHERE x.entity = "Repository"
CREATE (x)-[r:updateMany]->(y);

CREATE (x: MongooseSchema { entity: "Repository", file: "models/Repository.js", line: 19, message: "model: Repository"});
MATCH (x: MongooseSchema), (y: Repository)
WHERE x.entity = "Repository"
CREATE (x)-[r:MongooseModel]->(y);

CREATE (x: Access { entity: "Ticket", file: "mongodb_bulk.js", line: 17, message: "bulkWrite: Ticket"});
MATCH (x: Access), (y: Ticket)
WHERE x.entity = "Ticket"
CREATE (x)-[r:bulkWrite]->(y);

CREATE (x: Access { entity: "Ticket", file: "mongodb_distinct.js", line: 21, message: "distinct: Ticket"});
MATCH (x: Access), (y: Ticket)
WHERE x.entity = "Ticket"
CREATE (x)-[r:distinct]->(y);

CREATE (x: Access { entity: "Ticket", file: "mongodb_insert1.js", line: 20, message: "insertOne: Ticket"});
MATCH (x: Access), (y: Ticket)
WHERE x.entity = "Ticket"
CREATE (x)-[r:insertOne]->(y);

CREATE (x: Access { entity: "Ticket", file: "running.js", line: 21, message: "deleteMany: Ticket"});
MATCH (x: Access), (y: Ticket)
WHERE x.entity = "Ticket"
CREATE (x)-[r:deleteMany]->(y);

CREATE (x: MongooseSchema { entity: "Ticket", file: "models/Ticket.js", line: 18, message: "model: Ticket"});
MATCH (x: MongooseSchema), (y: Ticket)
WHERE x.entity = "Ticket"
CREATE (x)-[r:MongooseModel]->(y);

