package com.example.ghadikashgari.validator_a2;

/**
 * Created by GhadiKashgari on 2018-02-10.
 */

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class ValidatorJUnitTest {
    static passwordValidator v;

    @BeforeClass
    public static void init() {
        v = new passwordValidator();
        v.setPassword("Randomword");
    }

    @Test
    public void lengthChecker() {
        assertEquals(true, v.passwordLength(v.getPassword()));
    }

    @Test
    public void compareChecker() {
        assertEquals(true, v.compare(v.getPassword()));
    }

    @Test
    public void passwordIsCorrect() {
        assertEquals(2, v.Validate(v.getPassword()));
    }
}