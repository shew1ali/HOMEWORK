package org.example;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    public Main test;

    @org.junit.jupiter.api.Test
    public void test_getSum(){
        assertEquals(5,test.getSum(2,3));
    }

    @org.junit.jupiter.api.Test
    public void test_getDivide(){
        assertEquals(10,test.getDivide(12,2));
    }

    @org.junit.jupiter.api.Test
    public void test_GetMultiple(){
        assertEquals(25, test.getMultiple(5,5));
    }

    @Test
    public void test2_getSum(){
        int expected = 10;
        assertTrue(expected == test.getSum(5,5));
    }

    @Test
    public void test2_getDivide(){
        int expected = 3;
        int result = test.getDivide(6,2);
        assertTrue(expected==result);
    }



}