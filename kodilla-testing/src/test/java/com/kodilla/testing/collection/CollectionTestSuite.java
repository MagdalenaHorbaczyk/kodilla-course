package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Odd Numbers: begin");
    }

    @After
    public void after() {
        System.out.println("Test Odd Numbers: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //Given
        OddNumbersExterminator test = new OddNumbersExterminator();
        test.exterminate(numbers);
        //When
        int result = numbers.size();
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(0, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        OddNumbersExterminator test = new OddNumbersExterminator();
        //When
        for (int n = 0; n < 5; n++) {
            numbers.add(n);
            Integer temp = 0;
            temp = n;
            if (temp % 2 == 1) {
                numbers.remove(temp);
            }
        }
        test.exterminate(numbers);
        System.out.println("Testing odd numbers: " + 1 + ", " + 3);
        //Then
        Assert.assertFalse(numbers.contains(1));
        Assert.assertFalse(numbers.contains(3));
    }
}
