package com.leetcode.easy;

import com.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

//leetcode #144
public class BinaryTreePreorderTraversal {
    private List<Integer> preOrderList = new ArrayList<Integer>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return preOrderList;
        preOrderList.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return preOrderList;
    }
}
