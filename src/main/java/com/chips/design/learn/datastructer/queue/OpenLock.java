package com.chips.design.learn.datastructer.queue;


import java.util.*;

/**
 * 打开转轮锁(未完成)
 */
public class OpenLock {

    //curr为当前传入的密码值，i为波动的位数
    public String plusOne(String curr, int i) {
        char[] chars = curr.toCharArray();
        if (chars[i] == '9') {
            chars[i] = '0';
        } else {
            chars[i] += 1;
        }
        return new String(chars);
    }

    //传入当前值，i为波动的位数，为0则跳回9
    public String minusOne(String curr, int i) {
        char[] chars = curr.toCharArray();
        if (chars[i] == '0') {
            chars[i] = '9';
        } else {
            chars[i] -= 1;
        }
        return new String(chars);
    }


    public int solution(String[] deadends, String target) {

        //将死亡数组转化为set方便比较
        Set<String> deadSet = new HashSet<>();
        for (String deadend : deadends) {
            deadSet.add(deadend);
        }

        //已经到达过的路径
        Set<String> visited = new HashSet<>();
        visited.add("0000");

        //层序队列
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");

        //最终最少拨动次数
        int touch = 0;

        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                //弹出同层的队列元素
                String curr = queue.poll();

                //如果死亡数组出现该数字，则跳过
                if (deadSet.contains(curr)) {
                    continue;
                }

                //判断是目标值
                if (curr.equals(target)) {
                    return touch;
                }

                for (int j = 0; j < 4; j++) {
                    //将每位的值加减1
                    String up = plusOne(curr, j);
                    if (!visited.contains(up)) {
                        queue.offer(up);
                        visited.add(up);
                    }

                    String down = minusOne(curr, j);
                    if (!visited.contains(down)) {
                        queue.offer(down);
                        visited.add(down);
                    }
                }
            }
            touch++;
        }
        return -1;
    }

    public int solution3(String[] deadends,String target){
        // 记录需要跳过的死亡密码
        Set<String> deadSet = new HashSet<>();
        for (String s : deadends) deadSet.add(s);

        // 记录已经穷举过的密码，防止走回头路
        Set<String> visited = new HashSet<>();
        visited.add("0000");

        // 从起点开始启动广度优先搜索
        Queue<String> q = new LinkedList<>();
        q.offer("0000");


        int step = 0;
        while (!q.isEmpty()) {
            int sz = q.size();
            /* 将当前队列中的所有节点向周围扩散 */
            for (int i = 0; i < sz; i++) {
                String cur = q.poll();
                /* 判断是否到达终点 */
                if (deadSet.contains(cur)){
                    continue;
                }

                if (cur.equals(target))
                    return step;
                /* 将一个节点的未遍历相邻节点加入队列 */
                for (int j = 0; j < 4; j++) {
                    String up = plusOne(cur, j);
                    if (!visited.contains(up)) {
                        q.offer(up);
                        visited.add(up);
                    }
                    String down = minusOne(cur, j);
                    if (!visited.contains(down)) {
                        q.offer(down);
                        visited.add(down);
                    }
                }
            }
            step++;
        }
        // 如果穷举完都没找到目标密码，那就是找不到了
        return -1;
    }





    public int solution2(String[] dead, String target) {

        //死亡数组
        Set<String> deadSet = new HashSet<>(Arrays.asList(dead));

        //已经到达过的路径
        Set<String> pastSet = new HashSet<>();
        pastSet.add("0000");

        //核心数据结构
        Queue<String> queue = new LinkedList<>();
        queue.add("0000");

        //最短路径
        int touch = 0;

        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                String curr = queue.poll();

                //判断是否在死亡数组中
                if (deadSet.contains(curr)) {
                    continue;
                }

                //判断是否命中目标
                if (target.equals(curr)) {
                    return touch;
                }

                for (int j = 0; j < 4; j++) {
                    String up = plusOne(curr, j);
                    if (!pastSet.contains(up)) {
                        queue.add(up);
                        pastSet.add(up);
                    }

                    String down = minusOne(curr, j);
                    if (!pastSet.contains(down)) {
                        queue.add(down);
                        pastSet.add(down);
                    }
                }
            }
            touch++;
        }
        return -1;
    }
}

