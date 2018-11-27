/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeapp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author slam1
 */
public class TreeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        treeapp.SimpleTree<Integer> root = new treeapp.SimpleTree<Integer>();
        
        root.value = 7;
        root.left = new treeapp.SimpleTree<Integer>();
        root.left.value = 3;
        
        root.right = new treeapp.SimpleTree<Integer>();
        root.right.value = 9;
        
        root.left.left = new treeapp.SimpleTree<Integer>();
        
        root.left.left.value = 1;
        
        root.left.right = new treeapp.SimpleTree<Integer>();
        
        root.left.right.value = 5;
        
        boolean ret = root.search(5);
        
        
        
        
        root.insert(10);
        
        
        levelOrder(root);
        lca1(root, 10, 5);
    }
    
    public static  treeapp.SimpleTree<Integer>  lca1(treeapp.SimpleTree<Integer> root , int v1, int v2) 
    {
            if( v1<root.value && v2<root.value)
                root = lca(root.left,v1,v2);
            else if(v1>root.value && v2>root.value)
                root = lca(root.right,v1,v2);
            return root;
    
    }
    

    public static treeapp.SimpleTree<Integer>  lca(treeapp.SimpleTree<Integer> root , int v1, int v2) 
    {
        
      	// Write your code here.
        ArrayList<Integer> lca_right ;
        ArrayList<Integer> lca_left ;

        lca_right = new ArrayList<Integer>();
        lca_left = new ArrayList<Integer>();
        treeapp.SimpleTree<Integer> temp1 = root;
        treeapp.SimpleTree<Integer> temp2 = root;
        
        if ( temp1 == null) return null;
        else
        {
            while ( temp1 != null)
            {
            if ( v1 > temp1.value)
            {
                if (!lca_right.contains(temp1.value))
                        lca_right.add(temp1.value);
                if ( temp1.right != null)
                {
                    if ( v1 == temp1.right.value)
                        {
                            // stop
                            break;
                        }
                    else{
                        temp1 = temp1.right;
                    }
                }
            }
            else if (v1 < temp1.value)
            {
                if (!lca_right.contains(temp1.value))
                        lca_right.add(temp1.value);
                if ( temp1.left != null){
                    if ( v1 == temp1.left.value)
                    {
                        // stop   
                    }
                    else{
                        temp1 = temp1.left;
                    }
                }
            }
            }
            
            while ( temp2 != null)
            {
            if ( v2 > temp2.value)
            {
                
                
                if (!lca_left.contains(temp2.value))
                        lca_left.add(temp2.value);
                
                if ( temp2.right != null)
                {
                    if ( v2 == temp2.right.value)
                        {
                            // stop
                            break;
                        }
                    else{
                        temp2 = temp2.right;
                    }
                }
            }
            else if (v2 < temp2.value)
            {
                if (!lca_left.contains(temp2.value))
                        lca_left.add(temp2.value);
                if ( temp2.left != null){
                    if ( v2 == temp2.left.value)
                    {
                        // stop   
                    }
                    else{
                        temp2 = temp2.left;
                    }
                }
            }
            }
            
            

        }
        return null;
    }
    
    
    
    public static void levelOrder(treeapp.SimpleTree<Integer> root) {
      
        Queue<treeapp.SimpleTree<Integer>> q = new LinkedList();
        q.add(root);

        while (!q.isEmpty())
       {
           treeapp.SimpleTree<Integer> n = q.poll();
           System.out.print(n.value + " ");

            if ( n.left != null)
                    q.add(n.left);

            if (n.right != null)
                    q.add(n.right);
                    
       }
    }
}
