package com.chips.design.learn.cucalate;

public class BainarySearch {


    public static int search(int[] arr, int target) {
        int start = 0;

        int end = arr.length - 1;

        while (start <= end) {

            int middle = (start + end) / 2;

            if (target == arr[middle]) {
                return middle;
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


    public static void main(String[] args) {
        int[] a = {2, 4, 6, 7, 9, 11};

        System.out.println(search(a,6));
    }

}
