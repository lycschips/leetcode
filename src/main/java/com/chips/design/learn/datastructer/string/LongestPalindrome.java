package com.chips.design.learn.datastructer.string;


/**
 * 最长回文字符串
 */
public class LongestPalindrome {

    /**
     * 尝试暴力解答
     *
     * @param s
     * @return
     */
    public String solution(String s) {

        //判断s的长度，如果S小于2则直接返回
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;

        //转换为数组，减少每次charAt()方法中判断数组越界
        char[] chars = s.toCharArray();

        //此处i，j数组的下标取值，故要注意不能越界
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {

                //如果当前字串的长度大于记录的最长回文子串，且当前串为回文子串，则记录该串
                if (j - i + 1 > maxLen && validPalindromic(chars, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);

    }


    /**
     * 验证回文字符串
     *
     * @return
     */
    private boolean validPalindromic(char[] charArray, int left, int right) {
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
