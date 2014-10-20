package lab.mobi.greenhousetest.test;

import android.test.AndroidTestCase;
import java.lang.Exception;

public class SuccessTest extends AndroidTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSuccess1() throws Exception {
        assertEquals(1, 1);
        assertNotSame(1, 2);
        assertTrue(true);
        assertFalse(false);
        assertTrue(true || false);
        assertFalse(true && false);
    }

    public void testSuccess2() throws Exception {
        assertEquals(1, 1);
        assertNotSame(1, 2);
        assertTrue(true);
        assertFalse(false);
        assertTrue(true || false);
        assertFalse(true && false);
    }

    public void testSuccess3() throws Exception {
        assertEquals(1, 1);
        assertNotSame(1, 2);
        assertTrue(true);
        assertFalse(false);
        assertTrue(true || false);
        assertFalse(true && false);
    }
}
