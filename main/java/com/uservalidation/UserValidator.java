package com.uservalidation;
import java.util.regex.*;

import static java.util.regex.Pattern.*;

public class UserValidatior {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }

    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";

    public boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }

    private static final String EMAIL_PATTERN = "^[a-z]{3}[.][xyz]*[@][a-z]{2}[.][co]{2}[.][in]*$";

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    private static final String PHONENUMBER_PATTERN = "^[1-9]{2}\s[1-9][0-9]{9}$";
    public boolean validatePhone(String phone)
    {
        Pattern pattern = Pattern.compile(PHONENUMBER_PATTERN);
        return  pattern.matcher(phone).matches();
    }

    private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@!#]*)[a-zA-Z0-9@!#*]{8,}";
    public boolean validatePassword(String pass)
    {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return  pattern.matcher(pass).matches();
    }


    }





















