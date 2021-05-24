package com.chips.design.learn.datastructer.array;

import java.util.*;

/**
 * 给定词排序
 */
public class Sorted {

    public static List<String> getSorted(List<String> worldList) {

        Map<String, Integer> sortMap = new HashMap<>();

        for (String s : worldList) {
            if (sortMap.get(s) == null) {
                sortMap.put(s, 0);
            }

            Integer times = sortMap.get(s);
            sortMap.put(s, ++times);
        }


        List<Map.Entry<String, Integer>> list = new ArrayList<>(sortMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> world, Map.Entry<String, Integer> world1) {
                if (world.getValue() == world1.getValue()) {
                    return world1.getKey().charAt(0) - world.getKey().charAt(0);
                }
                return world1.getValue() - world.getValue();
            }
        });
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : list) {
            resultList.add(entry.getKey());
        }

        return resultList;

    }


    public static void main(String[] args) {

        List<String> a = new ArrayList<>();
        a.add("aa");
        a.add("bb");
        a.add("aa");

        List<String> sorted = getSorted(a);


        for (String s : sorted) {
            System.out.println(s);
        }

    }


}
