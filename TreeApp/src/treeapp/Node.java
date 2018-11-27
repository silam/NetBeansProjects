/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeapp;

/**
 *
 * @author slam1
 */


public class Node<E> extends Comparable implements Tree<E> {
    
    public E value;
    public Node<E> left;
    public Node<E> right;
    
    @Override
    public boolean search(E tofind)
    {
        boolean found = false;
        
        if ( tofind.equals(value)) 
        {
            found  = true;
        }
        
        if ( tofind.compareTo(value) < 0)
        {
            return left.search(tofind);
        }
        
        if ( tofind.compareTo(value) > 0 )
        {
            return right.search(tofind);
        }
        
        return found;
    }
    
    @Override
    public void insert(E toinsert)
    {
        if ( toinsert.compareTo(value) > 0)
        {
            if ( right == null)
            {
                right = new Node<E>();
                right.value = toinsert;
            }
            else
            {
                right.insert(toinsert);
            }
        }
        else if ( toinsert.compareTo(value) < 0)
        {
            if ( left == null )
            {
                left = new Node<E>();
                left.value = toinsert;
            }
            else
            {
                left.insert(toinsert);
            }
        }
        else
        {
            return;
        }
    }
}
