package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BracketsCheckerTest {
    private BracketsChecker bracketsChecker;
    @Before
    public void init(){
        bracketsChecker = new BracketsChecker();
    }
    @Test
    public void testIsEmptyString(){
        assertFalse(bracketsChecker.check(""));
    }
    @Test
    public void testStringWithoutBrackets(){
        assertFalse(bracketsChecker.check("fjsafdfdhsf"));
    }
    @Test
    public void testBadStringBracketsCase1(){
        assertFalse(bracketsChecker.check("[{(}]"));
    }
    @Test
    public void testBadStringBracketsCase2(){
        assertFalse(bracketsChecker.check("[{(})]"));
    }
    @Test
    public void testGoodStringBracketsCase1(){
        assertTrue(bracketsChecker.check("{{(){()[]}[{}]()}(){}}"));
    }
    @Test
    public void testGoodStringBracketsCase2(){
        assertTrue(bracketsChecker.check("{{}()[]}"));
    }
    @Test
    public void testGoodStringBracketsCase3(){
        assertTrue(bracketsChecker.check("{hello:{world[1,2,3].(e)=>{e.target}}}"));
    }
}