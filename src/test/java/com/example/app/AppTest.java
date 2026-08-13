package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void greetReturnsExpectedMessage() {
        App app = new App();
        assertEquals("Hello from your Maven-built Java project!", app.greet());
    }
}
