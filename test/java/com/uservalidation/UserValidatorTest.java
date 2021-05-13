package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidatior validatior = new UserValidatior();
        boolean result = validatior.validateFirstName("Vijay");
       // Assertions.assertEquals(true, result);
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue()
    {
        UserValidatior validatior = new UserValidatior();
        boolean result = validatior.validateLastName("Krishna");
        Assertions.assertTrue(result);
    }
}
