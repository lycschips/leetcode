package com.chips.design.learn.datastructer.tree;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 前序遍历
 */
public class FrontTree {


    public List<Integer> solution(TreeNode root) {

        List<Integer> outPut = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        if (null == root) {
            return outPut;
        }

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            outPut.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }


        return outPut;
    }


}
