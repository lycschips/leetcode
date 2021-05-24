package com.chips.design.learn.cucalate.middle;


/**
 * 递增的三元子序列
 */
public class IncreasingTriplet {

    public static boolean increasingTriplet(int[] nums) {

        int length = nums.length;

        if (length < 3) {
            return false;
        }


        for (int i = 0; i < length; i++) {

            if (i + 1 < length - 1 && i + 2 < length - 1) {
                if (nums[i] < nums[i + 1] && nums[i + 1] < nums[i + 2]) {
                    return true;
                }
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[] test={2,1,5,0,4,6};

        increasingTriplet(test);


     }
}
