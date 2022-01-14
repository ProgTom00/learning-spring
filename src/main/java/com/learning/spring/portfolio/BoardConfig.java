package com.learning.spring.portfolio;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getTaskList(), getTaskList(), getTaskList());
    }
    @Bean
    @Scope(scopeName = "prototype")
    public TaskList getTaskList() {
        return new TaskList();
    }
}
