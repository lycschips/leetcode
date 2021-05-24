package com.chips.design.learn.cucalate.simple;


/**
 * 翻转字符串
 */
public class ReverseString {

    public void solution(char[] s) {

        int length = s.length;

        int headIdx = 0;
        int tailIdx = length - 1;

        while (headIdx < tailIdx) {

            char temp = s[headIdx];

            s[headIdx] = s[tailIdx];

            s[tailIdx] = temp;

            headIdx++;
            tailIdx--;
        }
    }

}

