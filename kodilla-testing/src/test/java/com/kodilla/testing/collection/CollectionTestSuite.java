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
        ArrayList<Integer> numbers = new ArrayList<>();
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
        numbers.add(2);
        numbers.add(5);
        numbers.add(17);
        numbers.add(20);
        numbers.add(51);
        numbers.add(151);
        numbers.add(200);

        ArrayList<Integer> expectedList = new ArrayList<Integer>();

        expectedList.add(2);
        expectedList.add(20);
        expectedList.add(200);
        //When
        OddNumbersExterminator test = new OddNumbersExterminator();
        ArrayList<Integer> result = test.exterminate(numbers);
        //Then
        Assert.assertEquals(expectedList, result);
    }
}
