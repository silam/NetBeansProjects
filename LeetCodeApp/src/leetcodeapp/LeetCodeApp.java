/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodeapp;

import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.TreeNode;

/**
 *
 * @author slam1
 */
public class LeetCodeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


public class Solution {
    //https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/931/
    public List<Integer> l = new ArrayList<Integer>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if ( root == null) return null;
        l.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
        return l;
        
    }
}
