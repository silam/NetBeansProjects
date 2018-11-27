/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueinterfaceapp;

/**
 *
 * @author slam1
 */
public class QueueArray<T> implements Queue<T> {
    private T[] arr;
    private int total, first, next;
    
    public QueueArray()
    {
        arr = (T[])new Object[2];
    }
    
    private void resize(int capacity)
    {
        T[] temp = (T[]) new Object[capacity];
        
        for (int i = 0; i < total; i++)
        {
            temp[i] = arr[(first + i) % arr.length];
            
            
        }
        
        arr  = temp;
        first = 0;
        next = total;
    }
    public QueueArray<T> enqueue(T ele)
    {
        if (arr.length == total)
            resize(arr.length*2);
        
        arr[next] = ele;
        
        next++;
        
        if ( next == arr.length) next = 0;
        
        total++;
        
        return this;
        
    }
    
    public T dequeue()
    {
        if ( total == 0)
            throw new java.util.NoSuchElementException();
        
        T ele = arr[first];
        
        arr[first] = null;
        
        first++;
        if (first == arr.length)first = 0;
        
        --total;
        
        if (total > 0 && total == arr.length / 4)
            resize(arr.length);
        
        return ele;
        
        
    }
    @Override
    public String toString()
    {
        return java.util.Arrays.toString(arr);
    }
}
