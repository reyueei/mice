package com.mice
import java.lang.String
import java.io.InputStream
import java.io.File
import groovy.util.XmlParser
import groovy.xml.StreamingMarkupBuilder

class NodeChartController {

    def index = { 
		def parser = new XmlParser()
		 def doc = parser.parse("web-app/OUTPUT/nodeData.xml")
		def writer = new StringWriter()
		def nodePrinter = new XmlNodePrinter(new PrintWriter(writer))
		nodePrinter.preserveWhitespace = true
		nodePrinter.print doc

		render view: '/nodeChart/index', model: [xmlstring: writer.toString()]	
	
	}
	
}
