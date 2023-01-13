package org.adaschool;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FunctionAssignmentTest {

    @Test
    void isValidEmailTrueTest() {
        try {
            Assertions.assertTrue(Main.isValidEmailAddress("ada@ada-school.org"));
        } catch (AssertionError error) {
            String errorMessage = "Your validation does not accept the valid email address: ada@ada-school.org";
            System.out.println(errorMessage);
            throw new AssertionError(errorMessage, error);
        }
    }

    @Test
    void isNotValidEmailTest1() {
        try {
            Assertions.assertFalse(Main.isValidEmailAddress("adaada-school.org"));
        } catch (AssertionError error) {
            String errorMessage = "Your validation does not cover @ mandatory character validation";
            System.out.println(errorMessage);
            throw new AssertionError(errorMessage, error);
        }
    }

    @Test
    void isNotValidEmailTest2() {
        try {
            Assertions.assertFalse(Main.isValidEmailAddress("adaada-schoolorg"));
        } catch (AssertionError error) {
            String errorMessage = "Your validation does not cover . email extension validation(.com, .org, .co, etc)";
            System.out.println(errorMessage);
            throw new AssertionError(errorMessage, error);
        }
    }

    @Test
    void isNotValidEmailEmptyTest() {
        try {
            Assertions.assertFalse(Main.isValidEmailAddress(""));
        } catch (AssertionError error) {
            String errorMessage = "Your validation does not cover empty strings";
            System.out.println(errorMessage);
            throw new AssertionError(errorMessage, error);
        }
    }
}