package es.um.uschema.xtext.skiql.generator

import es.um.uschema.USchema.USchema

class GoogleChartGenerator {
	
	static final String SHOW = "SHOW|";
	
	def generateGoogleChart(USchema model, String divName) 
	{
		'''
			<script type="text/javascript">
				google.charts.load('current', {'packages':['treemap']});
				google.charts.setOnLoadCallback(drawChart);
				function drawChart() {
					var data = new google.visualization.DataTable();
					data.addColumn({type:'string', role:'annotation'});
			        data.addColumn({type:'string', role:'Parent'});
			        data.addColumn({type:'number', role:'Variation Count (size)'});
			        data.addColumn({type:'number', role:'Variation Count (color)'});
			        data.addRows([
			        	['uNoSQL',						null,			0,			0],
			        	«FOR entity : model.entities»
			        	«IF !entity.name.startsWith(SHOW)»«val num = entity.variations.map[v | v.count].reduce[v1, v2| v1 + v2]»
			        	['ET:«entity.name.replace(SHOW,"")»',				'uNoSQL',		«num»,				«num»],
			        	«ENDIF»
			        	«ENDFOR»
			        	«FOR relationship : model.relationships»
			        	«IF !relationship.name.startsWith(SHOW)»«val num = relationship.variations.map[v | v.count].reduce[v1, v2| v1 + v2]»
			        	['RT:«relationship.name.replace(SHOW,"")»',				'uNoSQL',		«num»,				«num»],
			        	«ENDIF»
			        	«ENDFOR»
			        	«FOR entity : model.entities»
			        	«IF !entity.name.startsWith(SHOW)»
			        	«FOR variation : entity.variations»
			        	['«DataStringGenerator.generateVariationString(variation).replace(SHOW,"")»',		'ET:«entity.name.replace(SHOW,"")»',«variation.count»,	«variation.count»],
			        	«ENDFOR»
			        	«ENDIF»
			        	«ENDFOR»
			        	«FOR entity : model.relationships»
			        	«IF !entity.name.startsWith(SHOW)»
			        	«FOR variation : entity.variations»
			        	['«val string = DataStringGenerator.generateVariationString(variation).replace(SHOW,"")»«string.equals("{}") ?  ("RT:" + entity.name.replace(SHOW,"") + " - No Features") : string»',		'RT:«entity.name.replace(SHOW,"")»',«variation.count»,	«variation.count»],
			        	«ENDFOR»
			        	«ENDIF»
			        	«ENDFOR»
					]);
					tree = new google.visualization.TreeMap(document.getElementById('«divName»'));
					tree.draw(data, {
						enableHighlight: true,
						maxDepth: 1,
						maxPostDepth: 2,
						minColor: '#F7F7F7',
						midColor: '#CCE5FF',
						maxColor: '#CCCCFF',
						showScale: true,
						useWeightedAverageForAggregation: true, 
						headerHeight: 10,
						generateTooltip: showStaticTooltip
					});
					function showStaticTooltip(row, size, value) {
						return '<div style="background:#FFFFFF; padding:10px; border-style:solid; border-color: #0077aa;">' + '<b>count: ' + data.getValue(row, 2) + '</b><br><br><b>Features</b><br>' + data.getValue(row, 0).replaceAll(";", "<br>").replace("{","").replace("}","") + '</div>';
					}
				}
			</script>
		'''
	}
	
	
}