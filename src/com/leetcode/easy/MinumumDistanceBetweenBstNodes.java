package com.leetcode.easy;

import com.leetcode.util.TreeNode;

//leetcode #783 and #530
public class MinumumDistanceBetweenBstNodes {
	int min = Integer.MAX_VALUE;
    Integer prev = null;

	public static void main(String[] args) {
		TreeNode tree1 = new TreeNode(1);
		TreeNode tree2 = new TreeNode(3);
		TreeNode tree4 = new TreeNode(6);
		
		TreeNode tree3 = new TreeNode(2, tree1, tree2);
		
		TreeNode tree5 = new TreeNode(4, tree3, tree4);
		
		MinumumDistanceBetweenBstNodes min = new MinumumDistanceBetweenBstNodes();
		System.out.println(min.minDiffInBST(tree5));
	}
	
    public int minDiffInBST(TreeNode root) {
    	  if (root == null) return min;
          
    	  minDiffInBST(root.left);
          
          if (prev != null) {
              min = Math.min(min, root.val - prev);
          }
          prev = root.val;
          
          minDiffInBST(root.right);
          
          return min;
    }
}
