/* Modificado:
- allObjects guarda todos los objetos de este FileSystem.
  Como puede haber varios, y así puedo restringir las consultas
  dentro de un FileSystem
*/

// File system objects
abstract sig FSObject { }
sig File, Dir extends FSObject { }

// A File System
sig FileSystem {
  ownFSObjects: set FSObject,     // Conjunto de Dirs + File de este FS
  root: Dir & ownFSObjects,  // intersección de todos los Dirs con los que tiene
  parent: (ownFSObjects - root) ->one (Dir & ownFSObjects),
  contents: (Dir & ownFSObjects) -> ownFSObjects
}{
  // live objects are reachable from the root
  //live in root.*contents
  // parent is the inverse of contents
  parent = ~contents
  // File system is connected
  ownFSObjects in root.*contents + root
}

// No FSObject lives outside any FileSystem
fact noOutsideFSObjects {
 all f : FSObject { one fs : FileSystem | f in fs.ownFSObjects}
}

// FileSystems do not share FSObjects
fact noSharedFSObjects {
  all fs1, fs2: FileSystem |  (fs1 != fs2) => ((fs1.ownFSObjects & fs2.ownFSObjects) = none)
}

//assert atMostOneRoot { all fs : FileSystem { none d :  fs.root not in fs.parent } }

pred example { }

run example for exactly 2 FileSystem, 8 FSObject, 4 File
