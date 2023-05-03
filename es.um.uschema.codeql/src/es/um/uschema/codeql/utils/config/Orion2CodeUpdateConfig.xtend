package es.um.uschema.codeql.utils.config

import java.nio.file.Path
import java.util.Properties
import org.apache.commons.cli.Options
import org.apache.commons.cli.OptionGroup
import org.apache.commons.cli.Option
import org.apache.commons.cli.DefaultParser
import org.apache.commons.cli.HelpFormatter
import org.apache.commons.cli.ParseException
import es.um.uschema.codeql.utils.config.defaults.DefaultConfig

class Orion2CodeUpdateConfig
{
  Path inputModel
  Path outputPath
  AlertEnum alertLevel
  Properties defaultProperties

  new()
  {
    this.defaultProperties = DefaultConfig.getDefaultConfig()
    this.inputModel = null
    this.outputPath = Path.of(defaultProperties.getProperty("folder_orion2codeupdate"))
    this.alertLevel = AlertEnum.valueOf(defaultProperties.getProperty("alert_level"))
  }

  new(String[] args)
  {
    this()

    val options = new Options()

    options.addOption(Option.builder("h").longOpt("help").desc("Prints help").build())
    options.addOption(Option.builder("o").longOpt("output").desc("Path to an output folder").hasArg().argName("output_folder").build())
    options.addOption(Option.builder("a").longOpt("alert").desc("Alert level (All | warnings | errors)").hasArg().argName("alert").build())

    val inputMode = new OptionGroup();
    inputMode.setRequired(true);
    inputMode.addOption(Option.builder("i").longOpt("input").desc("Path to an input model").hasArg().argName("model").build())
    options.addOptionGroup(inputMode)

    val parser = new DefaultParser()
    val formatter = new HelpFormatter()

    try
    {
      val cmd = parser.parse(options, args)

      if (cmd.hasOption("h"))
      {
        formatter.printHelp("<Orion2CodeUpdate Main>", options)
        System.exit(0)
      }

      if (cmd.hasOption("i"))
        this.inputModel = Path.of(cmd.getOptionValue("i"))

      if (cmd.hasOption("o"))
        this.outputPath = Path.of(cmd.getOptionValue("o"))

      if (cmd.hasOption("a"))
        this.alertLevel = AlertEnum.valueOf(cmd.getOptionValue("a").toUpperCase)

    } catch (ParseException e)
    {
      System.out.println(e.getMessage());
      formatter.printHelp("<Orion2CodeUpdate Main>", options);

      System.exit(1);
    }
  }

  def void setInputModel(Path inputModel)
  {
    this.inputModel = inputModel
  }

  def Path getInputModel()
  {
    return this.inputModel
  }

  def void setOutputPath(Path outputPath)
  {
    this.outputPath = outputPath
  }

  def Path getOutputPath()
  {
    return this.outputPath
  }

  def void setAlertLevel(AlertEnum alertLevel)
  {
    this.alertLevel = alertLevel
  }

  def AlertEnum getAlertLevel()
  {
    return this.alertLevel
  }
}
