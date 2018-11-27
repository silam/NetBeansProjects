/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertheap;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author slam1
 */
public class InsertHeap {

    public class HeapArray<T extends Comparable<T>>
    {
        public List<T> items  = new ArrayList<T>();
        
        public void insert(T item)
        {
            items.add(item);
            siftup();
        }
        
        public void siftup()
        {
            // after insert, the new item at the end of the list
            int k = items.size() -1;
            while( k > 0)
            {
                int p = (k-1)/2;

                T child = items.get(k);
                T parent = items.get(p);
                
                if ( child.compareTo(parent) > 0)
                {
                    items.set(k, parent);
                    items.set(p, child);
                    
                    k = p;
                }
                else
                {
                    break;
                }
            }
        }
        
        T delete() throws NoSuchElementException
        {
            if ( items.size() == 0)
                throw new NoSuchElementException();
            
            if ( items.size() == 1)
                return items.remove(0);
            
            T hold = items.get(0);
            items.set(0, items.remove(items.size() - 1));
            
            siftdown();
            return hold;
            
            
        }
        
        public int size()
        {
            return items.size();
        }
        
        public boolean isEmpty()
        {
            return items.isEmpty();
        }
        public String toString()
        {
            return items.toString();
        }
        public void siftdown()
        {
            // siftdown when remote the top item from the heap
            int k = 0;
            int leftchild = 2*k+1;
            
            while ( leftchild < items.size())
            {
                int max = leftchild;
                int rightchild = leftchild + 1;
                
                if ( rightchild < items.size())
                {
                    if ( items.get(rightchild).compareTo(items.get(leftchild)) > 0)
                    {
                        max++;
                    }
                }
                
                if ( items.get(k).compareTo(items.get(max)) > 0)
                {
                    // swap
                    T temp = items.get(max);
                    items.set(max, items.get(k));
                    items.set(k, temp);
                    
                    k = max;
                    leftchild = 2*k + 1;
                }
                else
                {
                    break;
                }
            }   
            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
}
