<!DOCTYPE html>
<html>
<head>
	
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'style.css')}" type="text/css">
	<title>Hello</title>
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

 
 
 <div ic="container" width="100%">
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
   <li class='active'><a href="/mice/"><g:img dir="images" file="home.png" height="15px" width="15px" /><span style="font-size:15px">&nbsp Home</span></a></li>
   <li><a href="/mice/nodeChart/index"><g:img dir="images" file="graph.png" height="15px" width="15px" /><span style="font-size:15px">&nbsp Visualization</span></a></li>
   <li><a href="/mice/map/index"><g:img dir="images" file="map.png" height="15px" width="15px" /><span style="font-size:15px">&nbsp <span>Location</span></a></li>
   <li class='last'><a href="/mice/home/setting"><g:img dir="images" file="set.png" height="15px" width="15px" /><span style="font-size:15px">&nbsp <span>Settings</span></a></li>
   <li class='last'><a href="/mice/home/about"><g:img dir="images" file="aboutus.png" height="15px" width="15px" /><span style="font-size:15px">&nbsp <span>About Us</span></a></li>
</ul>
</div>
<div id="content" height="100px">



<div id="menu" align="center" style="background-color:#FFD700;height:400px;width:25%;float:left;padding-top:70px;">

<g:img dir="images" file="network-icon.png"/><br>
<p style="color:black">WiTMon uses scalable wireless sensor network and reliable data forwarding protocol to improve data delivery and acquisition.</p>
</div>

<div id="content" align="center" style="background-color:#ff66ff;height:400px;width:25%;float:left;padding-top:70px;">
<g:img dir="images" file="power-management-icon.png"/>
<p style="color:black">It can help lower maintenance cost, extend life of the transformer and avoid unplanned failures.</p>
</div>

<div id="content" align="center" style="background-color:#33ff33;height:400px;width:25%;float:left;padding-top:70px;">
<g:img dir="images" file="monitor-icon.png"/>
<p style="color:black">This provides the information and graphical presentation of the performance of the distribution transformer.</p>
</div>

<div id="content" align="center" style="background-color:#cc99ff;height:400px;width:25%;float:left;padding-top:70px;">
<g:img dir="images" file="energy-icon.png"/>
<p style="color:black">It does not only help save money but also we can save more energy.</p>
</div>


</div>

<div id="footer" style="background-color:#FFA500;position:fixed; clear:both;text-align:center;width:100%;bottom:0px">
&copy 2014 MICE</div>

</div>
</div>
 
 
 
 
 
</body>

</html>