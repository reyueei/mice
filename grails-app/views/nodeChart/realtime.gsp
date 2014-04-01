<!DOCTYPE html>
<html>
<head>
	<title>WiTMon</title>
<g:javascript src = "Charts/FusionCharts.js" />
<g:javascript src = "Charts/jquery.min.js" />
<g:javascript src = "Charts/prettify.js" />
<g:javascript src = "Charts/json2.js" />
<g:javascript src = "Charts/lib.js" />
<g:javascript src = "Charts/date.js" />
 
		
</head>
<body>

 	<g:javascript src = "Charts/RTLineDY.js" />        
        
		<div id="chartdiv" align="center">Chart will load here</div>
       
		
		<script type="text/javascript">
			if ((typeof isJSChartNotAvailable=="undefined" || !isJSChartNotAvailable==true) && (GALLERY_RENDERER && GALLERY_RENDERER.search(/javascript|flash/i)==0) )  FusionCharts.setCurrentRenderer(GALLERY_RENDERER); 
			
            var chart = new FusionCharts("${resource(dir: 'swf', file: 'RealTimeLineDY.swf')}", "ChartId", "550", "390", "0", "1" );
            chart.setXMLData( dataString );
			var chartReference = FusionCharts( "ChartId" ); 
			chartReference.resizeTo( "700", "500" );
			
			chart.render("chartdiv");
		
			window.dataUpdateTimer = null;
			
			FusionCharts.addEventListener("Rendered", function(e,a) {
				if(e.sender.id=="tmpChartId") return;
			
				window.dataUpdateTimer = window.setInterval (function (){ 
					provideRealTimeDataThroughJSAPI(e.sender);
				},5000 );
			});			
				
			function provideRealTimeDataThroughJSAPI(sender)
			{
				var updater= sender.feedData? sender : null;
				
				var p = (Math.random()*235)+228;
				var v = (Math.random()*2)+1;
				var dateTimeLabel = new Date().toString("HH:mm:ss");
				if(updater) updater.feedData("&label=" + dateTimeLabel + "&value=" + p + "|" + v);
			}
		
			
        </script>
 
 
 
 
</body>

</html>