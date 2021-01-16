package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class BracketsCheckerTest {

    @Test
    public void checkBracketNormal() {
        String expression = "([])";

        assertTrue(BracketsChecker.checkBracket(expression));
    }

    @Test
    public void checkBracketTypeNotSame() {
        String expression = "([))";

        assertFalse(BracketsChecker.checkBracket(expression));
    }

    @Test
    public void checkBracketOpenMoreClose() {
        String expression = "(([])";

        assertFalse(BracketsChecker.checkBracket(expression));
    }

    @Test
    public void checkBracketCloseMoreOpen() {
        String expression = "([]))";

        assertFalse(BracketsChecker.checkBracket(expression));
    }
}