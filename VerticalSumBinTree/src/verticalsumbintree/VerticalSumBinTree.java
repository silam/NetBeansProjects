/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verticalsumbintree;

import java.util.LinkedList;
import java.util.List;
import org.w3c.dom.Node;
import static verticalsumbintree.VerticalSumBinTree.sum0;

/**
 *
 * @author slam1
 */
public class VerticalSumBinTree {

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
        
        head.distance = 0;
        AssignDistance(head);
        
        Sum(head);
    }
    public static int sum0 = 0;
    public static int sumP1 = 0;
    public static int sumP2 = 0;
    public static int sumP3 = 0;
    
    public static int sumM1 = 0;
    public static int sumM2 = 0;
    public static int sumM3 = 0;
    
    
    public static void Sum(Node head)
    {
        if ( 0 == head.distance )
        {
            sum0 = sum0 + head.data;
        }
        if ( 1 == head.distance )
        {
            sumP1 = sumP1 + head.data;
        }
        if ( 2 == head.distance )
        {
            sumP2 = sumP2 + head.data;
        }
        
        if ( -1 == head.distance )
        {
            sumM1 = sumM1 + head.data;
        }
        
        if ( -2 == head.distance )
        {
            sumM2 = sumM2 + head.data;
        }
        
        if ( head != null && head.left != null)
        {
            head.left.distance = head.distance - 1;
            
            Sum(head.left);
        }
        
        if ( head != null && head.right != null)
        {
            head.right.distance = head.distance + 1;
            Sum(head.right);
        }
    }
    public static void AssignDistance(Node head)
    {
        if ( head != null && head.left != null)
        {
            head.left.distance = head.distance - 1;
            
            AssignDistance(head.left);
        }
        
        if ( head != null && head.right != null)
        {
            head.right.distance = head.distance + 1;
            AssignDistance(head.right);
        }
        

    }
    
    
}
