package com.chips.design.learn.cucalate.simple;


/**
 * 将所有的0移动到数组的末尾
 */
public class MoveZero {

    public void solution(int[] nums) {

        int n = nums.length;

        //指针表示0的位置
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

    }
}
