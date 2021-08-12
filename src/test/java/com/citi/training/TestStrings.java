package com.citi.training;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestStrings {

    // fixtures
    private String stringLiteral1;
    private String stringLiteral2;
    private String newString;

    @BeforeEach
    public void setup(){
        stringLiteral1 = "hello";
        stringLiteral2 = "hello";
        newString = new String("hello");
    }

    @Test
    public void testCompareStringsDoubleEquals(){
        assertTrue(stringLiteral1==stringLiteral2);
    }

    @Test
    public void tsetCompareStringsWithNewStrings(){
        assertFalse(stringLiteral1==newString);
    }

    @Test
    public void testCompareStringsUsingEquals(){
        assertTrue(stringLiteral1.equals(newString));
    }



}
