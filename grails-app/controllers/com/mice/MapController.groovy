package com.mice
import grails.plugin.springsecurity.annotation.Secured

class MapController {

@Secured(['ROLE_ADMIN'])
    def index() {

	}
	@Secured(['ROLE_ADMIN'])
	def gis() {
	
	}
}
