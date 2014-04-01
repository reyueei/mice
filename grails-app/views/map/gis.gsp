<!DOCTYPE html>
<html>
<head>
	
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'style.css')}" type="text/css">
	<title>WiTmon</title>
	
    <script src="http://openlayers.org/dev/OpenLayers.js"></script>
     <script type="text/javascript">
            var lat=8.24118;
            var lon=124.24520;
            var zoom=18;
            var map;
 
            function init(){
                map = new OpenLayers.Map ("map");
 
                map.addControl(new OpenLayers.Control.LayerSwitcher());
                
                map.addLayer(new OpenLayers.Layer.OSM()); //OSM base map
 
                var lonLat = new OpenLayers.LonLat(lon, lat).transform(new OpenLayers.Projection("EPSG:4326"), new OpenLayers.Projection("EPSG:900913"));
 
                map.setCenter (lonLat, zoom);

                //Initialise the vector layer using OpenLayers.Format.OSM
                var layer = new OpenLayers.Layer.Vector("Polygon", {
                    strategies: [new OpenLayers.Strategy.Fixed()],
                    protocol: new OpenLayers.Protocol.HTTP({
                        url: "${resource(dir: 'OUTPUT', file: 'map.osm')}",   //<-- relative or absolute URL to your .osm file
                        format: new OpenLayers.Format.OSM()
                    }),
                    projection: new OpenLayers.Projection("EPSG:4326")
                });
 
                map.addLayers([layer]);
            }
        </script>
</head>
<body onload="init()">
<div id="map"></div>
  
 
 
</body>

</html>