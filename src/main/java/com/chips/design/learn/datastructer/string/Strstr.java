package com.chips.design.learn.datastructer.string;

public class Strstr {


    /**
     * 滑动窗口法，滑动窗口，截取父字符串中对应长度的字符串，与子字符串比较
     * @param haystack
     * @param needle
     * @return
     */
    public int solution1(String haystack, String needle){
            int l=haystack.length();
            int n=needle.length();
            for (int i=0;i<l-n+1;i++){
                if (haystack.substring(i,i+n).equals(needle)){
                    return i;
                }

            }
            return -1;
    }
}
