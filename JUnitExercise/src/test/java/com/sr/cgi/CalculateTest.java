package com.sr.cgi;

import com.assign.cgi.Calculate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {
    private Calculate op;
    @BeforeEach
    public void initEach(){
        op = new Calculate();
    }

    @AfterEach
    public void clsCal(){
        op = null;
    }

    @Test
    void testaddSum(){
        assertEquals(5,op.addSum(2,3));
        assertEquals(-1,op.addSum(2,-3));
        assertEquals(0,op.addSum(1,-1));
        assertEquals(0,op.addSum(0,0));
    }

    @ParameterizedTest
    @CsvSource(value = {"5,2,3", "-1,2,-3", "0,1,-1","0,0,0"})
    void testaddSumParameterized(int a, int b, int c){
        assertEquals(a,op.addSum(b,c));
    }

    @Test
    void testisEven(){
        assertEquals(false,op.isEven(3));
        assertEquals(false,op.isEven(1));
        assertEquals(true,op.isEven(0));
        assertEquals(true,op.isEven(4));
    }

    @ParameterizedTest
    @CsvSource(value = {"false,3", "true,0", "false,1","true,4"})
    void testisEvenParameterized(boolean a, int b){
        assertEquals(a,op.isEven(b));
    }

}
