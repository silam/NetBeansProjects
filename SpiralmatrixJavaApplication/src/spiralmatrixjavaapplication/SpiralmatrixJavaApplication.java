/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiralmatrixjavaapplication;

/**
 *
 * @author slam1
 */
public class SpiralmatrixJavaApplication {

    /**
     * @param args the command line arguments
     */
    public static int size = 5;
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] arr = new int[size][size];
        int x = 1;
        for ( int i = 0; i < size; i++)
        {
            for (int j = 0;j<size; j++)
            {
                arr[i][j] = x++;
            }
        }
        for ( int i = 0; i < size; i++)
        {
            for (int j = 0;j<size; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
        }
        
        System.out.println();
        printSpiral(arr);
        
        System.out.println();
        
    }
    public static void printSpiral(int[][] arr)
    {
        int n = size;
        int m = size;
        int num = n*m;
        int x = 0;
        int row = 0, col = 0;
        int c = 0,r = 0;
        int firstrow = 0, firstcol  = 0;
        while (x < num)
        {
            // row = 0;
            for (  c = col ; c < n; c++)
            {
                System.out.print(arr[row][c] + " ");
                x++;
                
                if ( x >= num) break;
            }
            
            
            n--;
             col = c-1;
            for ( r = row + 1; r < m; r++)
            {
                System.out.print(arr[r][col] + " ");
                x++;
                if ( x >= num) break;
            }
            
            
            
            m--;
            row = r-1;
            for ( c = col-1; c >= firstcol; c--)
            {
                System.out.print(arr[row][c] + " ");
                x++;
                if ( x >= num) break;
            }
            
            
            firstcol++;
            col = c+1;
            for ( r = row-1; r > firstrow; r--)
            {
                System.out.print(arr[r][col] + " ");
                x++;
                if ( x >= num) break;
            }
            firstrow++;
            row = firstrow;
            col++;
            
        }
    }
}
