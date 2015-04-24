package com.greenhouseci.greenhouseios.first;

import org.junit.Test;
import com.greenhouseci.greenhouseios.BaseTest;

import static org.junit.Assert.assertTrue;

public class FirstTest extends BaseTest {

    @Test
    public void testExampleFail() {
        assertTrue(false);
    }
    
    @Test
    public void testExampleSuccess() {
        assertTrue(true);
    }
    
}
