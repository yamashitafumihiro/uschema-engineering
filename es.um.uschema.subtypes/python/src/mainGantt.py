import sys
from charts.GanttChart import GanttChart

SAVE_ROUTE = "../../../es.um.uschema.xtext.models/thesis/subtypes/"
REDDIT_CSV_ROUTE = "../../../es.um.uschema.xtext.models/thesis/subtypes/reddit.csv"
REDDIT_CSV_OUTLIERS_ROUTE = "../../../es.um.uschema.xtext.models/thesis/subtypes/reddit_outliers.csv"
REDDIT_CSV_LIVEVARS_ROUTE = "../../../es.um.uschema.xtext.models/thesis/subtypes/reddit_livevars.csv"
SOF_CSV_ROUTE = "../../output/stackoverflow/stackoverflow.csv"
SOF_CSV_OUTLIERS_ROUTE = "../../output/stackoverflow/stackoverflow_outliers.csv"
SOF_CSV_LIVEVARS_ROUTE = "../../output/stackoverflow/stackoverflow_livevars.csv"

def main():

  chartCreator = GanttChart(REDDIT_CSV_ROUTE)
  chartCreator.saveCharts(SAVE_ROUTE)
  #chartCreator.showCharts()

main()
