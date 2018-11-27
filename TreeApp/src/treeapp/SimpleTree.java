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
public class SimpleTree<E extends Comparable> {
    public E value;
    public SimpleTree<E> left = null;
    public SimpleTree<E> right = null;
    
    
    public boolean search(final E tofind)
    {
        boolean found = false;
        
        if ( tofind.equals(value)) 
        {
            found  = true;
        }
        
        if ( left != null && tofind.compareTo(value) < 0)
        {
            return left.search(tofind);
        }
        
        if ( tofind.compareTo(value) > 0 && right != null)
        {
            return right.search(tofind);
        }
        
        return found;
    }
    
    public void insert(final E toinsert)
    {
        if ( toinsert.compareTo(value) > 0)
        {
            if ( right == null)
            {
                right = new SimpleTree<E>();
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
                left = new SimpleTree<E>();
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
