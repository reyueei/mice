<html>
  <head>        
    <title>test</title>         
<g:javascript src = "FusionCharts/FusionCharts.js" />
 
  </head>   
  <body>     

        <center>
    <div id="chartContainer">FusionCharts XT will load here!</div>          
    <script type="text/javascript"><!--         

      var myChart = new FusionCharts( "${resource(dir: 'swf', file: 'Bar2D.swf')}", 
		"myChartId", "500", "400", "0" );
      myChart.setXMLUrl("${resource(dir: 'OUTPUT', file: 'nodeData.xml')}");
      myChart.render("chartContainer");
      
    // -->     
    </script>      
	</center>
  </body> 
</html>

