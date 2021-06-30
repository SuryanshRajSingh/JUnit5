package com.sr.cgi;

import com.assign.cgi.StringManipulation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulationTest {
    private StringManipulation op;
    @BeforeEach
    public void initEach(){
        op = new StringManipulation();
    }

    @AfterEach
    public void clsCal(){
        op = null;
    }

    @Test
    void testVowelCount(){
        assertEquals(2,op.vowelCount("Suryansh"));
        assertEquals(2,op.vowelCount("Yashwin"));
        assertEquals(3,op.vowelCount("Aakash"));
        assertEquals(3,op.vowelCount("Joshua"));

    }

    @ParameterizedTest
    @CsvSource(value = {"2,Suryansh", "2,Yashwin", "3,Aakash","3,Joshua"})
    void testVowelCountParameterized(int a, String b){
        assertEquals(a,op.vowelCount(b));
    }

    @Test
    void testCharacterCount(){
        assertEquals(8,op.characterCount("Suryansh"));
        assertEquals(7,op.characterCount("Yashwin"));
        assertEquals(6,op.characterCount("Aakash"));
        assertEquals(6,op.characterCount("Joshua"));

    }

    @ParameterizedTest
    @CsvSource(value = {"8,Suryansh", "7,Yashwin", "6,Aakash","6,Joshua"})
    void testCharacterCountParameterized(int a, String b){
        assertEquals(a,op.characterCount(b));

    }
}
