package com.chips.design.learn.datastructer.string;


/**
 * 旋转数组，将数组旋转K步，要求不适用额外的空间
 */
public class Rotate {

    public static void solution(int[] nums, int k) {

        if (nums.length == 0) {
            return;
        }

        k = k % nums.length;

        int count = 0;

        for (int i = 0; count < nums.length; i++) {
            int current = i;
            int prev = nums[i];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (i != current);

        }
    }

    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int k=3;

        solution(nums,k);

    }

}
