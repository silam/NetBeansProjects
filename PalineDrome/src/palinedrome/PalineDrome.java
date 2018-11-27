/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palinedrome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*

https://www.hackerrank.com/challenges/simple-array-sum/problem

https://www.youtube.com/watch?v=v4cd1O4zkGw
Read more: https://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html#ixzz5TWxI7BQd



*/

/**
 *
 * @author slam1
 * http://www.java67.com/2017/07/string-rotation-in-java-write-program.html
 * 
 * https://www.youtube.com/watch?v=kQ-aoKbGKSo&index=2&list=PLqM7alHXFySHCXD7r1J0ky9Zg_GBB1dbk
 * 
 * 
 * https://www.youtube.com/playlist?list=PLOuZYwbmgZWXvkghUyMLdI90IwxbNCiWK
 * 
 */


public class PalineDrome {

    public class Graph{
        
        private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();
        
        public  class Node {
            private int id;
            LinkedList<Node> adjacent = new LinkedList<Node>();
            private Node(int id)
            {
                this.id = id;
            }
        }
        
        
        
        private Node getNode(int id) {
            
        }
        
        public void addEdge(int source, int dest)
        {
            
        }
        
        public boolean hasPathDFS(int source, int dest)
        {
            Node s = getNode(source);
            Node d = getNode(dest);
            
            HashSet<Integer> visited = new HashSet<Integer>();
            return hasPathDFS(s,d, visited);
            
        }
        
        
        public boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited)
        {
            if ( visited.contains(source.id)) return false;
            
            visited.add(source.id);
            
            if ( source == destination)
            {
                return true;
            }
            else
            {
                for (Node child: source.adjacent)
                {
                    if ( hasPathDFS(child, destination, visited))
                    {
                        return true;
                    }
                }
                return false;
            }
        }
        
        
        public boolean hasPathBFS(Node source, Node destination)
        {
            
            LinkedList<Node> nextToVisit = new LinkedList<Node>();
            HashSet<Integer> visited = new HashSet<Integer>();
            
            nextToVisit.add(source);
            
            while (!nextToVisit.isEmpty())
            {
                Node node = nextToVisit.remove();
                if ( node == destination) return true;
                if (visited.contains(node.id))
                {
                    continue;
                }
                visited.add(node.id);
                
                for (Node child: source.adjacent)
                {
                    nextToVisit.add(child);
                }
            }
            return false;
            
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
    }
    
    public class Node {
        Node left, right;
        int data;
        public Node(int data){
            this.data = data;
        }
        
        public void insert(int value)
        {
            if ( value < data)
            {
                if ( left == null)
                    left = new Node(value);
                else
                    left.insert(value);
            }
            else
            {
                if ( right == null)
                        right = new Node(value);
                else
                        right.insert(value);
            }
        }
        
        public boolean contains(int value)
        {
            if ( value == data)
            {
                return true;
            }
            else if ( value < data)
            {
                if ( left == null) return false;
                else
                {
                    return left.contains(value);
                }
            }
            else  
            {
                if ( right == null ) return false;
                else
                {
                    return right.contains(value);
                }
            }
            
                
        }
        
        
    }
    
    // cracking - coding interview
    // cracking tech career
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        System.out.println("LaineDromme");
        
        if ( IsPalineDromeString("aba"))
        {
            System.out.println("aba is PalineDrome String");
        }
        else
        {
            System.out.println("it is not Paline Dromve");
        }
            
        
        System.out.println("Remove Unwanted Character");
        
        String ret = RemoveRecursive("HelloWorld", 'o');
        
        System.out.println(ret);
        
        
        
        
        System.out.println("Permutaion");
        
        Permutation("XYZ");
        
        
        IsStrRotation("IndiaUSAEngland","IndiaEnglandUSA");
        */
        //linearSearch("helloworld", 'h');
        
        List<Integer> listInt = new ArrayList<Integer>(10);
        listInt.add(1);listInt.add(2);
        listInt.add(3);
        listInt.add(4);listInt.add(5);
        
        int n = 1;
        
        
        binarySearch(listInt,  n);
        
        Map<Integer, Integer> counts = new LinkedHashMap<>(10);
        insert(counts,1, 20);
        insert(counts,2, 70);
        insert(counts,42, 80);
        insert(counts,4, 25);
        insert(counts,12, 44);
        insert(counts,14, 32);
        insert(counts,17, 11);
        insert(counts,13, 78);
        insert(counts,37, 97);
        
        
        int nDisks = 3;
        doTowers(nDisks, 'A', 'B', 'C');
        
