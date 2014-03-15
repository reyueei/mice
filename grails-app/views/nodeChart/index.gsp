<html>
  <head>        
    <title>test</title>         
<g:javascript src = "FusionCharts/FusionCharts.js" />
 <r:require modules="application" />
  </head>   
  <body>     

        
    <div id="chartContainer" align="left">FusionCharts XT will load here!</div>          
    <script type="text/javascript"><!--         

      var myChart = new FusionCharts( "Bar2D.swf", 
		"myChartId", "300", "200", "0" );
      myChart.setXMLUrl("nodeData.xml");
      myChart.render("chartContainer");
      
    // -->     
    </script>      
	<a href="/mice/map">View Location</a>
	
	
	
	
  </body> 
</html>

