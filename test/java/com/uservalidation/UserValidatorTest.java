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
    @Test
   public void givenEmail_WhenProper_ShouldReturnTrue()
    {
        UserValidatior validatior = new UserValidatior();

        boolean result = validatior.validateEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);

    }
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue()
    {
        UserValidatior validatior = new UserValidatior();
        boolean result = validatior.validatePhone("91 8504449225");
        Assertions.assertTrue(result);

    }


}
