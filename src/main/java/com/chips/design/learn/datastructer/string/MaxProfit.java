package com.chips.design.learn.datastructer.string;


/**
 * 经典的贪心算法，维持一个结果最小值
 *
 */
public class MaxProfit {

    public int solution(int[] nums){
       //维持一个最小值
        int min=Integer.MAX_VALUE;
        int maxPrice=0;
        for(int i=0;i<nums.length;i++){
            //如果当前值小于维护的最小值，则保存当前的值
            if(nums[i]<min){
                min=nums[i];
            }
            //每次对maxPrice赋值时均计算当前值和最小值的差距，维持一个最大值
            maxPrice=Math.max(maxPrice,nums[i]-min);
        }

        return maxPrice;
    }


}
