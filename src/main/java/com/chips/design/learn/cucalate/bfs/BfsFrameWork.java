package com.chips.design.learn.cucalate.bfs;


import com.chips.design.learn.datastructer.LinkedList.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 广度优先框架
 *
 * <P>广度优先框架，广度优先算法优先使用的数据结构为队列，满足分层放入数据元素
 * 而后得出所有可已达到目标得路径
 */
public class BfsFrameWork {

    public int solution(Node start, Node target) {
        //核心数据结构
        Queue<Node> q = new LinkedList<>();
        q.offer(start);

        //避免走回头路
        Set<Node> visited;

        int step = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            //将当前队列中得所有节点向四周扩散
            for (int i = 0; i < q.size(); i++) {
                Node curr = q.poll();

                //重点，判断是否到达重点
                if (curr == target) {
                    return step;
                }


                /*
                    遍历子节点
                    for(Node x:cur.adj()){
                        if(x not in visited){
                            q.offer(x);
                            visited.add(x);
                        }
                    }
                 *
                 */
            }

            //再同一层的值均未找到目标值时，再增加步数
            step++;
        }

        return -1;
    }


}
