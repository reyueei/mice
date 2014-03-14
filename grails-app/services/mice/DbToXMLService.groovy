package mice

import grails.transaction.Transactional
import groovy.sql.Sql

@Transactional
class DbToXMLService {
def dataSource
    def dbAccess() {
	
	def db = new Sql(dataSource) // Create a new instance of groovy.sql.Sql with the DB of the Grails app

        def result = db.rows("SELECT nodeLabel, data, nodeDate from nodeData order by nodeDate") // Perform the query

        return result // return the results as model
	
	}
}
