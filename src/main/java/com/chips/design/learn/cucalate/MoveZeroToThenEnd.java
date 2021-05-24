package com.chips.design.learn.cucalate;

public class MoveZeroToThenEnd {

    /**
     * 移动0至数组末尾
     */
    public static void solution(int[] nums) {
        if (nums == null) {
            return;
        }

        int ptr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp=nums[i];
                nums[i]=nums[ptr];
                nums[ptr]=temp;
                ptr++;
            }
        }

    }

    public static void main(String[] args) {
        int[] testArray = {1, 3, 0, 4, 0};
        solution(testArray);
        for (int i : testArray) {
            System.out.print(i + ",");
        }
    }


}
