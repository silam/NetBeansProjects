/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollection;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

/**
 *
 * @author slam1
 */
public class JavaCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        sortedset();
        
        theMap();
    }
    /*
    The SortedSet interface extends Set and declares the behavior of a set sorted in an ascending order. In addition to those methods defined by Set, the SortedSet interface declares the methods summarized in the following table −

    Several methods throw a NoSuchElementException when no items are contained in the invoking set. A ClassCastException is thrown when an object is incompatible with the elements in a set.

    A NullPointerException is thrown if an attempt is made to use a null object and null is not allowed in the set.
    */
    public static void  sortedset()
    {
        SortedSet sortedSet = new TreeSet();
        sortedSet.add("b");
        sortedSet.add("c");
        sortedSet.add("a");
        
        Iterator it = sortedSet.iterator();
        
        while (it.hasNext())
        {
            Object element = it.next();
            System.out.println(element);
        }
    }
    
    public static void theMap()
    {
        Map m1 = new HashMap();
        m1.put(1,"Si Lam");
        m1.put(2,"John Doe");
        m1.put(3,"Mike T");
        
        System.out.println(m1);
    }    
    
    
    public static void theSortedMap()
    {
        TreeMap tm = new TreeMap();
        tm.put(1, new Double(34));
        tm.put(2, new Double(35));
        tm.put(3, new Double(36));
        tm.put(4, new Double(37));
        tm.put(5, new Double(38));
        
        Set s = tm.entrySet();
        
        Iterator i = s.iterator();
        
        while (i.hasNext())
        {
            Map.Entry me = (Map.Entry)i.next();
            
            System.out.println(me.getKey());
            System.out.println(me.getValue());
            
        }
        
        
        double d = ((Double)tm.get(1)).doubleValue();
        
        tm.put(9, new Double(d + 1000));
    }
    
    
    public static void theEnumeraation()
    {
        Enumeration days;
        
        Vector dayNames = new Vector();
        dayNames.add("Sunday");
        dayNames.add("MOnday");
        
        days = dayNames.elements();
        
        while (days.hasMoreElements())
        {
                System.out.println(days.nextElement());
        }
    }
}
