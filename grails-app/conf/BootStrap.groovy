import com.mice.*
class BootStrap {

    def init = { servletContext ->

	def userRole = new Authority(authority:'ROLE_ADMIN').save(flush:true)
	def adminRole = new Authority(authority:'ROLE_USER').save(flush:true)

	def newUser = new Person(username:'roms', password:'bazinga')
	newUser.save(flash:true)

	PersonAuthority.create newUser, userRole, true

	assert Person.count() == 1
	assert Authority.count() == 2
	assert PersonAuthority.count() == 1
	
    def destroy = {
    }
}
}