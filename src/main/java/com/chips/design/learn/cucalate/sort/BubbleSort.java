package com.chips.design.learn.cucalate.sort;


/**
 * 冒泡排序
 */
public class BubbleSort {


    public static void main(String[] args) {
        int[] nums={1,7,5,4,3,3,4,2};

        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if (nums[i]<nums[j]){
                 int temp=nums[i];
                 nums[i]=nums[j];
                 nums[j]=temp;
                }
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }

    }


}
