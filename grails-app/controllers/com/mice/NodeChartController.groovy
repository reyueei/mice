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
       dbToXMLService.dbAccess()
		
		
	}
	
@Secured(['ROLE_ADMIN','ROLE_USER'])
	def test() {
	def db = new Sql(dataSource) // Create a new instance of groovy.sql.Sql with the DB of the Grails app

        def result = db.rows("SELECT nodeLabel, data, nodeDate from nodeData order by nodeDate") // Perform the query

       [result : result]  // return the results as model
	
	}

}
