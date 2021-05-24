package com.chips.design.learn.cucalate.simple;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 字符串中第一个唯一的字符
 */
public class FirstUniqChar {

    public static int firstUniqChar(String s) {

        if (s.length() == 0) {
            return -1;
        }

        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                Integer times = map.get(aChar);
                times += 1;
                map.put(aChar, times);
            } else {
                map.put(aChar, 1);
            }
        }

        for (char aChar : chars) {
            Integer times = map.get(aChar);
            if (times<2){
                return s.indexOf(aChar);
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int aabb = firstUniqChar("sdnvlbkrmtbollujsdjfjfppksravjkwwsimlmdtcmiilpjibjhcppluisqbqfwrjjlrapsmcwrsrnfrmtjrffpuuqwonqfjfqxellpvmcfmhxccljqlvboioelpfcaw");
        System.out.println(aabb);
    }
}
