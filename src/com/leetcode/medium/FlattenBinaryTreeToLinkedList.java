package com.leetcode.medium;

import com.leetcode.util.TreeNode;

//leetcode #114
public class FlattenBinaryTreeToLinkedList {
    private TreeNode prev = null;
    public void flatten(TreeNode root) {
        if(root==null) return;

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }

}

