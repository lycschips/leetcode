package com.chips.design.learn.cucalate.sort;


/**
 * 选择排序
 * 记录一个最小值，并始终维护这个最小值
 * 当有值小于最小值时，便将二者的值交换
 * 注意外层循环length-1,比较完内存循环后再交换值
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] nums={1,7,5,4,3,3,4,2};
        for(int i=0;i<nums.length-1;i++){
            int min=i;
            for (int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            if(i!=min){
                int temp=nums[i];
                nums[i]=nums[min];
                nums[min]=temp;
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
