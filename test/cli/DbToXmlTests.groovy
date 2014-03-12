import grails.test.AbstractCliTestCase

class DbToXMLTests extends AbstractCliTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testDbToXML() {

        execute(["db-to-xml"])

        assertEquals 0, waitForProcess()
        verifyHeader()
    }
}
