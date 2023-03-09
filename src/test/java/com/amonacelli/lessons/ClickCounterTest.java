package com.amonacelli.lessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClickCounterTest {

    @Test
    void getValue() {
        //Inside the test methods you can write code snippets that will be run once you launch the test(s)
        ClickCounter cc = new ClickCounter();
        cc.click();
        cc.click();
        assertEquals(2, cc.getValue()); //tests are based on assert methods --> in this case the first parameter is the expected value, while the second value is the value to test
    }

    @Test
    void click() {
    }

    @Test
    void undo() {
    }

    @Test
    void reset() {
    }
}