import org.codehaus.groovy.grails.plugins.PluginManagerHolder
import grails.plugin.springsecurity.SpringSecurityUtils
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='spring-security-ui', version='1.0-RC1')
class gsp_springSecurityUi_layoutsspringSecurityUI_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/spring-security-ui-1.0-RC1/grails-app/views/layouts/springSecurityUI.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',11,['default':("Security Management Console")],-1)
})
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(3)
expressionOut.print(resource(dir:'images',file:'favicon.ico'))
printHtmlPart(4)
invokeTag('resources','s2ui',15,['module':("spring-security-ui")],-1)
printHtmlPart(5)
expressionOut.print(fam.icon(name: 'lock'))
printHtmlPart(6)
expressionOut.print(fam.icon(name: 'group'))
printHtmlPart(7)
expressionOut.print(fam.icon(name: 'user'))
printHtmlPart(8)
expressionOut.print(fam.icon(name: 'exclamation'))
printHtmlPart(9)
expressionOut.print(fam.icon(name: 'information'))
printHtmlPart(10)
invokeTag('layoutHead','g',24,[:],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',24,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(11)
createTagBody(2, {->
invokeTag('message','g',25,['code':("Home")],-1)
})
invokeTag('link','g',26,['controller':("home"),'action':("index")],2)
printHtmlPart(12)
invokeTag('message','g',26,['code':("spring.security.ui.menu.users")],-1)
printHtmlPart(13)
createTagBody(2, {->
invokeTag('message','g',27,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',27,['controller':("user"),'action':("search")],2)
printHtmlPart(14)
createTagBody(2, {->
invokeTag('message','g',28,['code':("spring.security.ui.create")],-1)
})
invokeTag('link','g',28,['controller':("user"),'action':("create")],2)
printHtmlPart(15)
invokeTag('message','g',29,['code':("spring.security.ui.menu.roles")],-1)
printHtmlPart(13)
createTagBody(2, {->
invokeTag('message','g',30,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',30,['controller':("role"),'action':("search")],2)
printHtmlPart(14)
createTagBody(2, {->
invokeTag('message','g',34,['code':("spring.security.ui.create")],-1)
})
invokeTag('link','g',34,['controller':("role"),'action':("create")],2)
printHtmlPart(16)
if(true && (SpringSecurityUtils.securityConfig.securityConfigType?.toString() == 'Requestmap')) {
printHtmlPart(17)
invokeTag('message','g',42,['code':("spring.security.ui.menu.requestmaps")],-1)
printHtmlPart(13)
createTagBody(3, {->
invokeTag('message','g',47,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',47,['controller':("requestmap"),'action':("search")],3)
printHtmlPart(14)
createTagBody(3, {->
invokeTag('message','g',53,['code':("spring.security.ui.create")],-1)
})
invokeTag('link','g',53,['controller':("requestmap"),'action':("create")],3)
printHtmlPart(16)
}
printHtmlPart(18)
if(true && (SpringSecurityUtils.securityConfig.rememberMe.persistent)) {
printHtmlPart(17)
invokeTag('message','g',60,['code':("spring.security.ui.menu.persistentLogins")],-1)
printHtmlPart(13)
createTagBody(3, {->
invokeTag('message','g',71,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',73,['controller':("persistentLogin"),'action':("search")],3)
printHtmlPart(16)
}
printHtmlPart(17)
invokeTag('message','g',77,['code':("spring.security.ui.menu.registrationCode")],-1)
printHtmlPart(13)
createTagBody(2, {->
invokeTag('message','g',82,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',82,['controller':("registrationCode"),'action':("search")],2)
printHtmlPart(16)
if(true && (PluginManagerHolder.pluginManager.hasGrailsPlugin('springSecurityAcl'))) {
printHtmlPart(17)
invokeTag('message','g',83,['code':("spring.security.ui.menu.acl")],-1)
printHtmlPart(13)
invokeTag('message','g',86,['code':("spring.security.ui.menu.aclClass")],-1)
printHtmlPart(19)
createTagBody(3, {->
invokeTag('message','g',88,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',88,['controller':("aclClass"),'action':("search")],3)
printHtmlPart(20)
createTagBody(3, {->
invokeTag('message','g',89,['code':("spring.security.ui.create")],-1)
})
invokeTag('link','g',89,['controller':("aclClass"),'action':("create")],3)
printHtmlPart(21)
invokeTag('message','g',92,['code':("spring.security.ui.menu.aclSid")],-1)
printHtmlPart(19)
createTagBody(3, {->
invokeTag('message','g',93,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',93,['controller':("aclSid"),'action':("search")],3)
printHtmlPart(20)
createTagBody(3, {->
invokeTag('message','g',95,['code':("spring.security.ui.create")],-1)
})
invokeTag('link','g',95,['controller':("aclSid"),'action':("create")],3)
printHtmlPart(21)
invokeTag('message','g',96,['code':("spring.security.ui.menu.aclObjectIdentity")],-1)
printHtmlPart(19)
createTagBody(3, {->
invokeTag('message','g',100,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',100,['controller':("aclObjectIdentity"),'action':("search")],3)
printHtmlPart(20)
createTagBody(3, {->
invokeTag('message','g',103,['code':("spring.security.ui.create")],-1)
})
invokeTag('link','g',103,['controller':("aclObjectIdentity"),'action':("create")],3)
printHtmlPart(21)
invokeTag('message','g',103,['code':("spring.security.ui.menu.aclEntry")],-1)
printHtmlPart(19)
createTagBody(3, {->
invokeTag('message','g',107,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',107,['controller':("aclEntry"),'action':("search")],3)
printHtmlPart(20)
createTagBody(3, {->
invokeTag('message','g',109,['code':("spring.security.ui.create")],-1)
})
invokeTag('link','g',109,['controller':("aclEntry"),'action':("create")],3)
printHtmlPart(22)
}
printHtmlPart(17)
invokeTag('message','g',113,['code':("spring.security.ui.menu.appinfo")],-1)
printHtmlPart(23)
createTagBody(2, {->
invokeTag('message','g',115,['code':("spring.security.ui.menu.appinfo.config")],-1)
})
invokeTag('link','g',115,['action':("config"),'controller':("securityInfo")],2)
printHtmlPart(24)
createTagBody(2, {->
invokeTag('message','g',117,['code':("spring.security.ui.menu.appinfo.mappings")],-1)
})
invokeTag('link','g',117,['action':("mappings"),'controller':("securityInfo")],2)
printHtmlPart(24)
createTagBody(2, {->
invokeTag('message','g',119,['code':("spring.security.ui.menu.appinfo.auth")],-1)
})
invokeTag('link','g',119,['action':("currentAuth"),'controller':("securityInfo")],2)
printHtmlPart(24)
createTagBody(2, {->
invokeTag('message','g',123,['code':("spring.security.ui.menu.appinfo.usercache")],-1)
})
invokeTag('link','g',123,['action':("usercache"),'controller':("securityInfo")],2)
printHtmlPart(24)
createTagBody(2, {->
invokeTag('message','g',124,['code':("spring.security.ui.menu.appinfo.filters")],-1)
})
invokeTag('link','g',124,['action':("filterChain"),'controller':("securityInfo")],2)
printHtmlPart(24)
createTagBody(2, {->
invokeTag('message','g',127,['code':("spring.security.ui.menu.appinfo.logout")],-1)
})
invokeTag('link','g',127,['action':("logoutHandler"),'controller':("securityInfo")],2)
printHtmlPart(24)
createTagBody(2, {->
invokeTag('message','g',129,['code':("spring.security.ui.menu.appinfo.voters")],-1)
})
invokeTag('link','g',129,['action':("voters"),'controller':("securityInfo")],2)
printHtmlPart(24)
createTagBody(2, {->
invokeTag('message','g',130,['code':("spring.security.ui.menu.appinfo.providers")],-1)
})
invokeTag('link','g',130,['action':("providers"),'controller':("securityInfo")],2)
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(26)
invokeTag('username','sec',136,[:],-1)
printHtmlPart(27)
createClosureForHtmlPart(28, 3)
invokeTag('link','g',136,['controller':("logout")],3)
printHtmlPart(29)
})
invokeTag('ifLoggedIn','sec',136,[:],2)
printHtmlPart(30)
createClosureForHtmlPart(31, 2)
invokeTag('ifNotLoggedIn','sec',142,[:],2)
printHtmlPart(32)
createTagBody(2, {->
printHtmlPart(33)
expressionOut.print(request.contextPath)
printHtmlPart(34)
invokeTag('switchedUserOriginalUsername','sec',144,[:],-1)
printHtmlPart(35)
})
invokeTag('ifSwitched','sec',144,[:],2)
printHtmlPart(36)
invokeTag('layoutResources','s2ui',146,['module':("spring-security-ui")],-1)
printHtmlPart(18)
invokeTag('layoutBody','g',146,[:],-1)
printHtmlPart(37)
invokeTag('render','g',147,['template':("/includes/ajaxLogin"),'plugin':("spring-security-ui")],-1)
printHtmlPart(2)
invokeTag('showFlash','s2ui',147,[:],-1)
printHtmlPart(2)
})
invokeTag('captureBody','sitemesh',147,[:],1)
printHtmlPart(38)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1395087883966L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
