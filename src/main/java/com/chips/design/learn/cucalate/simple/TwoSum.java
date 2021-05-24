package com.chips.design.learn.cucalate.simple;


import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和，数组中存在两数之和等于目标数，如果存在两数之和等于目标数，则返回他们的下标
 */
public class TwoSum {


    public int[] solution(int[] nums, int target) {

        int[] result = new int[2];

        if (nums.length == 0) {
            return result;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }


        for (int i = 0; i < nums.length; i++) {

            int num = target - nums[i];

            if (map.containsKey(num)) {
                int idx = map.get(num);
                if (idx != i) {
                    result[0] = i;
                    result[1] = idx;
                }

            }

        }


        return result;
    }
}
