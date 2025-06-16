package tests;

import org.junit.jupiter.api.Test;

import reverse.StringReverser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;



class TestStringReverser {
    private static StringReverser reverser;

    @BeforeAll
    public static void setup() {
        reverser = new StringReverser();
    }

    @Test
    void testReverseString() {
        String input = "hello";
        String expected = "olleh";
        String actual = reverser.reverseString(input);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseEmptyString() {
        String input = "";
        String expected = "";
        String actual = reverser.reverseString(input);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseBlankString() {
        String input = "   ";
        String expected = "   ";
        String actual = reverser.reverseString(input);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseSentence() {
        String input = "Hello World";
        String expected = "dlroW olleH";
        String actual = reverser.reverseSentence(input);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseEmptySentence() {
        String input = "";
        String expected = "";
        String actual = reverser.reverseSentence(input);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseBlankSentence() {
        String input = "   ";
        String expected = "   ";
        String actual = reverser.reverseSentence(input);
        assertEquals(expected, actual);
    }



}

   