        for (int i = 0; i < 8; i++)
        {
            System.out.println(fibonaci(i));
        }
        
        
        
        
        
        
        
        
    }
    
    public static void inOrder(TreeNode node)
    {
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }
    
    public static void preOrder(TreeNode node)
    {
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }
    
    public static void postOrder(TreeNode node)
    {
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }
    
    
    public static int fibonaci(int n)
    {
        if ( n == 0)
            return 0;
        else if ( n == 1)
            return 1;
        else
            return (fibonaci(n-1) + fibonaci(n-2));
    }
    public static void doTowers(int nDisks, 
            
            
            char source, char inter, char to)
    {
        if ( nDisks == 1)
            System.out.println("move disk " + nDisks + " from " + source + " to " + to);
        else
        {
            doTowers(nDisks - 1, source, to, inter);
            System.out.println("move disk " + nDisks + " from " + source + " to " + to);
            doTowers(nDisks - 1, inter, source, to);
            
        }
    
    }
    
    
    
    
    public static Map<Integer, Integer> hashArray = new LinkedHashMap<>(10);
    
    public static int hashCode(int key) {
        return key % 20;
    }
    public static void insert(Map<Integer, Integer> counts, Integer k, Integer v)
    {
        counts.put(k, v);
        //get the hash 
        int hashIndex = hashCode(k);
//        /while(hashArray[hashIndex] != NULL && hashArray[hashIndex]->key != -1) {
        //while(hashArray != NULL && hashArray.entrySet().[hashIndex]key != -1) 
       // {
            //go to next cell
        //    ++hashIndex;

            //wrap around the table
        //    hashIndex %= 20;
        // }
        
        hashArray.put(hashIndex, v);
    }
    /*
    Procedure binary_search
   A ← sorted array
   n ← size of array
   x ← value to be searched

   Set lowerBound = 1
   Set upperBound = n 

   while x not found
      if upperBound < lowerBound 
         EXIT: x does not exists.
   
      set midPoint = lowerBound + ( upperBound - lowerBound ) / 2
      
      if A[midPoint] < x
         set lowerBound = midPoint + 1
         
      if A[midPoint] > x
         set upperBound = midPoint - 1 

      if A[midPoint] = x 
         EXIT: x found at location midPoint
   end while
   
end procedure
    */
    
    
    public static boolean binarySearch(List<Integer> listInt, int n)
    {
        
        int lowerbound = 0;
        int upperbound = listInt.size() - 1;
        int midpoint = lowerbound + ( upperbound - lowerbound)/2;
        
        //// probe the mid point 
        //int middle = (int)(lowerbound + (((double)(upperbound - lowerbound) / (listInt.get(upperbound) - listInt.get(lowerbound)) * (n - listInt.get(lowerbound)));
        //int middle = lowerbound + (((double)(upperbound - lowerbound) / (listInt.get(upperbound) - listInt.get(lowerbound)) * (n - listInt.get(lowerbound));

      
        boolean found = false;
        
        found = (listInt.get(midpoint) == n);
        
        while (!found)
        {
            if ( listInt.get(midpoint) < n)
            {
                lowerbound = midpoint +1;
            }
            if ( listInt.get(midpoint) > n)
            {
                upperbound = midpoint - 1;
            }
            
            midpoint = lowerbound + ( upperbound - lowerbound)/2;
            
            found = (listInt.get(midpoint) == n);
        }
        
        return found;
        
    }
    
    /*
    Leanier seach
    procedure linear_search (list, value)

   for each item in the list
      if match item == value
         return the item's location
      end if
   end for

end procedure
    
    */
    
    public static boolean linearSearch(String word, char c)
    {
        char [] wordarrray = word.toCharArray();
        for (int i = 0; i < word.length(); i++)
        {
            if ( c == word.charAt(i))
                break;
        }
        return false;
    }
    
    /*
    3 ways to Find First Non Repeated Character in a String - Java Programming Problem

Read more: https://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html#ixzz5TWunqmQi

    */
    
    public static char getFirstNonRepeatChar(String word)
    {
        Map<Character, Integer> counts = new LinkedHashMap<>(word.length());
        
        for (char c : word.toCharArray())
        {
            if ( counts.containsKey(c)){
                
                int num = counts.get(c);
                counts.put(c, num+1);
            }
            else
                counts.put(c, 1);
        }
        
        for (Entry<Character, Integer> entry: counts.entrySet())
        {
            if ( entry.getValue() == 1)
            {
                return entry.getKey();
            }
        }
        
        throw new RuntimeException("Not found non repeated char");
        
    }
    
    /*
     * Finds first non repeated character in a String in just one pass.
     * It uses two storage to cut down one iteration, standard space vs time
     * trade-off.Since we store repeated and non-repeated character separately,
     * at the end of iteration, first element from List is our first non
     * repeated character from String.
     */

