function convertToEventArray(dataVal)
{var eventArr=Array();var eventArrFinal=Array();eventArr=dataVal.split("|");for(key in eventArr)
{var cat="";if(key==0)
cat="category";if(key==1)
cat="action";if(key==2)
cat="label";eventArrFinal[cat]=eventArr[key]}
return eventArrFinal;}
function changeEventLabel(obj,submitId)
{eventArray=convertToEventArray($('#'+submitId).attr("data-analytics-event"));var action="Other";if(obj.value.toLowerCase().indexOf("saas")!=-1)
{action="SaaS";}
if(obj.value.toLowerCase().indexOf("rdl")!=-1)
{action="RDL";}
if(obj.value.toLowerCase().indexOf("offline")!=-1)
{action="Offline Payment";}
if(obj.value.toLowerCase().indexOf("corporate-website-quote")!=-1)
{action="Website/Intranet";}
$('#'+submitId).attr("data-analytics-event",eventArray['category']+'|'+action+"|Form Completed");}
jQuery('.trackEvent').on("click",function(e)
{var eventArray=Array();eventArray=convertToEventArray($(this).attr("data-analytics-event"));if(typeof(_gaq)=="object")
{try{_gaq.push(['_trackEvent',eventArray['category'],eventArray['action'],eventArray['label']]);}
catch(e)
{return;}}});jQuery('.trackEvent2').on("click",function(e)
{var eventArray=Array();eventArray=convertToEventArray($(this).attr("data-analytics-event"));if(typeof(_gaq)=="object")
{try{_gaq.push(['_trackEvent',eventArray['category'],eventArray['action'],eventArray['label']]);_gaq.push(['_trackEvent',"Conversion Rates - Downloads","Download Trial","One or more products downloaded"]);}
catch(e)
{return;}}});function sendFocusEvents(formId,submitId)
{var eventArray="";$('#'+formId+' input').focus(function(){eventArray=convertToEventArray($('#'+submitId).attr("data-analytics-event"));if(eventArray['category']=="Conversion Rates - Sales Forms (Lightbox)")
{eventArray=convertToEventArray($('#'+submitId).attr("data-analytics-event-query"));}
if(typeof(_gaq)=="object")
{try{if(eventArray['category']=="Conversion Rates - Sales Forms (Lightbox)")
_gaq.push(['_trackEvent',eventArray['category'],"Focus on form",eventArray['label']]);else if(eventArray['category']=="Conversion Rates - Downloads")
_gaq.push(['_trackEvent',eventArray['category'],eventArray['action'],"Focus on form"]);else
_gaq.push(['_trackEvent',eventArray['category'],eventArray['action'],"Focus on form"]);}
catch(e)
{return;}}});$('#'+formId+' textarea').focus(function(){eventArray=convertToEventArray($('#'+submitId).attr("data-analytics-event"));if(eventArray['category']=="Conversion Rates - Sales Forms (Lightbox)")
{eventArray=convertToEventArray($('#'+submitId).attr("data-analytics-event-query"));}
if(typeof(_gaq)=="object")
{try{if(eventArray['category']=="Conversion Rates - Sales Forms (Lightbox)")
_gaq.push(['_trackEvent',eventArray['category'],"Focus on form",eventArray['label']]);else
_gaq.push(['_trackEvent',eventArray['category'],eventArray['action'],"Focus on form"]);}
catch(e)
{return;}}});$('#'+formId+' select').focus(function(){eventArray=convertToEventArray($('#'+submitId).attr("data-analytics-event"));if(eventArray['category']=="Conversion Rates - Sales Forms (Lightbox)")
{eventArray=convertToEventArray($('#'+submitId).attr("data-analytics-event-query"));}
if(typeof(_gaq)=="object")
{try{if(eventArray['category']=="Conversion Rates - Sales Forms (Lightbox)")
_gaq.push(['_trackEvent',eventArray['category'],"Focus on form",eventArray['label']]);else
_gaq.push(['_trackEvent',eventArray['category'],eventArray['action'],"Focus on form"]);}
catch(e)
{return;}}});}
jQuery(document).ready(function(){if(typeof($('#submitButtonSaaS').attr("data-analytics-event"))=="string")
sendFocusEvents('contact-form-saas','submitButtonSaaS');if(typeof($('#submitButtonRdl').attr("data-analytics-event"))=="string")
sendFocusEvents('contact-form-rdl','submitButtonRdl');if(typeof($('#submitButtonSalesBareBone').attr("data-analytics-event"))=="string")
sendFocusEvents('contact-sales','submitButtonSalesBareBone');if(typeof($('#submitButtonSales').attr("data-analytics-event"))=="string")
sendFocusEvents('contact-sales','submitButtonSales');if(typeof($('.downloadForm').attr("data-analytics-event"))=="string")
sendFocusEvents('Download','submitButton');});jQuery('.trackEvent3').on("click",function(e)
{var eventArray=Array();eventArray=convertToEventArray($(this).attr("data-analytics-event"));if(typeof(_gaq)=="object")
{try{if(eventArray['action']=="SaaS")
_gaq.push(['_trackEvent',"Conversion Rates - Sales Forms (embedded)","SaaS","Tab Clicked"]);if(eventArray['action']=="RDL")
_gaq.push(['_trackEvent',"Conversion Rates - Sales Forms (embedded)","RDL","Tab Clicked"]);_gaq.push(['_trackEvent',eventArray['category'],eventArray['action'],eventArray['label']]);}
catch(e)
{return;}}});