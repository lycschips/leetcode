package com.chips.design.learn.datastructer.stack;


import java.util.Stack;

/**
 * <p>leetcode 每日温度
 *
 * <p>请根据每日 气温 列表，重新生成一个列表。对应位置的输出为：
 * 要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不
 * 会升高，请在该位置用 0 来代替。
 */
public class DailyTemperatures {

    public int[] solution(int[] T) {

        int length = T.length;

        //新建结果数组，长度取T数组的长度，用于存放结果
        int[] result = new int[length];

        Stack<Integer> tempStack = new Stack<>();

        for (int i = 0; i < length; i++) {
            int current = T[i];

            while (!tempStack.isEmpty() && current > T[tempStack.peek()]) {
                Integer pop = tempStack.pop();
                Integer ans = i - pop;
                result[pop] = ans;
            }
            tempStack.push(i);
        }
        return result;
    }
}
