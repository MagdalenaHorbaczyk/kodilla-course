package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public final class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[4];
        numbers[0] = 20;
        numbers[1] = 45;
        numbers[2] = 80;
        numbers[3] = 4;
        //When
        double averageResult = ArrayOperations.getAverage(numbers);
        //Then
        double averageExpected = 37.25;
        Assert.assertEquals(averageExpected, averageResult, 0.01);
    }
}