/*
Read more: https://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html#ixzz5TX0fXPXC
*/
    
    
    public static char firstNonRepeatChar(String word)
    {
        char ret;
        
        Set<Character> repeating = new HashSet<>();
        List<Character> nonRepeating = new ArrayList<>();
        // helloworld
        
        // h
        // e
        // l
        // l
            
        
        // nonrepeat: he
        for (int i =0; i < word.length(); i++)
        {
           
            
            if ( nonRepeating.contains(word.charAt(i)))
            {
                nonRepeating.remove(word.charAt(i));
            }
            else
            {
                nonRepeating.add(word.charAt(i));
                        
            }
            
            
            
        }
        
        return nonRepeating.get(0);
    }
    
    
    
    
    /*
    String Rotation in Java - Write a Program to check if strings are rotations of each other or not

    Read more: http://www.java67.com/2017/07/string-rotation-in-java-write-program.html#ixzz5TWnE2fpw
    Write a program to check if two given String s1 and s2 are rotations of another. For example if s1 = "IndiaUSAEngland" and s2= "USAEnglandIndia" then your program should return true but if s2="IndiaEnglandUSA" then it should return false.

Read more: http://www.java67.com/2017/07/string-rotation-in-java-write-program.html#ixzz5TWnt5qAG
    Write a program to check if two given String s1 and s2 are rotations of another. For example if s1 = "IndiaUSAEngland" and s2= "USAEnglandIndia" then your program should return true but if s2="IndiaEnglandUSA" then it should return false.

Read more: http://www.java67.com/2017/07/string-rotation-in-java-write-program.html#ixzz5TWnt5qAG
Problem: 
Write a program to check if two given String 
    s1 and s2 are rotations of another. For example if s1 = "IndiaUSAEngland" 
    and s2= "USAEnglandIndia" then your program should return true but if s2="IndiaEnglandUSA" then it should return false.
IndiaUSAEngland IndiaUSAEngland
Read more: http://www.java67.com/2017/07/string-rotation-in-java-write-program.html#ixzz5TWnzPS5Q

    */
    
    public static boolean IsStrRotation(String orig, String rotatedStr)
    {
        String concatenatedStr = orig + orig;
        
        if ( concatenatedStr.contains(rotatedStr))
        {
            return true;
        }
        else
            return false;
    }
    
    public static boolean IsPalineDromeString(String str)
    {
        String tempreversed = reverse(str);
        
        if ( tempreversed.equals(str) )
        {
            return true;
        }
        else
            return false;
        
    }
    public static String reverse(String str)
    {
        String [] temparray = str.split("");
        String tempRev = "";
        
        for (int i = 0; i < temparray.length; i++)
        {
            tempRev += temparray[i];
        }
        
        return tempRev;
    }
    
    
    public static String RemoveStr(String word, char c)
    {
        
        StringBuilder sb = new StringBuilder();
        
        char[] wordarray = word.toCharArray();
        
        for (char o: wordarray)
        {
            if ( o != c)
            {
                sb.append(o);
            }
        }
        
        return sb.toString();
        
    }
    
    public static String RemoveRecursive(String word, char c)
    {
        int index = word.indexOf(c);
        
        if (index == -1) return word;
        
        return ( RemoveRecursive(word.substring(0,index), c ) + RemoveRecursive(word.substring(index + 1), c ));
    }
    
    
  /*
  * Java program to find all permutations of a given String using recursion. 
  * For example, given a String "XYZ", this program will print all 6 possible permutations of
  * input e.g. XYZ, XZY, YXZ, YZX, ZXY, XYX
  *
  * @author Javin Paul
  */

  public static void Permutation(String word)
  {
      
       Permutation("", word);
      
      
  }

  public static void Permutation(String m, String word)
  {
      
      if ( word.isEmpty())
          System.out.println(m + word);
      
      else
      {
          for (int i = 0; i < word.length(); i++)
          {
               Permutation(m + word.charAt(i) ,
                          word.substring(0, i) + word.substring(i+1));
              
              
          }
          
      }
  }


}
