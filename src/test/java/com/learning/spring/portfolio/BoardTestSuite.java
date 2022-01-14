package com.learning.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testsContainsTasks() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        // When
        boolean getBoard = context.containsBean("getBoard");
        boolean getTaskList = context.containsBean("getTaskList");
        // Then
        assertTrue(getBoard);
        assertTrue(getTaskList);
    }

    @Test
    void testsAddTaskList() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        // When
        board.getToDoList().addTask("Create tasks to do");
        board.getInProgressList().addTask("tasks in progress");
        board.getDoneList().addTask("tasks done");
        // Then
        assertEquals("Create tasks to do", board.getToDoList().getTasks().get(0));
        assertEquals("tasks in progress", board.getInProgressList().getTasks().get(0));
        assertEquals("tasks done", board.getDoneList().getTasks().get(0));


    }
}
