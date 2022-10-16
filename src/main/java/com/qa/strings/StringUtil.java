package com.qa.strings;

public class StringUtil {

    private static String emailValidationPattern =  "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";

    public static int wordCount(String str) {
        return str.split("\s").length;
    }

    public static boolean isValidEmail(String address ) {
        return address.matches(emailValidationPattern);
    }
}