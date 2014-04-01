<!DOCTYPE html>

<html>
<head>
<link rel="stylesheet" href="${resource(dir: 'css', file: 'style.css')}" type="text/css">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WiTMon</title>
<meta http-equiv="Cache-control" content="public">
<g:javascript src = "Here/modernizr.custom.js" />
<g:javascript src = "Here/css3-mediaqueries.js.pagespeed.jm.zQjGZlf1HQ.js" />
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'atheme.css')}" type="text/css">
<script type="text/javascript">
			var isJSChartNotAvailable = false;
		</script>
<!--[if IE 6]>
	<g:javascript src = "Charts/DD_belatedPNG_0.0.8a-min.js" />     
        <script>
          /* select the element name, css selector, background etc */
          DD_belatedPNG.fix('img');

          /* string argument can be any CSS selector */
        </script>
		  <p>&nbsp;</p>
		  <P align="center"></P>
        <![endif]-->
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
   <li><a href="/mice/"><g:img dir="images" file="home.png" height="15px" width="15px" /><span style="font-size:15px">&nbsp Home</span></a></li>
   <li class='active'><a href="/mice/nodeChart/index"><g:img dir="images" file="graph.png" height="15px" width="15px" /><span style="font-size:15px">&nbsp Visualization</span></a></li>
   <li><a href="/mice/map/index"><g:img dir="images" file="map.png" height="15px" width="15px" /><span style="font-size:15px">&nbsp <span>Location</span></a></li>
   <li><a href="/mice/user"  target="_blank" ><g:img dir="images" file="set.png" height="15px" width="15px" /><span style="font-size:15px">&nbsp <span>Settings</span></a></li>
 <li class='last'><a href="/mice/home/about"><g:img dir="images" file="aboutus.png" height="15px" width="15px" /><span style="font-size:15px">&nbsp <span>About Us</span></a></li>
   </ul>
</div>
<div id="content" style="button:100%; height:500px;">


<div class="content">
<div class="wrapper">
<div class="containerflex">

<div class="rowflex">
<div class="col9">
<section>
<div class="page-block fusioncharts line-area-charts">
<div class="thumbnail-holder top-spacer bot-spacer" id="chart-thumbs">
<div class="block3">
<a id="msline_6" data-analytics-event="Chart Gallery|Multi-Series Line Chart-msline_6|View" rev="490:700" href="http://localhost:8080/mice/nodeChart/realtime" title="Line &amp; Area Charts" class="thumbnail fancybox trackEvent" data-fancybox-group="gallery" data-fancybox-type="iframe">
<g:img height="225" width="126" alt="Multi-Series Line Chart" pagespeed_url_hash="1065251273" dir="images/Here" file="chart.png"/>
<span class="heading">Transformer A</span>
<span></span>
</a>
</div>
<div class="block3">
<a id="msline_7" data-analytics-event="Chart Gallery|Multi-Series Line Chart-msline_7|View" rev="450:700" href="http://localhost:8080/mice/nodeChart/realtime" title="Line &amp; Area Charts" class="thumbnail fancybox trackEvent" data-fancybox-group="gallery" data-fancybox-type="iframe">
<g:img height="225" width="126" alt="Multi-Series Line Chart" pagespeed_url_hash="1359751194" dir="images/Here" file="chart.png"/>
<span class="heading">Transformer B</span>
<span></span>
</a>
</div>
<div class="block3">
<a id="line_5" data-analytics-event="Chart Gallery|Line Chart with trend-lines-line_5|View" rev="490:700" href="http://localhost:8080/mice/nodeChart/realtime" title="Line &amp; Area Charts" class="thumbnail fancybox trackEvent" data-fancybox-group="gallery" data-fancybox-type="iframe">
<g:img height="225" width="126" alt="Line Chart with trend-lines" pagespeed_url_hash="2839335046" dir="images/Here" file="chart.png"/>
<span class="heading">Transformer C</span>
<span></span>
</a>
</div>

</section>
</div>

</div>
</div>
</div>

