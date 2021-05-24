package com.chips.design.learn.datastructer.string;


import java.util.HashMap;

/**
 * 寻找最长不重复子字符串，返回不重复子字符串的长度
 * 该方法又被称为滑动窗口法，及区间上两个指针移动，观察区间上的值的变化状况
 */
public class LongOfSubString {

    public int solution(String s){
        int length=s.length();
        int ans=0;

        //定义HashMap存放已经遍历过的字符串
        HashMap<Character,Integer> map=new HashMap<>();

        //循环定义：头尾指针均从字符串头开始循环，尾指针向前移动寻找不重复字符串并记录长度
        for (int start=0,end=0;end<length;end++){

            //取出当前位置尾指针指向的字符
            char curr = s.charAt(end);

            //如果发生重复则将头指针移动至尾指针处
            if(map.containsKey(curr)){
                //使用max比较确保start指针向后移动
                start=Math.max(map.get(curr),start);
            }

            //原先最长值和当前值比较取相对最长
            ans=Math.max(ans,end-start+1);

            //如果map中没有该字符则将该字符放入map集合中
            map.put(s.charAt(end),end+1);

        }

        return ans;
    }


}
