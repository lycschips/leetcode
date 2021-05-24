package com.chips.design.learn.cucalate.simple;


import java.util.ArrayList;
import java.util.List;

/**
 * 给定1个数组表示1个常数，做加一动作
 */
public class PlusOne {


    public static int[] solution(int[] digits) {
        int carry = 0;

        digits[digits.length - 1] = digits[digits.length - 1] + 1;

        List<Integer> l = new ArrayList<>();

        for (int i = digits.length - 1; i >= 0; i--) {

            int sum = (digits[i] + carry) % 10;

            carry = (digits[i] + carry) / 10;



            l.add(sum);
        }

        if (carry != 0) {
            l.add(carry);
        }

        int[] result = new int[l.size()];

        int idx = result.length - 1;
        for (Integer integer : l) {
            result[idx] = integer;
            idx--;
        }

        return result;

    }

    public static void main(String[] args) {
        int[] a = {9,9};
        int[] solution = solution(a);
        for (int i : solution) {
            System.out.print(i+" ");
        }
    }

}
