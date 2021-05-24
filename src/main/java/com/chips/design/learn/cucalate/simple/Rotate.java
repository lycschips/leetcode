package com.chips.design.learn.cucalate.simple;


import java.util.HashMap;
import java.util.Map;

/**
 * 旋转数组
 */
public class Rotate {

    public static void solution(int[] nums, int k) {

        int length = nums.length;

        if (length == 0) {
            return;
        }

        Map<Integer, Integer> locationMap = new HashMap<>();

        for (int i = 0; i < length; i++) {
            int location = (i + k) % length;
            locationMap.put(location, nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = locationMap.get(i);
        }

    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};

        solution(a,1);


        for (int i : a) {
            System.out.print(i+" ");
        }
    }

}
