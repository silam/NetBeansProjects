/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createbstree;

/**
 *
 * @author slam1
 */
public class CreateBSTree {

    public static class Node
    {
        int value;
        Node left;
        Node right;
        public Node(int data)
        {
            this.value = data;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr = new int[5];
        arr[0] = 5;
        arr[1] = 1;
        arr[2] = 7;
        arr[3] = 9;
        arr[4] = 3;
        
        Node root = null;
        
        for (int i =0; i < arr.length; i++)
        {
            root = Insert(root, arr[i]);
        }
    }
    
    public static Node Insert(Node root, int data)
    {
        if ( root == null)
        {
            root = new Node(data);
            
        }
        else
        {
            if ( data < root.value)
            {
                root.left = Insert(root.left, data);
            }
            if ( data > root.value)
            {
                root.right = Insert(root.right, data);
            }
            
            
        }
        
        return root;
    }
}
