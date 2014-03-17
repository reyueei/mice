package com.mice
import java.lang.String
import java.io.InputStream
import java.io.File
import groovy.util.XmlParser
import groovy.xml.StreamingMarkupBuilder
import groovy.sql.Sql
import grails.plugin.springsecurity.annotation.Secured

class NodeChartController {

@Secured(['ROLE_ADMIN','ROLE_USER'])
    def index () { 
		
	}
	def temperature = {
	
	}
	@Secured(['ROLE_ADMIN','ROLE_USER'])
	def realtime () {
	
	
	
	
	}
	
	
	def dataSource // the Spring-Bean "dataSource" is auto-injected
	def dbToXMLService
@Secured(['ROLE_ADMIN','ROLE_USER'])
    def list () {
      
		
		
	}
	
@Secured(['ROLE_ADMIN','ROLE_USER'])
	def test() {

	}

}
