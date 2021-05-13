package com.uservalidation;
import java.util.regex.*;

import static java.util.regex.Pattern.*;

public class UserValidatior {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateFirstName(String fname)
    {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    public boolean validateLastName(String lname)
    {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }
    private static final String EMAIL_PATTERN = "^[a-z]{3}[.][xyz]*[@][a-z]{2}[.][co]{2}[.][in]*$";
    public boolean validateEmail(String email)
    {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

}
