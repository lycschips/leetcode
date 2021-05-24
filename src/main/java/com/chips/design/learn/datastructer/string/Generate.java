package com.chips.design.learn.datastructer.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 * 给定生成的行数，返回指定的结构数组
 */
public class Generate {

    public static List<List<Integer>> solution(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();


        if (numRows == 0) {
            return triangle;
        }

        //初始化三角，将三角形顶端值初始化
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        //循环层数
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);

            //将第一位置为1；
            row.add(1);

            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            //末尾元素为1
            row.add(1);

            triangle.add(row);

        }

        return triangle;
    }


    public static void main(String[] args) {

        solution(2);


        int cycle=0;
        for (int i=1;i<5;i++){
            cycle++;

        }

        System.out.println(cycle);
    }


}
