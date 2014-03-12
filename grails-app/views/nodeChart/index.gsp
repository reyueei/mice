<!DOCTYPE html>
<html>
<head>
	<title>Hello</title>
	<g:javascript src = "googleCharts/dygraph-combined.js" />

</head>
<body>
<h1>Hi</h1>
<div id="graphdiv2"
  style="width:500px; height:300px;"></div>
<script type="text/javascript">
  g2 = new Dygraph(
    document.getElementById("graphdiv2"),
    "temperatures.csv", // path to CSV file
    {}          // options
  );
</script>
</body>

</html>