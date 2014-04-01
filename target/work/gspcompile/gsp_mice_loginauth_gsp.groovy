import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_mice_loginauth_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/auth.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',17,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('username','sec',22,[:],-1)
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',22,['controller':("logout")],3)
printHtmlPart(9)
})
invokeTag('ifLoggedIn','sec',23,[:],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
expressionOut.print(postUrl)
printHtmlPart(12)
expressionOut.print(rememberMeParameter)
printHtmlPart(13)
if(true && (hasCookie)) {
printHtmlPart(14)
}
printHtmlPart(15)
expressionOut.print(message(code: "springSecurity.login.button"))
printHtmlPart(16)
})
invokeTag('ifNotLoggedIn','sec',37,[:],2)
printHtmlPart(17)
invokeTag('img','g',40,['dir':("images"),'file':("combine.png"),'width':("90px"),'height':("90px"),'style':("padding-left:20px; padding-top:10px; position:absolute;left:20px")],-1)
printHtmlPart(18)
invokeTag('img','g',45,['dir':("images"),'file':("network-icon.png")],-1)
printHtmlPart(19)
invokeTag('img','g',50,['dir':("images"),'file':("power-management-icon.png")],-1)
printHtmlPart(20)
invokeTag('img','g',55,['dir':("images"),'file':("monitor-icon.png")],-1)
printHtmlPart(21)
invokeTag('img','g',60,['dir':("images"),'file':("energy-icon.png")],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',70,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1395107472639L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
