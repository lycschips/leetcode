package com.chips.design.learn.cucalate;

public class Square {
    public static int mySqrt(int x) {
        if (x < 2) return x;
        long num;
        int pivot;
        int left = 2;
        int right = x / 2;

        while (left <= right) {
            pivot = left + (right - left) / 2;

            num = (long) pivot * pivot;

            if (num > x) {

                right = pivot - 1;

            } else if (num < x) {

                left = pivot + 1;

            } else {

                return pivot;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));

        int x= 3+(3-1)/2;
        System.out.println(x);
    }


}
