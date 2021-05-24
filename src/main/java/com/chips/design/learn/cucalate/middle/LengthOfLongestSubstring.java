package com.chips.design.learn.cucalate.middle;


import java.util.HashMap;
import java.util.Map;

/**
 * 寻找最长不重复子串
 */
public class LengthOfLongestSubstring {


    public int lengthOfLongestSubstring(String s) {

        if (s == null) return 0;

        char[] chars = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        int max = 0;

        for (int start = 0, end = 0; end < s.length(); end++) {

            if (map.containsKey(chars[end])) {
                start = Math.max(map.get(chars[end]), start);
            }
            map.put(chars[end], end + 1);

            max = Math.max(max, end - start + 1);
        }

        return max;
    }


}
