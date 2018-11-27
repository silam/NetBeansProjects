/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxheapify;

/**
 *
 * @author slam1
 * https://www.unf.edu/~wkloster/3540/heap.java
 */
public class MaxHeapify {

    /**
     * @param args the command line arguments
     */
    
    static int [] arr = new int[8];
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        arr[0] = 3;
        arr[1] = 37;
        arr[2] = 33;
        arr[3] = 43;
        arr[4] = 673;
        arr[5] = -3;
        arr[6] = -93;
        arr[7] = 31;
        BuildMaxHeap();
    }
    public static void BuildMaxHeap()
    {
        for (int i = arr.length/2 - 1; i>= 0; i--)
        {
            maxHeapify1(i);
        }
    }
    
    public static void maxHeapify(int i)
    {
        int left, right, min, tmp;
        int n = arr.length;
        left = 2*i + 1;
        right = 2*i + 2;
        
        if ( left < n && arr[left] <  arr[i])
        {
            min = left;
        }
        else
        {
            min = i;
        }
        
        if ( right < n && arr[right] < arr[min])
        {
            min = right;
        }
        
        if ( min!= i)
        {
            tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
            
            maxHeapify(min);
        }
    }
    
    
    public static void maxHeapify1(int i)
    {
        int left, right, max, tmp;
        int n = arr.length;
        left = 2*i + 1;
        right = 2*i + 2;
        max = i;
        
        if ( left < n && arr[left] >  arr[max])
        {
            max = left;
        }
        
        
        if ( right < n && arr[right] > arr[max])
        {
            max = right;
        }
        
        if ( max != i)
        {
            tmp = arr[i];
            arr[i] = arr[max];
            arr[max] = tmp;
            // Recursively heapify the affected sub-tree 
            maxHeapify1(max);
        }
    }
}
