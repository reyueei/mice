import grails.test.AbstractCliTestCase

class DbToXmlTests extends AbstractCliTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testDbToXml() {

        execute(["db-to-xml"])

        assertEquals 0, waitForProcess()
        verifyHeader()
    }
}
