package com.leetcode.easy;

import com.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

//leetcode #112
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;

        if(root.left == null && root.right == null && sum - root.val == 0) return true;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
