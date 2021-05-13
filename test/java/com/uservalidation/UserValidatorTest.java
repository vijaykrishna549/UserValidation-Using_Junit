package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidatior validatior = new UserValidatior();
        boolean result = validatior.validateFirstName("Narayan");
       // Assertions.assertEquals(true, result);
        Assertions.assertTrue(result);
    }
}
