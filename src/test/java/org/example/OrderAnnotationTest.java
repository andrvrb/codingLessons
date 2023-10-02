package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderAnnotationTest {
    private static StringBuilder output = new StringBuilder("");

    @Test
    @Order(2)
    void secondTest() {
        output.append("b");
    }

    @Test
    @Order(1)
    void firstTest() {
        output.append("a");
    }

    @Test
    @Order(3)
    void thirdTest() {
        output.append("c");
    }

    @AfterAll
    public static void assertOutput() {
        assertEquals("abc", output.toString());
    }
}
