import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_mice_nodeChartrealtime_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nodeChart/realtime.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(3)
invokeTag('javascript','g',5,['src':("Charts/FusionCharts.js")],-1)
printHtmlPart(3)
invokeTag('javascript','g',6,['src':("Charts/jquery.min.js")],-1)
printHtmlPart(3)
invokeTag('javascript','g',7,['src':("Charts/prettify.js")],-1)
printHtmlPart(3)
invokeTag('javascript','g',8,['src':("Charts/json2.js")],-1)
printHtmlPart(3)
invokeTag('javascript','g',9,['src':("Charts/lib.js")],-1)
printHtmlPart(3)
invokeTag('javascript','g',10,['src':("Charts/date.js")],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',13,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('javascript','g',16,['src':("Charts/RTLineDY.js")],-1)
printHtmlPart(6)
expressionOut.print(resource(dir: 'swf', file: 'RealTimeLineDY.swf'))
printHtmlPart(7)
})
invokeTag('captureBody','sitemesh',57,[:],1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1395112847220L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
