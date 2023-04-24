// File system objects
abstract sig FSObject { }
sig File, Dir extends FSObject { }

// A File System
sig FileSystem {
  //live: set FSObject,
  root: lone Dir,
  parent: (FSObject - root) ->one Dir,
  contents: Dir -> FSObject
}{
  // live objects are reachable from the root
  //live in root.*contents
  // parent is the inverse of contents
  parent = ~contents
  // File system is connected
  FSObject in root.*contents + root
}



pred example { }

run example for exactly 1 FileSystem, 8 FSObject, 4 File
