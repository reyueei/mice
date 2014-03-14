package com.mice
import java.lang.String
import java.io.InputStream
import java.io.File
import groovy.util.XmlParser
import groovy.xml.StreamingMarkupBuilder
import groovy.sql.Sql

class NodeChartController {

    def index = { 
		
	}
	def temperature = {
	
	}
	
	def dataSource // the Spring-Bean "dataSource" is auto-injected

    def list = {
        def db = new Sql(dataSource) // Create a new instance of groovy.sql.Sql with the DB of the Grails app

        def result = db.rows("SELECT nodeLabel, data, nodeDate from nodeData order by nodeDate") // Perform the query

        [ result: result ] // return the results as model
    }

}
