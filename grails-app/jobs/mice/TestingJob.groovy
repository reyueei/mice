package mice

class TestingJob {
def buildXmlService
    static triggers = {
      simple repeatInterval: 5000l // execute job once in 5 seconds
    }

    def execute() {
        
		buildXmlService.buildXml()
    }
}
