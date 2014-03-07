includeTargets << grailsScript("_GrailsInit")
import groovy.sql.Sql
import groovy.xml.MarkupBuilder
import java.util.Properties

target(dbToXml: "The description of the script goes here!") {
    // TODO: Implement script here
	static void main(args) {

	def props = new Properties()
     new File('application.properties').withInputStream {
        stream -> props.load(stream)
     }

  String outFolderName = (props["OUTPUT_FOLDER"]==null)?"."+File.separatorChar : props["OUTPUT_FOLDER"]
  File outputFolder = new File(outFolderName)
  if(!outputFolder.exists())
      outputFolder.mkdir()

	  String userFileName = outFolderName + File.separatorChar + "totalmonthlydata" + ".xml"
def sql = Sql.newInstance(props["DB_URL"],props["USERNAME"],props["PASSWORD"], props["DRIVERCLASS"])

def userQuery = """
	
	select *from nodedata order by nodeDate;
			
			
        """
 def xml = new MarkupBuilder(new FileWriter(new File(userFileName)))

xml.chart(caption:"Temperature" , xAxisName:"time", yAxisName:"temp")
     {
	
 sql.eachRow( userQuery as String  ) {
         row ->		set(label:(row.weekay), value:(row.total)) 				
		
		 
	
	

	}
  }
	
	}

	}

setDefaultTarget(dbToXml)
