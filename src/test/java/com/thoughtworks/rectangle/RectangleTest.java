package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;

import com.thoughtworks.rectangle.*;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void shouldIncreaseAreaWhenLengthAndBreadthIsGiven() {
        assertEquals(15, new Rectangle(5, 3).getArea());
    }
}

