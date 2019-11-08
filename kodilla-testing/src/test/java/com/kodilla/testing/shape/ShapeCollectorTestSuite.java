package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    public ShapeCollectorTestSuite() {
    }

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector test = new ShapeCollector(new Circle());
        //When
        test.addFigure(new Circle());
        //Then
        Assert.assertEquals(1, test.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector test = new ShapeCollector(new Circle());
        //When
        test.removeFigure(new Circle());
        //Then
        Assert.assertEquals(0, test.size());
    }

    @Test
    public void getFigure() {
        //Given
        ShapeCollector test = new ShapeCollector(new Square());
        test.addFigure(new Square());
        //When
        String result = test.getFigure(0);
        //Then
        Assert.assertEquals("square", result);
    }

    @Test
    public void showFigures() {
        //Given
        ShapeCollector test = new ShapeCollector(new Square());
        test.addFigure(new Square());
        test.addFigure(new Circle());
        test.addFigure(new Triangle());
        //When
        test.showFigures();
        String result = test.getFigure(0);
        boolean isEqual = "square".equals(result);
        //Then
        Assert.assertEquals(3, test.size());
        Assert.assertTrue(isEqual);
    }
}
