/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

https://www.youtube.com/watch?v=as1f6PJmbAE&list=PLQ8yNWdQZuMMK_wJk37OT7VgmTT_sgDSt&index=1


CollabEdit, CoderPad, CodePen
Practicing increases your skills, and being 
prepared makes you calm. So devote time to taking practice tests before the 
interview. We like Codewars. And Topcoder and HackerRank. 
If you want to try a mock live-interview coding test, try Pramp or Gainlo.

 */
package treequestions;

import java.util.List;

/**
 *
 * @author slam1
 */
public class TreeQuestions {

    
    
    
    public class TreeNode
    {
        int value;
        TreeNode left;
        TreeNode right;
        
        
    }
    // flatten binary tree to linked list
    // reverse preOrder
    public static void flatten(TreeNode root)
    {
        TreeNode preNode = null;
        setFlatten(root, preNode);
    }
    
    public static void setFlatten(TreeNode root, TreeNode preNode)
    {
        if ( root != null)
        {
            setFlatten(root.right, preNode);
            setFlatten(root.left, preNode);
            
            root.right = preNode[0];
            root.left = null;
            
            preNode[0] = root;
        }
    }
    
    
    // same tree
    // leetcode https://www.youtube.com/watch?v=as1f6PJmbAE&list=PLQ8yNWdQZuMMK_wJk37OT7VgmTT_sgDSt&index=1
    // victor tang
    
    public static boolean isSameTree(TreeNode p, TreeNode q)
    {
        if ( p == null && q == null) 
            return true;
        
        else if ( p != null && q != null && p.value == q.value )
        {
            return ( isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
        }
        else 
            return false;
    }
    
    //////////////////////////////////////
    // symmetric tree
    
    public static boolean isSymmetric(TreeNode node)
    {
        if ( node == null) return true;
        
        return isSymmetricNode(node.left, node.right);
        
        
    }
    
    public static boolean isSymmetricNode(TreeNode left, TreeNode right)
    {
        if ( left == null && right == null) return true;
        
        else  
                return (isSymmetricNode(left, right) && isSymmetricNode(right, left));
    }
    
    
    // balance binary tree
    public static boolean isBalanced(TreeNode node)
    {
        return !(height(node) == -1);
    }
    
    public static int height(TreeNode node)
    {
        if ( node == null) return 0;
        
        int lH = height(node.left);
        int rH = height(node.right);
        
        
        if ( lH == -1 || rH == -1 || Math.abs((lH-rH)) > 1) return -1;
        
        return Math.max(lH, rH) + 1;
        
    }
    
    // minimun depth of binary tree
    
    public static int minDepth(TreeNode root)
    {
        if ( root == null)
            return 0;
        
        if ( root.left == null && root.right == null){ 
            return 1;        
        }
        else if ( root.left == null)
        {
            return minDepth(root.right) + 1;
        }
        else if ( root.right == null)
            return minDepth(root.left) + 1;
        else
        {
            return (Math.min( minDepth(root.left), minDepth(root.right)) + 1 );
        }
    }
    
    public static int maxDepth(TreeNode root)
    {
        if ( root == null) return 0;
        
        return Math.max(maxDepth(root.left), maxDepth(root.right)   ) + 1;
    }
    
    
    // contruct binary tree from PreOrder and InOrder traversal
    public  TreeNode buildTree(List<Integer> preorder, List<Integer> inorder)
    {
        if ( inorder.size() > 0)
        {
            int preorderroot = preorder.get(0);
            preorder.remove(0);
            
            TreeNode root = new TreeNode(inorder.get(preorderroot));
            
            root.left = buildTree(preorder, inorder.subList(0, preorderroot));
            root.right = buildTree(preorder, inorder.subList(preorderroot + 1, inorder.size()));
                   
            return root;
        }
        
        // binary tree right side view
        
        public static void rightSideView(TreeNode root)
        {
            List<Integer> res = new List<Integer>();
            
            rightView(root, res,0);
            
            
            
            
        }
        public static List<Integer> rightView(TreeNode root, List<Integer> res, int level)
        {
            if ( root == null)
            {return null;}
            
            if (level == res.size())
            {
                res.set(level, root.value);
            }
            
            rightView(root.right, res, level+1);
            rightView(root.left, res, level+1);
            
            return res;
        }
        
        
        // graph valid tree
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    
    
}
 