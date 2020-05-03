package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskTestSuite {
    @Test
    public void notifyAboutNewTask() {
        //given
        Mentor andrew = new Mentor("Andrew");
        Mentor adam = new Mentor("Adam");
        TraineeTasks alexanderTasks = new TraineeTasks(new Trainee("Alexander"));
        TraineeTasks lenaTasks = new TraineeTasks(new Trainee("Lena"));
        TraineeTasks paulTasks = new TraineeTasks(new Trainee("Paul"));

        alexanderTasks.registerObserver(andrew);
        lenaTasks.registerObserver(andrew);
        paulTasks.registerObserver(adam);

        //when
        alexanderTasks.addTaskToQueue("task 1");
        paulTasks.addTaskToQueue("task 2");
        alexanderTasks.addTaskToQueue("task 3");
        alexanderTasks.addTaskToQueue("task 4");
        lenaTasks.addTaskToQueue("task 5");
        paulTasks.addTaskToQueue("task 6");
        lenaTasks.addTaskToQueue("task 7");

        //then
        assertEquals(2, lenaTasks.getTasks().size());
        assertEquals(2, paulTasks.getTasks().size());
        assertEquals(3, alexanderTasks.getTasks().size());
        assertEquals(5, andrew.getUpdateCount());
        assertEquals(2, adam.getUpdateCount());
    }
}
