package com.chips.design.learn.datastructer.array;

public class MiddlIndex {

    public static  int solution(int[] nums){

            int sum=0;

            int leftsum=0;

            for(int i=0;i<nums.length;i++) {
                sum += nums[i];
            }

                for(int j=0;j<nums.length;j++){
                    if (sum==sum-nums[j]-leftsum){
                        return j;
                    }
                }
            return -1;
    }

    public static void main(String[] args) {
        String s="stdio.h";

        char c = s.charAt(0);
        System.out.println(c);
    }


}
