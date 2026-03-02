package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void greetTest() {
        assertEquals("Hello Maven CI!", App.greet());
    }
}