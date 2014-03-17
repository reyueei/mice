var deviceAgent=navigator.userAgent.toLowerCase();var isTouchDevice=Modernizr.touch||(deviceAgent.match(/(iphone|ipod|ipad)/)||deviceAgent.match(/(android)/)||deviceAgent.match(/(iemobile)/)||deviceAgent.match(/iphone/i)||deviceAgent.match(/ipad/i)||deviceAgent.match(/ipod/i)||deviceAgent.match(/blackberry/i)||deviceAgent.match(/bada/i));function viewport()
{var e=window,a='inner';if(!('innerWidth'in window))
{a='client';e=document.documentElement||document.body;}
return{width:e[a+'Width'],height:e[a+'Height']}}
var startTimeFB,endTimeFB,diffFB;function showInFancyBox(){jQuery(".fancybox").fancybox({wrapCSS:'chartfancy',nextEffect:'none',prevEffect:'none',padding:25,autoSize:false,scrolling:'no',autoScale:false,fitToView:false,helpers:{title:{type:'outside'},buttons:{},overlay:{locked:false}},beforeLoad:function(){startTimeFB=new Date().valueOf();var url=this.href;url=url+"/lightbox";this.href=url;},afterLoad:function(){},beforeShow:function(current,previous){this.title=(this.title?this.title+' - ':'')+'('+(this.index+1)+'/'+this.group.length+')';var rev=$(this.element).attr('rev');var height=rev.split(':')[0];var width=rev.split(':')[1];if(width<584)
this.width=584;else
this.width=parseInt(width)+50;this.width=this.width+50;this.height=parseInt(height)+85;},beforeClose:function(){$(window).trigger('fancyboxClosed');},onNext:function(){var eventArray=Array();eventArray=convertToEventArray($(this.element).attr('data-analytics-event'));var rev=$(this.element).attr('rev');var height=rev.split(':')[0];var width=rev.split(':')[1];if(width<584)
this.width=584;else
this.width=parseInt(width)+100;this.width=this.width+50;this.height=parseInt(height)+100;if(typeof(_gaq)=="object")
{try{_gaq.push(['_trackEvent',eventArray['category'],eventArray['action'],eventArray['label']]);}
catch(e)
{return;}}},onPrev:function(){var eventArray=Array();eventArray=convertToEventArray($(this.element).attr('data-analytics-event'));var rev=$(this.element).attr('rev');var height=rev.split(':')[0];var width=rev.split(':')[1];if(width<584)
this.width=584;else
this.width=parseInt(width)+100;this.width=this.width+50;this.height=parseInt(height)+100;if(typeof(_gaq)=="object")
{try{_gaq.push(['_trackEvent',eventArray['category'],eventArray['action'],eventArray['label']]);}
catch(e)
{return;}}}});}
function formInFancyBox(){jQuery(".fancyform").fancybox({wrapCSS:'chartfancy',padding:25,nextEffect:'none',prevEffect:'none',autoSize:false,scrolling:'no',autoScale:false,fitToView:false,helpers:{title:{type:'inside'},buttons:{},overlay:{locked:false}},beforeLoad:function(current,previous){urlArr=this.href.split("?");if(this.href.match("/strategic-consulting/contact/"))
this.href='/about/strategic-consulting/contact/indexbarebone.php?'+urlArr[1];if(this.href.match("/contact/sales"))
this.href='/contact/sales/indexbarebone.php?'+urlArr[1];if(this.href.match("/contact/support"))
this.href='/contact/support/indexbarebone.php';if(this.href.match("/contact/job"))
this.href='/contact/job/indexbarebone.php';if(this.href.match("/contact/press"))
this.href='/contact/press-enquiry/indexbarebone.php';},afterLoad:function(current,previous){var rev=$(this.element).attr('rev');var height=rev.split(':')[0];var width=rev.split(':')[1];this.height=parseInt(height);this.width=parseInt(width);}});}
function longContentFancyBox(){jQuery(".fancylongcontent").fancybox({wrapCSS:'chartfancy',padding:40,nextEffect:'none',prevEffect:'none',autoSize:false,scrolling:'no',autoScale:false,fitToView:false,helpers:{title:{type:'inside'},buttons:{},overlay:{locked:false}},afterLoad:function(current,previous){var rev=$(this.element).attr('rev');var height=rev.split(':')[0];var width=rev.split(':')[1];this.height=parseInt(height);this.width=parseInt(width);}});}
function leftshareslide(){jQuery(window).scroll(function(){jQuery('#shareholder').stop().animate({"marginTop":jQuery(window).scrollTop()},0);});};function bottomshareslide(){$(window).bind('scroll',function(e){var iWindowHeight=window.innerHeight;var iScrollPosition=window.pageYOffset;jQuery('#smalldeviceshare').stop().animate({'top':iWindowHeight+iScrollPosition-100},0);});};(function($){var settings={combine:true,groupPageText:'Main',nested:true,prependTo:'#sec-nav',switchWidth:767,topOptionText:'Select a page'},$menus,menuCount=0,uniqueLinks=[];function goTo(url){document.location.href=url;}
function menuExists(){return($('.mnav').length)?true:false;}
function isList($this){var pass=true;$this.each(function(){if(!$(this).is('ul')&&!$(this).is('ol')){pass=false;}});return pass;}
function isMobile(){return($(window).width()<settings.switchWidth);}
function getText($item){return $.trim($item.clone().children('ul, ol').remove().end().text());}
function isUrlUnique(url){return($.inArray(url,uniqueLinks)===-1)?true:false;}
function checkForDuplicates($menu){$menu.find(' > li').each(function(){var $li=$(this),link=$li.find('a').attr('href'),parentLink=function(){if($li.parent().parent().is('li')){return $li.parent().parent().find('a').attr('href');}else{return null;}};if($li.find(' ul, ol').length){checkForDuplicates($li.find('> ul, > ol'));}
if(!$li.find(' > ul li, > ol li').length){$li.find('ul, ol').remove();}
if(!isUrlUnique(parentLink(),uniqueLinks)&&isUrlUnique(link,uniqueLinks)){$li.appendTo($menu.closest('ul#mmnav').find('li:has(a[href='+parentLink()+']):first ul'));}
else if(isUrlUnique(link)){uniqueLinks.push(link);}
else{$li.remove();}});}
function combineLists(){var $menu=$('<ul id="mmnav" />');$menus.each(function(){$(this).children().clone().appendTo($menu);});checkForDuplicates($menu);return $menu;}
function createOption($item,$container,text){if(!text){$('<option value="'+$item.find('a:first').attr('href')+'">'+$.trim(getText($item))+'</option>').appendTo($container);}else{$('<option value="'+$item.find('a:first').attr('href')+'">'+text+'</option>').appendTo($container);}}
function createOptionGroup($group,$container){var $optgroup=$('<optgroup label="'+$.trim(getText($group))+'" />');createOption($group,$optgroup,settings.groupPageText);$group.children('ul, ol').each(function(){$(this).children('li').each(function(){createOption($(this),$optgroup);});});$optgroup.appendTo($container);}
function createSelect($menu){var $select=$('<select id="mm'+menuCount+'" class="mnav" />');menuCount++;if(settings.topOptionText){createOption($('<li>'+settings.topOptionText+'</li>'),$select);}
$menu.children('li').each(function(){var $li=$(this);if($li.children('ul, ol').length&&settings.nested){createOptionGroup($li,$select);}
else{createOption($li,$select);}});$select.change(function(){goTo($(this).val());}).prependTo(settings.prependTo);}
function runPlugin(){if(isMobile()&&!menuExists()){if(settings.combine){var $menu=combineLists();createSelect($menu);}
else{$menus.each(function(){createSelect($(this));});}}
if(isMobile()&&menuExists()){$('.mnav').show();$menus.hide();}
if(!isMobile()&&menuExists()){$('.mnav').hide();$menus.show();}}
$.fn.mobileMenu=function(options){if(options){$.extend(settings,options);}
if(isList($(this))){$menus=$(this);runPlugin();$(window).resize(function(){runPlugin();});}else{alert('mobileMenu only works with <ul>/<ol>');}};})(jQuery);;(function($,window,document,undefined)
{$.fn.doubleTapToGo=function(params)
{if(!('ontouchstart'in window)&&!navigator.msMaxTouchPoints&&!navigator.userAgent.toLowerCase().match(/windows phone os 7/i))return false;this.each(function()
{var curItem=false;$(this).on('click',function(e)
{var item=$(this);if(item[0]!=curItem[0])
{e.preventDefault();curItem=item;}});$(document).on('click touchstart MSPointerDown',function(e)
{var resetItem=true,parents=$(e.target).parents();for(var i=0;i<parents.length;i++)
if(parents[i]==curItem[0])
resetItem=false;if(resetItem)
curItem=false;});});return this;};})(jQuery,window,document);equalheight=function(container){var currentTallest=0,currentRowStart=0,rowDivs=new Array(),$el,topPosition=0;$(container).each(function(){$el=$(this);$($el).height('auto')
topPostion=$el.position().top;if(currentRowStart!=topPostion){for(currentDiv=0;currentDiv<rowDivs.length;currentDiv++){rowDivs[currentDiv].height(currentTallest);}
rowDivs.length=0;currentRowStart=topPostion;currentTallest=$el.height();rowDivs.push($el);}else{rowDivs.push($el);currentTallest=(currentTallest<$el.height())?($el.height()):(currentTallest);}
for(currentDiv=0;currentDiv<rowDivs.length;currentDiv++){rowDivs[currentDiv].height(currentTallest);}});}
function jumpNav(){$('#jump-menu').change(function(){document.location.href=this.value;});}
function stickynav(){if(ws>=767){$('#sec-nav').hcSticky({noContainer:true,top:50});$('.nav-container').hcSticky({noContainer:true});}}
function equalWidthHeight(){var w=$(this).width();$(this).css('height',w);}
$(document).ready(function(){ws=document.body.clientWidth;if(ws<1199){$(".timeline").children("li").css('height','auto');}
else{$(".timeline").children("li").each(equalWidthHeight);}
$(window).on('resize orientationchange',function(){ws=document.body.clientWidth;checkdevice();if(ws<1199){$(".timeline").children("li").css('height','auto');}
else{$(".timeline").children("li").each(equalWidthHeight);}});$(".subnav li").mouseout(function(){$(this).parent('.hover').removeClass('.hover');});function toggleElement()
{jQuery('.collapsible h6').click(function(){var ele=jQuery(this).next('.detail');var show=jQuery(this).next('.detail').css('display');if(show=='none'){ele.fadeIn('fast');}
else{ele.fadeOut('fast');}});}
if(typeof(jQuery(".fancybox"))=='object'&&jQuery(".fancybox")!==null&&jQuery(".fancybox").html()!==null&&jQuery(".fancybox").length>0&&typeof $.fancybox=='function')
showInFancyBox();if(typeof(jQuery(".fancylongcontent"))=='object'&&jQuery(".fancylongcontent")!==null&&jQuery(".fancylongcontent").html()!==null&&jQuery(".fancylongcontent").length>0&&typeof $.fancybox=='function')
longContentFancyBox();if(typeof(jQuery(".fancyform"))=='object'&&jQuery(".fancyform")!==null&&jQuery(".fancyform").html()!==null&&jQuery(".fancyform").length>0&&typeof $.fancybox=='function')
formInFancyBox();if(typeof(jQuery("#main-navigation"))=='object'&&jQuery("#main-navigation")!==null&&jQuery("#main-navigation").html()!==null&&jQuery("#main-navigation").length>0)
$('#main-navigation').mobileMenu();if(typeof(jQuery("#jump-menu"))=='object'&&jQuery("#jump-menu")!==null&&jQuery("#jump-menu").html()!==null&&jQuery("#jump-menu").length>0)
jumpNav();if(typeof(jQuery(".collapsible"))=='object'&&jQuery(".collapsible")!==null&&jQuery(".collapsible").html()!==null&&jQuery(".collapsible").length>0)
toggleElement();if(typeof(jQuery("#shareholder"))=='object'&&jQuery("#shareholder")!==null&&jQuery("#shareholder").length>0)
leftshareslide();if(typeof(jQuery("#smalldeviceshare"))=='object'&&jQuery(".action_btn")!==null&&jQuery("#smalldeviceshare").length>0)
bottomshareslide();function checkdevice(){if(ws<767){$('body').addClass('device');}
else{$('body').removeClass('device');}}
var $menu=$('#nav'),$menulink=$('.menu-link'),$menuTrigger=$('.has-submenu > a');$menulink.click(function(e){if((isTouchDevice)||(ws<767)){e.preventDefault();}
$menulink.toggleClass('active');$menu.toggleClass('active');});$menuTrigger.click(function(e){if((isTouchDevice)||(ws<767)){e.preventDefault();}
var $this=$(this);$this.toggleClass('active').next('ul').toggleClass('active');});$(window).load(function(){equalheight('#myTab .block3 a');equalheight('.equal-height-block article.well');equalheight('.equal-height-block .block3');equalheight('.equal-height-block .equal-height');checkdevice();});$(window).resize(function(){equalheight('#myTab .block3 a');equalheight('.equal-height-block article.well');equalheight('.equal-height-block .block3');equalheight('.equal-height-block .equal-height');checkdevice();});});