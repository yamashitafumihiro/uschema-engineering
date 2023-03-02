package es.um.unosql.subtypes.util;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

import es.um.unosql.documents.extractors.util.MapReduceSources;
import es.um.unosql.subtypes.timestamp.templates.TimestampAnalyzer;

public class MapReduceTimestampSources extends MapReduceSources
{
  private static final String BEGIN_REPLACE_TIMESTAMP = "///// BEGIN TimestampAnalyzer declaration /////";
  private static final String END_REPLACE_TIMESTAMP   = "///// END TimestampAnalyzer declaration /////";
  private String timestampCode;

  public MapReduceTimestampSources(Path mapReduceDir)
  {
    super(mapReduceDir);
  }

  public MapReduceTimestampSources(Path mapReduceDir, Path tsCodeFile)
  {
    super(mapReduceDir);
    setTimestampCodeFile(tsCodeFile);
  }

  public MapReduceTimestampSources(Path mapReduceDir, TimestampAnalyzer analyzer)
  {
    super(mapReduceDir);
    timestampCode = new String(analyzer.toString());
  }

  public void setTimestampCodeFile(Path tsCodeFile)
  {
    try
    {
      timestampCode = new String(Files.readAllBytes(tsCodeFile));
    } catch(Exception e)
    {
      throw new IllegalArgumentException("Timestamp code could not be found in " + tsCodeFile);
    }
  }

  public String getTimestampCode()
  {
    return this.timestampCode;
  }

  public String getMapJSCode()
  {
    if (timestampCode == null || timestampCode.isEmpty())
      throw new IllegalStateException("Timestamp code was not set before!");

    Pattern pattern = Pattern.compile(BEGIN_REPLACE_TIMESTAMP + ".*" + END_REPLACE_TIMESTAMP, Pattern.DOTALL);
    return pattern.matcher(super.getMapJSCode()).replaceFirst(timestampCode);
  }
}
