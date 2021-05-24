package com.chips.design.learn.cucalate.middle;


/**
 * 最长回文子串
 */
public class LongestPalindrome {

    public String longestPalindrome(String s) {

        int length = s.length();
        if (length < 2) {
            return s;
        }

        char[] chars = s.toCharArray();

        int maxLength = 1;
        int begin = 0;

        for (int i = 0; i < chars.length; i++) {

            for (int j = i + 1; j < chars.length; j++) {
                if (j - i + 1 > maxLength && judgePalindrome(chars, i, j)) {
                    maxLength = j - i + 1;
                    begin = i;

                }

            }
        }

        return s.substring(begin,begin+maxLength);

    }


    public Boolean judgePalindrome(char[] c, int start, int end) {
        while (start < end) {
            if (c[start] != c[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
