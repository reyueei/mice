<html>
  <head>        
    <title>test</title>         
<g:javascript src = "Charts/FusionCharts.js" />
<g:javascript src = "Charts/jquery.min.js" />
<g:javascript src = "Charts/prettify.js" />
<g:javascript src = "Charts/json2.js" />
<g:javascript src = "Charts/lib.js" />
<g:javascript src = "Charts/date.js" />
 
  </head>   
 <body>
        
		<p>&nbsp;</p>
        <p>&nbsp;</p>
        <g:javascript src = "Charts/RTLineDY.js" />

      
        <script type="text/javascript">
			if ((typeof isJSChartNotAvailable=="undefined" || !isJSChartNotAvailable==true) && (GALLERY_RENDERER && GALLERY_RENDERER.search(/javascript|flash/i)==0) )  FusionCharts.setCurrentRenderer(GALLERY_RENDERER); 
			
            var chart = new FusionCharts("${resource(dir: 'swf', file: 'RealTimeLineDY.swf')}", "ChartId", "550", "390", "0", "1" );
            chart.setXMLData( dataString );
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
	 <script type="text/javascript">
	 	$(document).ready ( function() {
			  if(chart.options.renderer=="javascript" && isJSChartNotAvailable)
			  {
			  	$(".description-text").css( { "visibility": "hidden" } );
			  	$(".qua-button-holder").css( { "visibility": "hidden" } );
			  	$(".show-code-block").css( { "visibility": "hidden" } );				
			  	$(".chart-title").next().addClass("highlightBlock").css({ "text-align": "center" }).html("JavaScript version of Real-time Line Dual-Y Chart is not supported.");

			  }
			  else
			  {
			  	$(".chart-title").next().removeClass("highlightBlock").html("&nbsp;");
			  }
		});	
	 
	 </script>	 
 </html>
		