package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    //Given
    private TaskFactory factory = new TaskFactory();

    @Test
    public void testFactoryDrivingTask() {
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING_TASK);
        assert drivingTask != null;
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("Drive one", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING_TASK);
        assert paintingTask != null;
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("Painting one", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING_TASK);
        assert shoppingTask != null;
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("ZooPlus shop", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }
}
