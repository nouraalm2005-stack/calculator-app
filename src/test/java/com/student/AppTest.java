package com.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAdd() {
        assertEquals(8, App.add(5, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, App.subtract(5, 3));
    }
}