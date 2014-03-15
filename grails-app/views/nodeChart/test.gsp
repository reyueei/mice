<html>
  <head>        
    <title>test</title>         

 
  </head>   
  <body>     
<g:each in="${result}">
    <tr>
        <td>${it.nodeLabel}</td>
        <td>${it.data}</td>
    </tr>
</g:each>
       
  </body> 
</html>

