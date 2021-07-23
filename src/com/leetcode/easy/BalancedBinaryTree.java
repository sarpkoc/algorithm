package com.leetcode.easy;

import com.leetcode.util.TreeNode;

//leetcode #110
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;

        return height(root) != -1;
    }

    private int height(TreeNode root) {
        if(root==null) return 0;

        int leftHeight = height(root.left);
        if(leftHeight == -1) return -1;

        int rightHeight = height(root.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight-rightHeight)>1){
            return -1;
        }

        return Math.max(height(root.left), height(root.right))+1;
    }
}
