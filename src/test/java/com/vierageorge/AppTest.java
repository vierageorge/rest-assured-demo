package com.vierageorge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.logging.Logger;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    Logger logger = Logger.getLogger(AppTest.class.getName());
    @Test
    public void shouldAnswerWithTrue()
    {
        String param = System.getProperty("env");
        assertEquals("Did not get the expected value","qa",param);
        logger.info("Test completed successfully.");
    }
}
