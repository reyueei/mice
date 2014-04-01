import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='zipped-resources', version='1.0.1')
class gsp_zippedResourcesindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/zipped-resources-1.0.1/grails-app/views/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(2)
invokeTag('use','r',4,['module':("test")],-1)
printHtmlPart(3)
invokeTag('resourceLink','r',6,['dir':("css"),'file':("default.css")],-1)
printHtmlPart(4)
invokeTag('resourceLink','r',8,['dir':("css"),'file':("undeclared.css")],-1)
printHtmlPart(1)
})
invokeTag('set','g',8,['var':("output")],2)
printHtmlPart(5)
expressionOut.print(output)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(6)
expressionOut.print(output.encodeAsHTML())
printHtmlPart(7)
})
invokeTag('captureBody','sitemesh',16,[:],1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1328334288000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
