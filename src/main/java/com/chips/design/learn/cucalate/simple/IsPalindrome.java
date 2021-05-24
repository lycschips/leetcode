package com.chips.design.learn.cucalate.simple;

public class IsPalindrome {

    public static boolean isPalindrome(String s) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                builder.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        StringBuilder reversBuilder = new StringBuilder(builder).reverse();


        return reversBuilder.toString().equals(builder.toString());
    }


    public static void main(String[] args) {

        String a="this is a big man";
        boolean palindrome = isPalindrome(a);
        System.out.println(palindrome);
    }

}
