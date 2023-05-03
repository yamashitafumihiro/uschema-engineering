package es.um.uschema.codeql.utils

class GenerationUtils
{
  static def purify(String string)
  {
    return string.trim.replace("_", "-").toLowerCase
  }
}
