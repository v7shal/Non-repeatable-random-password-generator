package com.vishal.passwordgenerator;

import java.security.SecureRandom;

public class PasswordGen {

    public static String generateRandomPassword(int len) {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int len = 10; // Change the desired password length
        System.out.println(generateRandomPassword(len));
    }
}

