/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leastcommonmultiplejavaapp;

/**
 *
 * @author slam1
 */
public class LeastCommonMultipleJavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        gcd(4,2);
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 7;
        arr[2] = 3;
        arr[3] = 9;
        arr[4] = 4;
        FindLeastCommonMultiple(arr)      ;
        
    }
    public static void FindLeastCommonMultiple(int[] arr)
    {
        int ans = arr[0];
        int LCM = 0;
        int multiple = 0;
        
        ans = (ans*arr[1])/gcd(ans, arr[1]);
        
        for ( int i = 2; i < arr.length; i++)
        {
            ans = (ans*arr[i])/gcd(ans, arr[i]);
            
        }
        
        System.out.print(ans);
    }
    
    public static int gcd(int a, int b)
    {
        if (b==0)
            return a;
        
        return gcd(b, a%b);
    }
}
