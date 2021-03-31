package com.zyh.algorithmsstudy.study.search;

import java.util.List;
import java.util.Stack;

/**
 * 深度优先搜索
 */
public class DFS {
    /**
     * 树的节点
     */
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public void addNode() {
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(0);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(1);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

    }

    public void dfs(TreeNode node) {
        if (node == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            if (pop.right != null) {
                stack.push(pop.right);
            }
            if (pop.left != null) {
                stack.push(pop.left);
            }
        }
    }
}
