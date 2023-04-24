/* Modificado de dos formas:
 - No hay live ahora. Con el modelo anterior, podía haber perfectamente
   otros ficheros generados que no estaban en el "live"
 - Esto era intencionado, por eso estaba
 - Cómo lo he modificado: No hay live. Ahora el root es un "lone",
   puede existir o no
 - La relación parent va de todos los objetos menos el root a exactamente
   un directorio (así root no tiene parent)
 - contents sigue igual, sólo un directorio puede tener contenido, y
   va a cualquier objeto, directorio o fichero
 - Se establece que FSObject (todos los objetos) o bien están en 
   root.contents (como closure cerrada, vamos todos los descendientes)
   e incluyen al root si está.
*/

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

assert atMostOneRoot { all fs : FileSystem { fs.root not in fs.parent } }

pred example { }

run example for exactly 1 FileSystem, 8 FSObject, 4 File
