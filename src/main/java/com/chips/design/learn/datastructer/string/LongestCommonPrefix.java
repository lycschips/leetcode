package com.chips.design.learn.datastructer.string;

public class LongestCommonPrefix {

    public String solution(String[] str) {

        if (str.length == 0) {
            return "";
        }

        //取标识位
        String sign = str[0];

        //标识位指针
        int ptr = 0;

        //最终返回结果
        StringBuilder ans = new StringBuilder("");

        while (ptr < sign.length()) {

            for (int i = 0; i < str.length; i++) {
                if (!str[i].startsWith(sign.substring(0, ptr+1))) {
                    return ans.toString();
                }
                ans.append(sign.charAt(ptr));
            }
        }

        return ans.toString();
    }


    public static void main(String[] args) {
        String a="abcd";
        boolean abd = a.startsWith("abd");
        System.out.println(abd);
    }
}
