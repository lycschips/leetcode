package com.chips.design.learn.cucalate.simple;


import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和，数组中存在两数之和等于目标数，如果存在两数之和等于目标数，则返回他们的下标
 */
public class TwoSum {


    public static int[] solution(int[] nums, int target) {

        int index = 0;

        int length = nums.length;

        while (index < length) {

            int currIndex = index + 1;

            if (currIndex > length) return new int[0];

            while (currIndex < length) {
                if (nums[index] + nums[currIndex] == target) {
                    return new int[]{index, currIndex};
                }
                currIndex++;
            }

            index++;
        }
        return new int[0];
    }


    public static int[] solution2(int[] nums, int target) {
        Map<Integer, Integer> targetMap = new HashMap<>(nums.length);
        int index = 0;
        for (int num : nums) {
            targetMap.put(num, index);
            index++;
        }

        int resultIndex = 0;
        for (int num : nums) {
            Integer integer = targetMap.get(target - num);
            if (integer != null) {
                return new int[]{resultIndex, integer};
            }resultIndex++;
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b = 9;
        int[] solution = solution2(a, b);
        for (int i : solution) {
            System.out.println(i);
        }
    }
}
