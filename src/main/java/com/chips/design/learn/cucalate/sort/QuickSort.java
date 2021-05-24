package com.chips.design.learn.cucalate.sort;


/**
 * 快速排序：
 * 选择一个基准数字，大于基准的数字放在右边吧，小于基准的数字放在左边，递归调用完成排序
 */
public class QuickSort {


    public static void main(String[] args) {
        int[] nums = {1, 7, 5, 4, 3, 3, 4, 2};
        quickSortHelper(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void quickSortHelper(int[] nums, int start, int end) {
        if (start > end) {
            return;
        }
        int i = start;
        int j = end;
        int index = nums[start];

        while (i < j) {
            //从右往左遍历，如果取到的数大于基准值则不交换
            while (index <= nums[j] && i < j) {
                j--;
            }

            //从左往右遍历，如果取到的数小于基准数则不交换
            while (index > nums[i] && i < j) {
                i++;
            }

            //找到两个都不满足上述遍历的值时,交换两值
            if(i<j){
                int tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
            }
        }

        //将索引值和重合位置的值交换
        nums[start]=nums[i];
        nums[i]=index;

        //递归调用左右
        quickSortHelper(nums,start,j-1);
        quickSortHelper(nums,j+1,end);

    }
}
