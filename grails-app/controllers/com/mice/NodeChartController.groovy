package com.mice
import java.lang.String
import java.io.InputStream
import java.io.File
import groovy.util.XmlParser
import groovy.xml.StreamingMarkupBuilder
import groovy.sql.Sql
import grails.plugin.springsecurity.annotation.Secured

class NodeChartController {
def DbToXMLService
@Secured(['ROLE_ADMIN','ROLE_USER'])
    def index () { 
		
	}
	def temperature = {
	
	}
	
	def dataSource // the Spring-Bean "dataSource" is auto-injected

    def list = {
       DbToXMLService.dbAccess()
		
		
	}
	
@Secured(['ROLE_ADMIN','ROLE_USER'])
	def dtree () {
	
	
	}

}
