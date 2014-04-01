import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_mice_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
expressionOut.print(resource(dir: 'css', file: 'style.css'))
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',20,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('username','sec',29,[:],-1)
printHtmlPart(8)
createClosureForHtmlPart(9, 3)
invokeTag('link','g',30,['controller':("logout")],3)
printHtmlPart(10)
})
invokeTag('ifLoggedIn','sec',31,[:],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(10)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',33,['controller':("login"),'action':("auth")],3)
printHtmlPart(10)
})
invokeTag('ifNotLoggedIn','sec',34,[:],2)
printHtmlPart(12)
invokeTag('img','g',36,['dir':("images"),'file':("combine.png"),'width':("90px"),'height':("90px"),'style':("padding-left:20px; padding-top:10px; position:absolute;left:20px")],-1)
printHtmlPart(13)
invokeTag('img','g',41,['dir':("images"),'file':("home.png"),'height':("15px"),'width':("15px")],-1)
printHtmlPart(14)
invokeTag('img','g',42,['dir':("images"),'file':("graph.png"),'height':("15px"),'width':("15px")],-1)
printHtmlPart(15)
invokeTag('img','g',43,['dir':("images"),'file':("map.png"),'height':("15px"),'width':("15px")],-1)
printHtmlPart(16)
invokeTag('img','g',44,['dir':("images"),'file':("graph.png"),'height':("15px"),'width':("15px")],-1)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',61,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1395052204465L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
