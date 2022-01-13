package com.learning.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    public String username() {
        return "John Smith";
    }
}
