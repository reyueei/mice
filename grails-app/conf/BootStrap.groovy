import com.mice.*
class BootStrap {

    def init = { servletContext ->
	def authenticateService
  
	new Requestmap(url: '/js/**', configAttribute: 'IS_AUTHENTICATED_ANONYMOUSLY').save()
	new Requestmap(url: '/css/**', configAttribute: 'IS_AUTHENTICATED_ANONYMOUSLY').save()
	new Requestmap(url: '/images/**', configAttribute: 'IS_AUTHENTICATED_ANONYMOUSLY').save()
	new Requestmap(url: '/login/**', configAttribute: 'IS_AUTHENTICATED_ANONYMOUSLY').save()
	new Requestmap(url: '/logout/**', configAttribute: 'IS_AUTHENTICATED_ANONYMOUSLY').save()
	new Requestmap(url: '/*', configAttribute: 'IS_AUTHENTICATED_ANONYMOUSLY').save()
	new Requestmap(url: '/profile/**', configAttribute: 'ROLE_USER').save()
	new Requestmap(url: '/admin/**', configAttribute: 'ROLE_ADMIN').save()
	new Requestmap(url: '/role/**', configAttribute: 'ROLE_SUPERVISOR').save()
	new Requestmap(url: '/user/**', configAttribute: 'ROLE_ADMIN,ROLE_SUPERVISOR').save()
	new Requestmap(url: '/j_spring_security_switch_user',
    configAttribute: 'ROLE_SWITCH_USER,IS_AUTHENTICATED_FULLY').save()
	
	
	}
    def destroy = {
    }
}
