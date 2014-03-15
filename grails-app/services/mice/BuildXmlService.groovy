package mice
import groovy.xml.MarkupBuilder
import java.util.Properties
import grails.transaction.Transactional
import groovy.sql.Sql

@Transactional
class BuildXmlService {
def dataSource
    def buildXml() {

	def props = new Properties()
     new File('application.properties').withInputStream {
        stream -> props.load(stream)
     }

  String outFolderName = (props["TEST_FOLDER"]==null)?"."+File.separatorChar : props["TEST_FOLDER"]
  File outputFolder = new File(outFolderName)
  if(!outputFolder.exists())
      outputFolder.mkdir()
 String userFileName = outFolderName + File.separatorChar + "nodeData" + ".xml"

	  def db = new Sql(dataSource) // Create a new instance of groovy.sql.Sql with the DB of the Grails app
	   def userQuery = """
		    SELECT 
			nodeLabel, data, nodeDate
			from nodeData
			order by nodeDate
		   ;
        """
		
		def xml = new MarkupBuilder(new FileWriter(new File(userFileName)))

 xml.chart(caption:"History Consumption(Month)" , xAxisName:"Week", yAxisName:"kilowatts")
     {
	
 db.eachRow( userQuery as String  ) {
         row ->		set(label:(row.nodeLabel), value:(row.data), date:(row.nodeDate))
		
		 
	
	

	}
  }
    }
}
