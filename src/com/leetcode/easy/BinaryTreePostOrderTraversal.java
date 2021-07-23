package com.leetcode.easy;

import com.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

//leetcode #145
public class BinaryTreePostOrderTraversal {
    private List<Integer> postOrderList = new ArrayList<Integer>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null) return  postOrderList;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        postOrderList.add(root.val);
        return postOrderList;
    }
}
