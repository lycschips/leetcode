package com.chips.design.learn.datastructer.string;

/**
 * 翻转字符串
 *
 */
public class ReverseString {

    public void solution(char[] s){

        int startPtr=0;
        int endPtr=s.length-1;
        while (startPtr!=endPtr){

            char temp=s[startPtr];

            s[startPtr]=s[endPtr];

            s[endPtr]=s[startPtr];

            startPtr++;

            endPtr--;

        }
    }
}
