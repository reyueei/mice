package com.mice
import grails.plugin.springsecurity.annotation.Secured


class HomeController {

@Secured(['ROLE_ADMIN'])
	def setting(){
	
	
	}
@Secured(['ROLE_ADMIN','ROLE_USER'])
    def index() { }
	
	@Secured(['ROLE_ADMIN','ROLE_USER'])
    def about() { }
	
}
