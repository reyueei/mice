<?xml version="1.0" encoding="iso-8859-1"?><!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
     <head> <meta name="viewport" content="width=996px"/>
        <title>Real-time Dual Y Axis Line Chart</title>
		
		
<g:javascript src = "Charts/FusionCharts.js" />
<g:javascript src = "Charts/jquery.min.js" />
<g:javascript src = "Charts/prettify.js" />
<g:javascript src = "Charts/json2.js" />
<g:javascript src = "Charts/lib.js" />
<g:javascript src = "Charts/date.js" />
 
		<script type="text/javascript">
			var isJSChartNotAvailable = false;
		</script>
<!--[if IE 6]>
	<g:javascript src = "Charts/DD_belatedPNG_0.0.8a-min.js" />     
        <script>
          /* select the element name, css selector, background etc */
          DD_belatedPNG.fix('img');

          /* string argument can be any CSS selector */
        </script>
		  <p>&nbsp;</p>
		  <P align="center"></P>
        <![endif]-->
    </head>
    <body>
        
	
		
		<g:javascript src = "Charts/RTLineDY.js" />        
        
		<div id="chartdiv" align="center">Chart will load here</div>
        
		
		<script type="text/javascript">
			if ((typeof isJSChartNotAvailable=="undefined" || !isJSChartNotAvailable==true) && (GALLERY_RENDERER && GALLERY_RENDERER.search(/javascript|flash/i)==0) )  FusionCharts.setCurrentRenderer(GALLERY_RENDERER); 
			
            var chart = new FusionCharts("${resource(dir: 'swf', file: 'RealTimeLineDY.swf')}", "ChartId", "550", "390", "0", "1" );
            chart.setXMLData( dataString );
             // chart.setXMLUrl("${resource(dir: 'OUTPUT', file: 'realtimedata.xml')}");
			
			chart.render("chartdiv");
		
			window.dataUpdateTimer = null;
			
			FusionCharts.addEventListener("Rendered", function(e,a) {
				if(e.sender.id=="tmpChartId") return;
			
				window.dataUpdateTimer = window.setInterval (function (){ 
					provideRealTimeDataThroughJSAPI(e.sender);
				},3000 );
			});			
				
			function provideRealTimeDataThroughJSAPI(sender)
			{
				var updater= sender.feedData? sender : null;
				
				var p = (Math.random()*6)+30;
				var v = (Math.random()*800)+58200;
				var dateTimeLabel = new Date().toString("HH:mm:ss");
				if(updater) updater.feedData("&label=" + dateTimeLabel + "&value=" + p + "|" + v );
			}
		
			
        </script>
		
     </body>
	 
 </html>
