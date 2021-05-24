package com.chips.design.learn.cucalate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BainarySearchPro {


    /**
     * 给定旋转后的数组
     *
     * @return
     */
    public static int solution(int[] nums, int target) {

        //构建位置集合，存放目标值在原数组中的位置
        Map<Integer, Integer> locationMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            locationMap.put(nums[i], i);
        }

        //将数组排序还原
        Arrays.sort(nums);

        int result = search(nums, target);

        if (result == -1) {
            return -1;
        }

        return locationMap.get(result);
    }


    public static int search(int[] arr, int target) {
        int start = 0;

        int end = arr.length - 1;

        while (start <= end) {

            int middle = (start + end) / 2;

            if (target == arr[middle]) {
                return arr[middle];
            }

            if (target < arr[middle]) {
                end = middle - 1;
            }
            if (target > arr[middle]) {
                start = middle + 1;
            }


        }
        return -1;
    }


    public static int solution1(int[] arr, int target) {
        int leftPtr = 0;

        int rightPtr = arr.length - 1;

        int middle;

        while (leftPtr <= rightPtr) {

            middle = (leftPtr + rightPtr) / 2;

            if (arr[middle] == target) {
                return middle;
            }

            if (arr[middle] < arr[leftPtr]) {

                if (arr[middle] < target && arr[rightPtr] >= target) {

                    leftPtr = middle + 1;

                } else {

                    rightPtr = middle - 1;
                }


            } else if (arr[middle] > arr[leftPtr]) {

                if (arr[middle] > target && arr[leftPtr] <= target) {

                    rightPtr = middle - 1;

                } else {

                    leftPtr = middle + 1;
                }

            } else {

                leftPtr = middle + 1;
            }

        }
            return -1;
    }

    public static void main(String[] args) {
        int[] mus={4,5,6,7,1,2,3};
        int i = solution1(mus, 3);
        int i2 = solution1(mus, 999);
        int i3 = solution1(mus, 6);
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
    }

}
