package com.chips.design.learn.datastructer.map;


import java.util.HashMap;
import java.util.Map;

/**
 * 存在重复元素 II
 */
public class ContainsNearbyDuplicate {

    public boolean solution(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if ((map.get(nums[i])+i)<=k) {
                    return true;
                }
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
