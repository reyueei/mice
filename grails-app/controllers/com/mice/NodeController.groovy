package com.mice
import grails.plugin.springsecurity.annotation.Secured
 @Secured(['ROLE_ADMIN'])
class NodeController {

    def index() {
		render 'hello'
	}
}
