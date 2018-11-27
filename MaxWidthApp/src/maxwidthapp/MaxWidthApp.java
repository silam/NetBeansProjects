/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxwidthapp;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author slam1
 */
public class MaxWidthApp {

    private static class Node
    {
         public int data;
         public int distance;
         public Node left;
         public Node right;
         public Node(int _data)
         {
             this.data = _data;
         }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Node> listnode = new LinkedList<Node>();
        
        Node head = new Node(4);
        head.left = new Node(5);
        head.right = new Node(9);
        head.left.left = new Node(15);
        head.left.right = new Node(50);
        
        head.right.left = new Node(25);
        head.right.right = new Node(45);
        
        //postOrder(head);
        
        int max = MaxWidth(head.left) + MaxWidth(head.right);
        
    }
    public static int max = -1;
    public static int MaxWidth(Node head)
    {
        Queue<Node> q = new LinkedList<Node>();
                
        
            if ( head.left != null)
            {
                q.add(head.left);
            }
            
            if ( head.right != null)
            {
                q.add(head.right);
            }
            
            int temp = q.size();
            if ( temp > max)
            {
                max = temp;
            }
            q.removeAll(q);
           
            
        return MaxWidth(head.left) + MaxWidth(head.right);
        
    }
    
    public static void postOrder(Node head)
    {
        if ( head != null)
        {
        System.out.println(head.left.data);
        postOrder(head.left);
        System.out.println(head.right.data);
        postOrder(head.right);
        }
    }
}
