/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapapp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author slam1
 */
public class MapApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Map<String, String> pref = new HashMap<String, String>();
        pref.put("like", "Zacozi");
        pref.put("love", "my country");
        
        String value = pref.get("like");
        //pref.entrySet();
        
        int hash = pref.hashCode();
        
        
        
        Map<Integer, String> counts = new TreeMap<Integer, String>();
        
        counts.put(1, "Hello");
        counts.put(2, "World");
        counts.put(3, "America");
        
        Iterator<Integer> keys = counts.keySet().iterator();
        
        int n = keys.next();
        n = keys.next();
        n = keys.next();
        
        //===============
        
        
        Set<String> set = new HashSet<String>();
        
        set.add("Hello");
        set.add("Hello");
        
        int s = set.size();
        
        isUnique3("Hello");
        
        String newStr = reverse("Hello");
        
        String duplStr = removeDuplicate("Hello");
        
        
        int[][] nums = new int[3][3];
        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[0][2] = 3;
        
        nums[1][0] = 4;
        nums[1][1] = 5;
        nums[1][2] = 6;
        
        nums[2][0] = 7;
        nums[2][1] = 8;
        nums[2][2] = 9;
        
        printmatrix(nums);
        
        rotate(nums,3);
           
        printmatrix(nums);
    }
    
    public static void printmatrix(int[][] m)
    {
        System.out.println();
        for ( int i = 0; i < m[0].length; i++)
        {
            for (int j =0; j < m[0].length; j++)
            {
                System.out.print(m[i][j]);
            }
            System.out.println();
            
        }
    }
    //Write a method to replace all spaces in a string with ‘%20’.
    public static String replaceSpace(char[] str)
    {
        /*
        String newStr = "";
        for ( int i = 0; i < str.length(); i++)
        {
            if ( str.charAt(i) == ' ')
            {
                newStr = newStr + "%20";
            }
            else
            {
                newStr = newStr + str.charAt(i);
                continue;
            }
        }
        */
        
        // count number of spaces
        int numspace = 0;
        int oldLen = str.length;
        for (int i = 0; i < str.length; i++)
        {
            if ( str[i] == ' ')
            {
                numspace++;
            }
        }
        
        int newlength = oldLen + numspace*2;
        
        str[newlength] = '\0';
        
        
        for ( int i = oldLen - 1; i >= 0; i--)
        {
            if (str[i] != ' ')
            {
                str[newlength - 1]  = str[i];
                newlength = newlength - 1;
            }
            else
            {
                str[newlength - 1]  = '0';
                str[newlength - 2]  = '2';
                str[newlength - 3]  = '%';
                newlength = newlength - 3;
            }
        }
        return "";
    }
    public static void rotate(int[][] matrix, int n) {
         for (int layer = 0; layer < n / 2; ++layer) {
             int first = layer;
             int last = n - 1 - layer;
             for(int i = first; i < last; ++i) {
                 int offset = i - first;
                 int top = matrix[first][i]; // save top
                 // left -> top
                 matrix[first][i] = matrix[last-offset][first];

                 // bottom -> left
                 matrix[last-offset][first] = matrix[last][last - offset];

                // right -> bottom
                  matrix[last][last - offset] = matrix[i][last];

                // top -> right
                 matrix[i][last] = top; // right <- saved top
             }
         }
     }
    /*
    Design an algorithm and write code to remove the duplicate 
    characters in a string without using any additional buffer. 
    NOTE: One or two additional variables are fine. 
    An extra copy of the array is not.
    FOLLOW UP
    Write the test cases for this method.
    */
    
    public static String removeDuplicate(String str)
    {
        
        boolean[] char_set = new boolean[256];
        String newStr = "";
        
        for (int i = 0; i < str.length(); i++)
        {
            int val = str.charAt(i);
            if ( char_set[val] == true)
            {
                // not put in the new string
            }
            else
            {
                // put in the new string
                newStr = newStr + (char)val;
                char_set[val] = true;
            }
        }
        return newStr;
    }
    
    
    /*
    Implement an algorithm to determine if a string has 
    all unique characters. What if you can not use additional data structures?
    */
    public static boolean isUnique(String str)
    {
        boolean flag = false;
        
        String [] strArray = str.split("");
        
        Map<Integer, String> arrayCounts = new HashMap<Integer, String>();
        
        for (int i = 0; i < strArray.length; i++)
        {
            if (!arrayCounts.values().contains(strArray[i]))
            {
                arrayCounts.put(1, strArray[i]);
            }
            else
            {
                return false;
            }
                
        }
        
        return flag;
    }
    
    
    public static boolean isUnique2(String str)
    {
        boolean flag = false;
        
        for (int i = 0; i < str.length(); i++)
        {
            str.charAt(i);
            for (int j = i+1; j < str.length(); j++)
            {
                if ( str.charAt(i) == str.charAt(j)){
                    flag =  false;
                    return flag;
                }
                else
                {
                    flag = true;
                }
            }
        }
        
        
        
        return flag;
    }
    public static boolean isUnique3(String str)
    {
        
        boolean [] char_set = new boolean[256];
        
        for (int i = 0; i < str.length(); i++)
        {
            int val = str.charAt(i);
            
            if ( char_set[val] == true )
                return true;
            else
                char_set[val] = true;
        }
        
        return false;
    }
    /*
    Write code to reverse a C-Style String. (C-String means that “abcd” is 
    represented as five characters, 
    including the null character.)
    */
    
    public static String reverse(String str)
    {
        
        String newString = "";
        for (int i = str.length()-1 ; i >= 0; i--)
        {
            newString = newString + str.charAt(i);
        }
        
        return newString;
    }
}
