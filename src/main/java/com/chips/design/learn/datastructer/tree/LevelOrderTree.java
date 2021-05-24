package com.chips.design.learn.datastructer.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTree {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> levels = new ArrayList<>();

        if (root == null) {
            return levels;
        }
        Queue<TreeNode> queue = new LinkedList();

        queue.add(root);

        int level = 0;

        while (!queue.isEmpty()) {

            levels.add(new ArrayList<>());

            int level_length = queue.size();

            for (int i = 0; i < level_length; i++) {

                TreeNode remove = queue.remove();

                levels.get(level).add(remove.val);

                if (remove.left != null) {
                    queue.add(remove.left);
                }
                if (remove.right != null) {
                    queue.add(remove.right);
                }
            }
            level++;
        }
        return levels;
    }
}
