package lab.mobi.greenhousetest.test;

import android.test.AndroidTestCase;

import java.lang.Exception;

public class FailTest extends AndroidTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testFail1() throws Exception {
        assertFalse(true);
        assertTrue(false);
    }

    public void testFail2() throws Exception {
        assertFalse(true);
        assertTrue(false);
    }

    public void testFail3() throws Exception {
        assertFalse(true);
        assertTrue(false);
    }
}