/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintreeapp;

import java.util.LinkedList;
import java.util.Queue;


class Node 
{ 
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
} 

/**
 *
 * @author slam1
 */
public class BinTreeApp {

    
    Node root;
    BinTreeApp(int key)
    {
        root = new Node(key);
    }
    
    BinTreeApp()
    {
        root = null;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BinTreeApp tree = new BinTreeApp();
        
        tree.root = new Node(10);
        
        Node left = new Node(11);
        Node right = new Node(9);
        
        
        
        
        tree.root.left = left;
        tree.root.right = right;
        tree.root.left.left = new Node(7);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(8);
        
        inorder(tree.root);
        
        int key = 12;
        insert(tree.root, key);
        
        inorder(tree.root);

    }
    
    public static void insert(Node temp, int key)
    {
        Queue<Node> q = new  LinkedList<Node>();
        
        q.add(temp);
        
        while (!q.isEmpty())
        {
            temp = q.peek();
            q.remove();
            
            if ( temp.left == null)
            {   
                temp.left = new Node(key);
                break;
            }
            else
            {
                q.add(temp.left);
            }
            
            if ( temp.right == null){
                temp.right = new Node(key);
                break;
            }
            else
            {
                q.add(temp.right);
            }
        }
    }
    public static void inorder(Node root)
    {
        if ( root == null) return;
        inorder(root.left);
        System.out.println(root.key);
        inorder(root.right);
    }
}
