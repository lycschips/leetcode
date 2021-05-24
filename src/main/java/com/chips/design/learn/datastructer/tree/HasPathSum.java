package com.chips.design.learn.datastructer.tree;


import java.util.LinkedList;
import java.util.Queue;

/**
 * <p>给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，
 * 这条路径上所有节点值相加等于目标和。</>
 */
public class HasPathSum {


    public boolean solution(TreeNode root, int sum) {

        if (root == null) {
            return false;
        }

        //添加根节点的值
        int result = 0;


        return sumPath(root, result, sum);
    }


    Boolean sumPath(TreeNode node, int result, int sum) {

        if (node == null) {
            return false;
        }

        //如果左子树和右子树均为空，则该节点为子叶节点，判断路径相加是否为最终值
        if (node.left == null && node.right == null) {
            int add = result + node.val;
            if (sum == add) {
                return true;
            } else {
                return false;
            }
        }

        result += node.val;

        return sumPath(node.right, result, sum) || sumPath(node.left, result, sum);
    }


    public boolean solution2(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        Queue<TreeNode> nodeQueue = new LinkedList<>();

        Queue<Integer> valQueue = new LinkedList<>();


        nodeQueue.offer(root);
        valQueue.offer(root.val);

        while (!nodeQueue.isEmpty()) {
            TreeNode currNode = nodeQueue.poll();
            Integer currVal = valQueue.poll();
            if (currNode.left == null && currNode.right == null) {
                if (currVal == sum) {
                    return true;
                }
                continue;
            }
            if (currNode.left != null) {
                nodeQueue.offer(currNode.left);
                valQueue.offer(currNode.val + currVal);
            }

            if (currNode.right != null) {
                nodeQueue.offer(currNode.right);
                valQueue.offer(currNode.val + currVal);
            }

        }

        return false;
    }

}
