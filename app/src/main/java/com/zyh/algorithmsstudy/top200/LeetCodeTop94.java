package com.zyh.algorithmsstudy.top200;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 * 中序遍历就是先左 -> 根 -> 右
 */
public class LeetCodeTop94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        getTree(result, root);
        return result;
    }

    public void getTree(List<Integer> result, TreeNode node) {
        if (node == null) return;

        getTree(result, node.left);
        result.add(node.val);
        getTree(result, node.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
