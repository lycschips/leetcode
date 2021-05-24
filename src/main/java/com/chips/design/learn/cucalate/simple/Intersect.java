package com.chips.design.learn.cucalate.simple;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 求两个数组的交集
 */
public class Intersect {

    public static int[] solution(int[] nums1, int nums2[]) {


        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int idxNums1 = 0;
        int idxNUms2 = 0;


        List<Integer> result = new ArrayList<>();

        while (idxNums1 < nums1.length && idxNUms2 < nums2.length) {


            if (nums1[idxNums1] == nums2[idxNUms2]) {
                result.add(nums1[idxNums1]);
                idxNums1++;
                idxNUms2++;
            }else if (nums1[idxNums1] < nums2[idxNUms2]) {
                idxNums1++;

            } else {
                idxNUms2++;
            }
        }

        int[] result1 = new int[result.size()];
        int idx = 0;
        for (Integer integer : result) {
            result1[idx] = integer;
            idx++;
        }

        return result1;
    }

    public static void main(String[] args) {
        int[] a = {7, 9, 9, 5};

        int[] b = {1, 9, 9};

        int[] solution = solution(a, b);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }

}
