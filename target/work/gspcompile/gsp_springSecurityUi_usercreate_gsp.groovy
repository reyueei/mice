import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='spring-security-ui', version='1.0-RC1')
class gsp_springSecurityUi_usercreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/spring-security-ui-1.0-RC1/grails-app/views/user/create.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("springSecurityUI")],-1)
printHtmlPart(1)
invokeTag('set','g',5,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',6,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(3)

def tabData = []
tabData << [name: 'userinfo', icon: 'icon_user', messageCode: 'spring.security.ui.user.info']
tabData << [name: 'roles',    icon: 'icon_role', messageCode: 'spring.security.ui.user.roles']

printHtmlPart(3)
createTagBody(3, {->
printHtmlPart(5)
createTagBody(4, {->
printHtmlPart(6)
invokeTag('textFieldRow','s2ui',27,['name':("username"),'labelCode':("user.username.label"),'bean':(user),'labelCodeDefault':("Username"),'value':(user?.username)],-1)
printHtmlPart(7)
invokeTag('passwordFieldRow','s2ui',30,['name':("password"),'labelCode':("user.password.label"),'bean':(user),'labelCodeDefault':("Password"),'value':(user?.password)],-1)
printHtmlPart(7)
invokeTag('checkboxRow','s2ui',33,['name':("enabled"),'labelCode':("user.enabled.label"),'bean':(user),'labelCodeDefault':("Enabled"),'value':(user?.enabled)],-1)
printHtmlPart(7)
invokeTag('checkboxRow','s2ui',36,['name':("accountExpired"),'labelCode':("user.accountExpired.label"),'bean':(user),'labelCodeDefault':("Account Expired"),'value':(user?.accountExpired)],-1)
printHtmlPart(7)
invokeTag('checkboxRow','s2ui',39,['name':("accountLocked"),'labelCode':("user.accountLocked.label"),'bean':(user),'labelCodeDefault':("Account Locked"),'value':(user?.accountLocked)],-1)
printHtmlPart(7)
invokeTag('checkboxRow','s2ui',42,['name':("passwordExpired"),'labelCode':("user.passwordExpired.label"),'bean':(user),'labelCodeDefault':("Password Expired"),'value':(user?.passwordExpired)],-1)
printHtmlPart(8)
})
invokeTag('tab','s2ui',45,['name':("userinfo"),'height':("280")],4)
printHtmlPart(5)
createTagBody(4, {->
printHtmlPart(9)
for( auth in (authorityList) ) {
printHtmlPart(10)
invokeTag('checkBox','g',50,['name':(auth.authority)],-1)
printHtmlPart(11)
createTagBody(6, {->
expressionOut.print(auth.authority.encodeAsHTML())
})
invokeTag('link','g',51,['controller':("role"),'action':("edit"),'id':(auth.id)],6)
printHtmlPart(12)
}
printHtmlPart(1)
})
invokeTag('tab','s2ui',54,['name':("roles"),'height':("280")],4)
printHtmlPart(3)
})
invokeTag('tabs','s2ui',56,['elementId':("tabs"),'height':("375"),'data':(tabData)],3)
printHtmlPart(13)
invokeTag('submitButton','s2ui',59,['elementId':("create"),'form':("userCreateForm"),'messageCode':("default.button.create.label")],-1)
printHtmlPart(14)
})
invokeTag('form','g',62,['action':("save"),'name':("userCreateForm")],2)
printHtmlPart(15)
invokeTag('initCheckboxes','s2ui',67,[:],-1)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',71,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394830880578L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
