package com.learning.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LibraryTestSuite {

    @Autowired
    private Library library;

    @Test
    void testLoadFromDb() {
        // Given
        //ApplicationContext context = new AnnotationConfigApplicationContext("com.learning.spring");
        //Library library = context.getBean(Library.class);
        // When
        library.loadFromDb();
        // Then

    }
    @Test
    void testSaveToDb() {
        // Given
       //ApplicationContext context = new AnnotationConfigApplicationContext("com.learning.spring");
       // Library library = context.getBean(Library.class);
        // When
        library.saveToDb();
        // Then
    }
}
