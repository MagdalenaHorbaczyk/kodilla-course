package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        List<String> toDoList = board.getToDoList().getTasks();
        List<String> inProgressList = board.getInProgressList().getTasks();
        List<String> doneList = board.getDoneList().getTasks();
        toDoList.add("Do next task");
        inProgressList.add("Wait for review");
        doneList.add("Send resolved task");
        //Then
        Assert.assertEquals("Do next task", toDoList.get(0));
        Assert.assertEquals("Wait for review", inProgressList.get(0));
        Assert.assertEquals("Send resolved task", doneList.get(0));
    }
}
