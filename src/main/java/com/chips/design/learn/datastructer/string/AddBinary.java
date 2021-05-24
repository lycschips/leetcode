package com.chips.design.learn.datastructer.string;


/**
 * 二进制相加
 * 给定两个二进制的数字将其相加后输出
 */
public class AddBinary {

    public String solution(String a, String b) {

        StringBuilder ans = new StringBuilder();

        int ca = 0;

        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {

            int sum = ca;

            sum += i >= 0 ? a.charAt(i) - '0' : 0;

            sum += j >= 0 ? b.charAt(j) - '0' : 0;

            ans.append(sum % 2);

            ca = sum / 2;

        }

        return ans.reverse().toString();

    }


}
