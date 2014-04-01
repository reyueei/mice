<!DOCTYPE html>
<html>
<head>

	<title>Welcone to WiTMon</title>
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
	</style>
</head>
<body>
<div ic="container" width="100%">
<div id="header"   style="background-color:#0066cc;font-family:verdana;text-align:left;padding-top:5px;color:white;">
<sec:ifLoggedIn>
				Welcome Back! <b><sec:username/></b> <g:link controller='logout'>Logout</g:link>
				</sec:ifLoggedIn>		
				
				<sec:ifNotLoggedIn>
				<form action='${postUrl}' method='POST' id='loginForm' class='cssform' autocomplete='off' style="position:absolute;right:20px; " align="center">
			<br/>
				<input type='text' class='text_' name='j_username' placeholder="Username" id='username'/>
			<br/>	
				<input type='password' class='text_' name='j_password'  placeholder="Password" id='password'/>
			<br/>
			<p id="remember_me_holder">
				<input type='checkbox' class='chk' name='${rememberMeParameter}' id='remember_me' <g:if test='${hasCookie}'>checked='checked'</g:if>/>
				<input type='submit' id="submit" value='${message(code: "springSecurity.login.button")}'/>
		<br/>
		</form>
				</sec:ifNotLoggedIn>


<g:img dir="images" file="combine.png" width="90px" height="90px" style="padding-left:20px; padding-top:10px; position:absolute;left:20px"/>
<h1 align="center;" style="padding-left:140px;">WiTMon</h1>
<p style="letter-spacing:8px;font-size:20px;padding-left:140px;">Wireless Distribution Transformer Monitoring System</p>
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
<div id="content" style="button:100%; height:700px;">
</div>
<div id="footer" style="background-color:#FFA500;position:fixed; clear:both;text-align:center;width:100%;bottom:0px">
&copy 2014 MICE</div>

</div>
</div>
</body>

</html>