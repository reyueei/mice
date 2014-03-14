<%@ page import="grails.plugin.springsecurity.SpringSecurityUtils" %>
<html>
<head>
	<title>Hello</title>
</head>
<body>
<h1>Hi</h1>

<sec:ifLoggedIn>
				Welcome Back! <b><sec:username/></b> (<g:link controller='logout'>Logout</g:link>)
				</sec:ifLoggedIn>
<p></p>				

 <a href="/mice/nodeChart/index" >View Charts</a>         
<p></p>
 <a href="/mice/home/index" >Home</a>        
 <p></p>
 <a href="" >Locate Nodes</a>    
 <p></p>
 <a href="/mice/home/setting" >Setting(Admin Only)</a>        
 
</body>

</html>