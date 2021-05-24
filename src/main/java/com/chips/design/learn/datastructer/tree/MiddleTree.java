package com.chips.design.learn.datastructer.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 中序遍历，每次当前节点不为空，即压栈，压栈后寻找该节点的左节点，直到均压入站内
 * 若压至叶子节点则右节点定位空，再次出栈时必为根节点，后再将右节点压入栈内
 * 左子树均弹出后，弹出根节点，后将右子树压入栈内
 */
public class MiddleTree {

    public List<Integer> solution(TreeNode root) {

        List<Integer> outPut = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {

            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            TreeNode node = stack.pop();

            outPut.add(node.val);

            curr = node.right;
        }

        return outPut;
    }

    public List<Integer> solution2(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {

            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            TreeNode pop = stack.pop();
            result.add(pop.val);
            curr = pop.right;

        }

        return result;

    }
}
