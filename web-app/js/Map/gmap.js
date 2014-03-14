google.maps.event.addDomListener(window, 'load', function() {
  var canvas = document.getElementById("map-canvas");
  var mapOptions = {
    center: new google.maps.LatLng(9.849991099999999, 124.14354270000001),
    zoom:   7
  };

  var map = new google.maps.Map(canvas, mapOptions);
});