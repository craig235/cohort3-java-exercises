package com.qa.strings;

import java.util.ArrayList;
import java.util.List;

public class Strings {
    public static void main(String[] args) {

        // Counting words in a string.
        final String sentence = "hello how are you ";
        System.out.println("wc in string is: " + StringUtil.wordCount(sentence.trim()));

        // Array of strings.
        final String[] addressList = new String[]{
                "abc_gmail.com",
                "abcd*()@gmail.com",
                "abcd@gmail.com",
                "test_123@gmail.com",
                "1234@#$@gmail.com"};

        List<String> invalidList = new ArrayList<>();
        List<String> validList = new ArrayList<>();
        for (String address : addressList) {
            if (StringUtil.isValidEmail(address)) {
                validList.add(address);
            } else {
                invalidList.add(address);
            }
        }

        // Reporting
        System.out.println("1) Invalid emails: " + invalidList.size());
        System.out.println("2) Valid emails: " + validList.size());
        System.out.println("3) Valid email list:");
        for (String email : validList) {
            System.out.println("     " + email);
        }
        System.out.println("4) Invalid email list:");
        for (String email : invalidList) {
            System.out.println("     " + email);
        }
    }
}
