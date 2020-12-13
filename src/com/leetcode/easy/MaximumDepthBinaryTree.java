package com.leetcode.easy;

import com.leetcode.util.TreeNode;

//leetcode #102
public class MaximumDepthBinaryTree {
		
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
