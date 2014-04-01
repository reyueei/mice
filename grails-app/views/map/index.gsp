<!DOCTYPE html>
<html>
<head>
	
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'style.css')}" type="text/css">
	<title>Hello</title>
	 <style>
      #map_canvas {
        width: 100%;
        height: 100%;
      }
    </style>
    <script src="https://maps.googleapis.com/maps/api/js?sensor=false"></script>
    <script>
      function initialize() {
        var map_canvas = document.getElementById('map_canvas');
        var map_options = {
          center: new google.maps.LatLng(8.239462900000000000,124.244643199999930000),
          zoom: 8,
          mapTypeId: google.maps.MapTypeId.ROADMAP
        }
        var map = new google.maps.Map(map_canvas, map_options)
      }
      google.maps.event.addDomListener(window, 'load', initialize);
    </script>
	<style type='text/css' media='screen'>
	img {
	max-width: 100%;
	height: auto;
	}
	@media \0screen {
	  img { 
		width: auto; /* for ie 8 */
	  }
	}
	@import url(http://fonts.googleapis.com/css?family=PT+Sans:400,700);
	
	</style>
</head>
<body>

 
 
 <div id="container" width="100%">
<div id="header"   style="background-color:#0066cc;font-family:verdana;text-align:left;padding-top:5px;color:white;">
<div style="position:absolute;right:20px;padding:20px;height:75px; width:150px" align="center" method="post" action="">
				<sec:ifLoggedIn>
				Welcome Back! <b><sec:username/></b> <br/>
				<g:link controller='logout'>Logout</g:link>
				</sec:ifLoggedIn>
				<sec:ifNotLoggedIn>
				<g:link controller="login" action="auth">Login</g:link>
				</sec:ifNotLoggedIn>				
</div>
<g:img dir="images" file="combine.png" width="90px" height="90px" style="padding-left:20px; padding-top:10px; position:absolute;left:20px"/>
<h1 align="center;" style="padding-left:140px;">WiTMon</h1>
<p style="letter-spacing:8px;font-size:20px;padding-left:140px;">Wireless Distribution Transformer Monitoring System</p>
<div id='cssmenu'>
<ul>
   <li><a href="/mice/"><g:img dir="images" file="home.png" height="15px" width="15px" /><span style="font-size:15px">&nbsp Home</span></a></li>
   <li><a href="/mice/nodeChart/index"><g:img dir="images" file="graph.png" height="15px" width="15px" /><span style="font-size:15px">&nbsp Visualization</span></a></li>
   <li class='active'><a href="/mice/map/index"><g:img dir="images" file="map.png" height="15px" width="15px" /><span style="font-size:15px">&nbsp <span>Location</span></a></li>
   <li><a href="/mice/user"  target="_blank" ><g:img dir="images" file="set.png" height="15px" width="15px" /><span style="font-size:15px">&nbsp <span>Settings</span></a></li>
 <li class='last'><a href="/mice/home/about"><g:img dir="images" file="aboutus.png" height="15px" width="15px" /><span style="font-size:15px">&nbsp <span>About Us</span></a></li>
   </ul>
</div>
<div id="content" style="button:100%; height:500px;">
<br/> <div id="map_canvas"></div>
</div>

<div id="footer" style="background-color:#FFA500;position:fixed; clear:both;text-align:center;width:100%;bottom:0px">
&copy 2014 MICE</div>
</div>
</div>
 
 
 
 
 
</body>

</html>