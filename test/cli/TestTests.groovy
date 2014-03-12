import grails.test.AbstractCliTestCase

class TestTests extends AbstractCliTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testTest() {

        execute(["test"])

        assertEquals 0, waitForProcess()
        verifyHeader()
    }
}
