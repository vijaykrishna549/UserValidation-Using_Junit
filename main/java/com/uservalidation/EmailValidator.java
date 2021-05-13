package com.uservalidation;
import java.util.regex.Pattern;

public class EmailValidator {
    private static final String ALLEMAIL_PATTERN = "^[a-z0-9]{3,6}[.@+-][0-9a-z]{1,}[.,@][a-z]{0,8}[.]*[,.]*[a-z]{2,3}[.,]*[a-z]*[a-z]*$";
    public boolean validateAllEmail(String allemail)
    {
        Pattern pattern = Pattern.compile(ALLEMAIL_PATTERN);
        return pattern.matcher(allemail).matches();
    }
}
