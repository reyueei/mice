<html>
<head>
<g:set var="output">
<%-- Here we pull in our smart links, and capture them just for sake of demo page output --%>
<r:use module="test"/>
<!-- This is an adhoc resource, but already occurs in a module so should be no link generated -->
<r:resourceLink dir="css" file="default.css"/>
<!-- This is an adhoc resource, but is not in any module and should have a link -->
<r:resourceLink dir="css" file="undeclared.css"/>
</g:set>

    ${output}
</head>
<body>
    <h1>This is the resource test page</h1>
    <p>It produced the following output in the head section</p>
    <pre>
        ${output.encodeAsHTML()}
    </pre>
</body>
</html>