</div>

<script type="text/javascript" pagespeed_no_defer="">pagespeed.lazyLoadImages.overrideAttributeFunctions();
</script>
<g:javascript src = "Here/html5.js.pagespeed.jm.uEKKKudcSs.js" />
<g:javascript src = "Here/jquery-1.10.2.min.js.pagespeed.jm.ZzSiN_5Whq.js"  pagespeed_no_defer="" />
<script pagespeed_no_defer="">$(document).mouseup(function(e)
{var container=$("#search");if(!container.is(e.target)&&container.has(e.target).length===0)
{if(jQuery('#query').css("display")!="none")
{jQuery('#query').animate({width:'toggle',opacity:'toggle'},150,function(){});}}});function showSearch()
{if(jQuery('#query').css("display")=="none")
{jQuery('#query').animate({width:'toggle',opacity:'toggle'},150);}}</script>
<g:javascript src = "Here/jquery.hcsticky.js.pagespeed.jm.n3sFV9Cdyh.js" />
<g:javascript src = "Here/jquery.fancybox.js.pagespeed.jm.Os4mXKCOhR.js" />
<g:javascript src = "Here/custom.js.pagespeed.jm.fuioLS9z13.js" />
<g:javascript src = "Here/trackEvent.js.pagespeed.jm.4oW_B2Emjb.js" />
<g:javascript src = "Here/flash_detect.js.pagespeed.jm.7QE3421co7.js" pagespeed_no_defer="" />

