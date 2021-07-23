package com.leetcode.easy;

import com.leetcode.util.TreeNode;

//leetcode #111
public class MinimumDepthBinaryTree {

    public int minDepth(TreeNode root) {
        if(root==null) return 0;

        return minimumHeight(root);
    }

    private int minimumHeight(TreeNode root) {
        if(root==null) return 0;

        int leftHeight = minimumHeight(root.left);
        int rightHeight = minimumHeight(root.right);

        if(leftHeight == 0 || rightHeight == 0){
            return Math.max(leftHeight, rightHeight)+1;
        }else{
            return Math.min(leftHeight, rightHeight)+1;
        }
    }
}
