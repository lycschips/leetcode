package com.chips.design.learn.cucalate.simple;


/**
 * 找出数组中只出现一次的数字
 */
public class Single {

    public int solution(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;

    }


}
