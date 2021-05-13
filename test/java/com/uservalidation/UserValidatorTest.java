package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validatior = new UserValidator();
        boolean result = validatior.validateFirstName("Vijay");
       // Assertions.assertEquals(true, result);
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue()
    {
        UserValidator validatior = new UserValidator();
        boolean result = validatior.validateLastName("Krishna");
        Assertions.assertTrue(result);
    }
    @Test
   public void givenEmail_WhenProper_ShouldReturnTrue()
    {
        UserValidator validatior = new UserValidator();

        boolean result = validatior.validateEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);

    }
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue()
    {
        UserValidator validatior = new UserValidator();
        boolean result = validatior.validatePhone("91 8504449225");
        Assertions.assertTrue(result);

    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue()
    {
        UserValidator validatior = new UserValidator();
        boolean result = validatior.validatePassword("Raman@12");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenAllEmail_WhenProper_ShouldReturnTrue()
    {
        EmailValidator emailValidator = new EmailValidator();
        boolean result = emailValidator.validateAllEmail("abc@yahoo.com");
        Assertions.assertTrue(result);
    }


}
