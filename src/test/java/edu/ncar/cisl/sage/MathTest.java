package edu.ncar.cisl.sage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    @Test
    public void given_valid_inputs__when_add__then_correct_sum_is_returned() {

        Math math = new Math();

        assertEquals(3, math.add(1, 2));
    }
}