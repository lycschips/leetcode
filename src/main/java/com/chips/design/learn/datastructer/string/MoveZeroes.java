package com.chips.design.learn.datastructer.string;


/**
 * 将数组中所有为0的元素移动到数组的末尾
 * 必须在原来的数组上操作
 */
public class MoveZeroes {
    public void solution(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int ptr = i + 1;
            if (nums[i] == 0) {
                while (ptr < nums.length) {
                    if (nums[ptr] != 0) {
                        int temp = nums[i];
                        nums[i] = nums[ptr];
                        nums[ptr] = temp;
                        break;
                    }
                    ptr++;
                }
            }
        }
    }

}
