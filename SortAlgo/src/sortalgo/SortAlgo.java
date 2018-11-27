/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortalgo;

/**
 *https://www.youtube.com/watch?v=IlRyO9dXsYE
 * @author slam1
 */
public class SortAlgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    int [] a;
    int [] b;
    
    int arraySize;
    
    public void shellsort()
    {
        int inner, outer, temp;
        int interval = 1;
        int [] theArray = new int[10];
        while ( interval <= arraySize / 3)
        {
            interval = interval*3 + 1;
            
            while (interval > 0)
            {
                for ( outer = interval; outer < arraySize; outer++)
                {
                    temp = theArray[outer];
                    inner = outer;
                    while ( inner > interval - 1 && theArray[inner - interval] >= temp)
                    {
                        theArray[inner] = theArray[inner-interval];
                        inner = inner - interval;
                    }
                    
                    theArray[inner] = temp;
                }
                
                interval = (interval - 1)/3
            }
        }
    }
    // insertion sort
    public int[] insertionSort(int[] list)
    {
        int i,j,key, temp = 0;
        for (int = 1; i < list.length; i++)
        {
            key = list[i];
            j = i - 1;
            
            while ( j >= 0 && key < list[j])
            {
                // swap
                temp = list[j];
                list[j] = list[j+1];
                list[j+1] = temp;
                
                j--;
            }
        }
    }
    
    // selection sort
    public int[] selectionSort(int[] list)
    {
        int minValue, minIndex, temp = 0;
        
        for ( int i = 0; i < list.length; i++)
        {
            minValue = list[i];
            minIndex = i;
            
            
            for ( int j = i; j < list.length; j++)
            {
                if ( list[j] < minValue)
                {
                    minValue = list[j];
                    minIndex = j;
                }
            
            }
            
            
            if ( minValue < list[i])
            {
                temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
    }
    
    ///////////// quick short
    public void swap(int left, int righ)
    {
        
    }
    public int partition(int left, int right, int pivot)
    {
        int leftpointer = left-1 ;
        int rightpointer = right;
        
        while(true)
        {
            while ( a[++leftpointer] <= pivot)
            {
                // do nothing
            }
            while ( rightpointer > 0 && a[--rightpointer] > pivot)
            {
                // do nothing
            }
            
            if ( leftpointer >= rightpointer) break;
            else
            {
                swap(leftpointer, rightpointer);
            }
            
        }
        
        swap(leftpointer, right);
        return leftpointer;
        
    }
    public  void quicksort(int left,int right)
    {
        int pivot = a[right];
        int partitionpoint = partition(left, right, pivot);
        
        quicksort(left, partitionpoint - 1);
        quicksort(partitionpoint+1, right);
        
    }
    
    // quick sort
    
    
    
    
    // buble sort
    
    public void bubbleSort()
    {
        int temp, i,j;
        for ( i = 0; i < a.length; i++)
        {
            boolean swap = false;
            for (j=0; j < a.length - i; j++)
            {
                if (a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    
                    swap = true;
                }
                else
                {
                    // not swap
                }
            }
            
            if ( swap == false) break;
        }
    }
    
    
    // Merge sort
    // O(nlogn)
    // space O(n)
    
    public void sortMerge(int low, int high)
    {
        int mid;
        
        if ( low < high)
        {
            mid = (low + high)/ 2;
            sortMerge(low, mid);
            sortMerge(mid+1 , high);
            merging(low, mid, high);
        }
        else
            return;
    }
    
    public void merging(int low, int mid, int high)
    {
        int l1, l2, i;
        
        // while a and b have elements
        for (  l1 =low, l2 = mid + 1, i = low;
                  l1 <= mid && l2 <= high;
                  i++)
        {
            if ( a[l1] <= a[l2])
                b[i] = a[l1++];
            else
                b[i] = a[l2++];
            
            
        }
        
        while ( l1 <= mid)
            b[i++] = a[l1++];
        
        while ( l2 <= high)
            b[i++] = a[l2++];
        
        for ( i = low; i <= high; i++)
        {
            a[i] = b[i];
        }
    }
    
}
