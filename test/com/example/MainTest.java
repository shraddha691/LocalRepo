package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testAdd() {
        assertEquals(5, Main.add(2, 3));
    }
}

