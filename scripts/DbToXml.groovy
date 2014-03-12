import groovy.sql.Sql
import groovy.xml.MarkupBuilder
import java.util.Properties
includeTargets << grailsScript("_GrailsInit")

target(dbToXML: "Fetch the data from database and copy it into xml format") {
          
  def props = new Properties()
     new File('application.properties').withInputStream {
        stream -> props.load(stream)
     }

  String outFolderName = (props["OUTPUT_FOLDER"]==null)?"."+File.separatorChar : props["OUTPUT_FOLDER"]
  File outputFolder = new File(outFolderName)
  if(!outputFolder.exists())
      outputFolder.mkdir()

 String userFileName = outFolderName + File.separatorChar + "nodeData" + ".xml"
def sql = Sql.newInstance(props["DB_URL"],props["USERNAME"],props["PASSWORD"], props["DRIVERCLASS"])
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
	
 sql.eachRow( userQuery as String  ) {
         row ->		set(label:(row.nodeLabel), value:(row.data), date:(row.nodeDate))
		
		 
	
	

	}
  }

}

setDefaultTarget(dbToXML)
