package com.leetcode.medium;

import com.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode #113
public class PathSumII {

    List<List<Integer>> list = new ArrayList<List<Integer>>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> resList = new ArrayList<Integer>();

        pathSum(root, targetSum, resList);

        return list;
    }

    private void pathSum(TreeNode root, int targetSum, List<Integer> resList) {
        if(root==null) return;

        resList.add(root.val);
        pathSum(root.left, targetSum-root.val, resList);
        pathSum(root.right, targetSum-root.val, resList);

        if(root.left == null && root.right==null && targetSum- root.val==0) list.add(new ArrayList<>(resList));
        resList.remove(resList.size()-1);
    }
}
