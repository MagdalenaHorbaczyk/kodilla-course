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
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //Given
        OddNumbersExterminator test = new OddNumbersExterminator();
        //When
        test.exterminate(numbers);
        System.out.println("Testing odd number: " + 1);
        //Then
        Assert.assertFalse(numbers.contains(1));
    }
}
