package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    private String firstLastNamePattern = "[A-Z][a-z]{2}[a-z]*";

    public boolean firstNameTesting(String firstName){
            return Pattern.matches(firstLastNamePattern, firstName);
        }
}

