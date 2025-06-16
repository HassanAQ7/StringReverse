package tests;

import org.junit.jupiter.api.Test;

import reverse.StringReverser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;



class TestStringReverser {
    private StringReverser reverser;

    @BeforeAll
    public void setup() {
        reverser = new StringReverser();
    }

    @Test
    void testReverseString() {
        String input = "hello";
        String expected = "olleh";
        String actual = reverser.reverseString(input);
        assertEquals(expected, actual, "The reversed string should match the expected output.");
    }

    @Test
    void testReverseEmptyString() {
        String input = "";
        String expected = "";
        String actual = reverser.reverseString(input);
        assertEquals(expected, actual, "Reversing an empty string should return an empty string.");
    }

    @Test
    void testReverseBlankString() {
        String input = "   ";
        String expected = "   ";
        String actual = reverser.reverseString(input);
        assertEquals(expected, actual, "Reversing a blank string should return the same blank string.");
    }

    @Test
    void testReverseSentence() {
        String input = "Hello World";
        String expected = "dlroW olleH";
        String actual = reverser.reverseSentence(input);
        assertEquals(expected, actual, "The reversed sentence should match the expected output.");
    }

    

}

   