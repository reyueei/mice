<html>
  <head>        
    <title>test</title>         
<g:javascript src = "FusionCharts/FusionCharts.js" />
 
  </head>   
  <body>     

        
    <div id="chartContainer" align="left">FusionCharts XT will load here!</div>          
    <script type="text/javascript"><!--         

      var myChart = new FusionCharts( "${resource(dir: 'swf', file: 'Bar2D.swf')}", 
		"myChartId", "300", "200", "0" );
      myChart.setXMLUrl("${resource(dir: 'OUTPUT', file: 'nodeData.xml')}");
      myChart.render("chartContainer");
      
    // -->     
    </script>      
	<a href="/mice/map">View Location</a>
	
	
	
	
  </body> 
</html>

