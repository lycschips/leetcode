package com.chips.design.learn.datastructer.map;


import java.util.ArrayList;;
import java.util.HashMap;
import java.util.List;


/**
 * 两个列表的最小索引总和
 */
public class FindRestaurant {

    public static String[] solution(String[] list1, String[] list2) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> res = new ArrayList<>();

        int min_sum = Integer.MAX_VALUE, sum;

        for (int j = 0; j < list2.length && j <= min_sum; j++) {
            if (map.containsKey(list2[j])) {

            }
        }


        return res.toArray(new String[res.size()]);
    }


    public static void main(String[] args) {
        String[] a = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] b = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};

        String[] solution = solution(a, b);
        for (String s : solution) {
            System.out.println(s);
        }
    }
}
