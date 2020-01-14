package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void testLog() {
        Logger.getInstance().log("first log");
        Logger.getInstance().log("second log");
        Logger.getInstance().log("last log");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("last log", lastLog);
    }
}