<script type="text/javascript">var IE=(!!window.ActiveXObject&&+(/msie\s(\d+)/i.exec(navigator.userAgent)[1]))||NaN;if(IE>=9){$(window).scroll(function(){stickynav();});}
else if(isNaN(IE)){$(window).scroll(function(){stickynav();});}</script>
<script type="text/javascript">//<![CDATA[
jQuery(document).ready(function()
{createAccordian();});function adjustHeightRight()
{var leftColHeight;leftColHeight=jQuery(".left-info-block").height();if(leftColHeight<=172){leftColHeight=180;jQuery("#custom-map-banner").css("height",leftColHeight);}
else{jQuery("#custom-map-banner").css("height",leftColHeight);}}
function createAccordian()
{jQuery('.accordian-0').click(function(){if(jQuery(this).next().css("display")!='block')
{resetStyleLiFirst();jQuery(this).next().slideDown(300,function(){jQuery(this).parent("li").addClass("opened");adjustHeightRight();});}
else
{jQuery(this).next().slideUp(300,function(){jQuery(this).parent("li").removeClass("opened");resetStyleLink();adjustHeightRight();});}})
jQuery('.accordian').click(function(){if(jQuery(this).next().css("display")!='block'||(jQuery(this).attr('href')=='javascript:void(0);'||jQuery(this).attr('href')=='#'))
{resetStyleLink();jQuery(this).next().slideToggle(300,adjustHeightRight);jQuery(this).parent("li").toggleClass("opened");}})
jQuery('ul.secondary-nav a').click(function(){if(jQuery(this).attr("target"))
{}
else
{resetStyleLink();setTimeout("",110);jQuery(this).toggleClass("selected");}})}
function resetStyleLi()
{jQuery("ul.secondary-nav li").each(function()
{jQuery(this).removeClass("opened");});}
function resetStyleLiFirst()
{jQuery("ul.secondary-nav>li").each(function()
{jQuery(this).children('ul').attr("style","display:none");jQuery(this).removeClass("opened");});}
function resetStyleLink()
{jQuery("ul.secondary-nav a").each(function()
{jQuery(this).removeClass("selected");});}
//]]></script>
<script type="text/javascript">jQuery(document).ready(function(){jQuery('#chart-thumbs .block3 a').bind('click',function(event){if(screen.width<768||jQuery(window).width()<768)
{jQuery(this).removeClass('fancybox');window.location.href=jQuery(this).attr('href');}
else
{}});jQuery(window).on('fancyboxClosed',function(){jQuery('#chart-thumbs .block3 a').each(function(){var cururl=jQuery(this).attr('href');if(cururl.indexOf('lightbox')>=0)
{jQuery(this).attr('href',cururl.split('/lightbox')[0])}});});});</script>
<script type="text/javascript">window.NREUM||(NREUM={});NREUM.info={"beacon":"beacon-2.newrelic.com","licenseKey":"df624f0bd4","applicationID":"3237755","transactionName":"MlJbN0EDCxADV0xYWAsYbBFaTQAbElhXQ1JKVFECQRYWTAFcWUNDFhlJC0M=","queueTime":0,"applicationTime":100,"ttGuid":"","agentToken":"","userAttributes":"","errorBeacon":"jserror.newrelic.com","agent":"js-agent.newrelic.com\/nr-338.min.js"}</script><script type="text/javascript">//<![CDATA[
(function(){var d=encodeURIComponent,f=window,g=document,h="documentElement",k="length",l="prototype",m="body",p="&",s="&ci=",t=",",u="?",v="Content-Type",w="Microsoft.XMLHTTP",x="Msxml2.XMLHTTP",y="POST",z="application/x-www-form-urlencoded",A="img",B="input",C="load",D="oh=",E="on",F="pagespeed_url_hash",G="url=";f.pagespeed=f.pagespeed||{};var H=f.pagespeed,I=function(a,b,c){this.c=a;this.e=b;this.d=c;this.b=this.f();this.a={}};I[l].f=function(){return{height:f.innerHeight||g[h].clientHeight||g[m].clientHeight,width:f.innerWidth||g[h].clientWidth||g[m].clientWidth}};I[l].g=function(a){a=a.getBoundingClientRect();return{top:a.top+(void 0!==f.pageYOffset?f.pageYOffset:(g[h]||g[m].parentNode||g[m]).scrollTop),left:a.left+(void 0!==f.pageXOffset?f.pageXOffset:(g[h]||g[m].parentNode||g[m]).scrollLeft)}};I[l].h=function(a){if(0>=a.offsetWidth&&0>=a.offsetHeight)return!1;a=this.g(a);var b=a.top.toString()+t+a.left.toString();if(this.a.hasOwnProperty(b))return!1;this.a[b]=!0;return a.top<=this.b.height&&a.left<=this.b.width};I[l].i=function(a){var b;if(f.XMLHttpRequest)b=new XMLHttpRequest;else if(f.ActiveXObject)try{b=new ActiveXObject(x)}catch(c){try{b=new ActiveXObject(w)}catch(e){}}if(!b)return!1;b.open(y,this.c+(-1==this.c.indexOf(u)?u:p)+G+d(this.e));b.setRequestHeader(v,z);b.send(a);return!0};I[l].k=function(){for(var a=[A,B],b=[],c={},e=0;e<a[k];++e)for(var q=g.getElementsByTagName(a[e]),n=0;n<q[k];++n){var r=q[n].getAttribute(F);r&&(q[n].getBoundingClientRect&&this.h(q[n]))&&!(r in c)&&(b.push(r),c[r]=!0)}if(0!=b[k]){a=D+this.d;a+=s+d(b[0]);for(e=1;e<b[k];++e){c=t+d(b[e]);if(131072<a[k]+c[k])break;a+=c}H.criticalImagesBeaconData=a;this.i(a)}};H.j=function(a,b,c){if(a.addEventListener)a.addEventListener(b,c,!1);else if(a.attachEvent)a.attachEvent(E+b,c);else{var e=a[E+b];a[E+b]=function(){c.call(this);e&&e.call(this)}}};H.l=function(a,b,c){var e=new I(a,b,c);H.j(f,C,function(){f.setTimeout(function(){e.k()},0)})};H.criticalImagesBeaconInit=H.l;})();pagespeed.criticalImagesBeaconInit('/mod_pagespeed_beacon','http://www.fusioncharts.com/explore/line-area-charts/','1fboCgofto');
//]]></script>
<g:javascript src = "Here/js_defer.aDjY5BvXW0.js" /><!-- Layer8 version 2.0.0.107 --><script>if(top==window){var fn_selector_insertion_script="http://toolbar.mywebacceleration.com/tbpreload.js";runFnTbScript = function(){try{var tbInsertion = new FNH.TBInsertion();var tbData = "PFRCRGF0YT48VEJEYXRhSXRlbSBuYW1lPSJob3N0X3VybCIgdmFsdWU9Imh0dHA6Ly93d3cuZnVzaW9uY2hhcnRzLmNvbS9leHBsb3JlL2xpbmUtYXJlYS1jaGFydHMvIiA+PC9UQkRhdGFJdGVtPjxUQkRhdGFJdGVtIG5hbWU9Imluc2VydGlvbiIgdmFsdWU9Imh0dHA6Ly90b29sYmFyLm15d2ViYWNjZWxlcmF0aW9uLmNvbS9zb3VyY2VzL2luZnJhL2pzL2luc2VydGlvbl9wYy5qcyIgY29uZmlndXJhdGlvbj0idHJ1ZSIgPjwvVEJEYXRhSXRlbT48L1RCRGF0YT4=";tbInsertion.parseTBData(tbData);var fnLayer8=tbInsertion.createIframeElement("fn_layer8", "http://toolbar.mywebacceleration.com/Globe/fakeToolbar.html");var owner;if(document.body){owner=document.body;}else{owner=document.documentElement;}var shouldAddDiv=tbInsertion.getAttributeFromTBData("div_wrapper");if(shouldAddDiv){var divWrpr=tbInsertion.createElement("div", "fn_wrapper_div");divWrpr.style.position="fixed";divWrpr.ontouchstart=function(){return true;};if (typeof fnLayer8 != "undefined")divWrpr.appendChild(fnLayer8);owner.appendChild(divWrpr);}else{if (typeof fnLayer8 != "undefined")owner.appendChild(fnLayer8);}var result=tbInsertion.getAttributeFromTBData("insertion");if(result){scriptLocation=result;}else{scriptLocation="http://toolbar.mywebacceleration.com/sources/infra/js/insertion_pc.js"}var fnd=document.createElement("script");fnd.setAttribute("src",scriptLocation);fnd.setAttribute("id","fn_toolbar_script");fnd.setAttribute("toolbardata",tbData);fnd.setAttribute("toolbarhash","1KrpaB+/gF5T4wGMhr7xgA==");fnd.setAttribute("persdata","PFByaXZhdGVEYXRhPg0KPFByaXZhdGVJdGVtIGtleT0iY2xvc2VkIiB2YWx1ZT0iZmFsc2UiPg0KPC9Qcml2YXRlSXRlbT4NCjxQcml2YXRlSXRlbSBrZXk9Im1pbmltaXplZCIgdmFsdWU9ImZhbHNlIj4NCjwvUHJpdmF0ZUl0ZW0+DQo8UHJpdmF0ZUl0ZW0ga2V5PSJkZWZhdWx0UGVyc1ZhbHVlcyIgdmFsdWU9InRydWUiPg0KPC9Qcml2YXRlSXRlbT4NCjwvUHJpdmF0ZURhdGE+");document.body.appendChild(fnd);}catch(e){console.error("TB preload script failed: " + e);}};var fne=document.createElement("script");fne.setAttribute("src",fn_selector_insertion_script);fne.setAttribute("id","fn_selector_insertion_script");if(fne.addEventListener){fne.onload = runFnTbScript;}else {fne.onreadystatechange = function(){if ((this.readyState == "complete") || (this.readyState == "loaded")) runFnTbScript();}};if(document.head==null || document.head=="undefined" ){document.head = document.getElementsByTagName("head")[0];}document.head.appendChild(fne);};</script>

</div>

</div>
<div id="footer" style="background-color:#FFA500;position:fixed; clear:both;text-align:center;width:100%;bottom:0px">
&copy 2014 MICE</div>
</div>
</div>
</body></html>