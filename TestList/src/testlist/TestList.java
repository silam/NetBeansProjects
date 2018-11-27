/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



/**
 *
 * @author slam1
 */
public class TestList {

    public static class Student
    {
        private String name;
        private int id;
        
        public Student(int id, String name)
        {
            super();
            this.id = id;
            this.name = name;
        }
        
        public String toString()
        {
            return this.id + " " + this.name;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        List<Student> students = List.of(new Student(100,"Bay"), 
                new Student(21,"Lam"),
                new Student(300,"Bay"));
        
        System.out.println(students);
        
        List<student>
        List<String> words = List.of("Dog", "Cat","Bird");
        
        List<String> wordsAL = new ArrayList<String>(words);
        
        Iterator<String> it = wordsAL.iterator();
        
        while (it.hasNext())
        {
            //System.out.println(it.next());
            
            if (it.next().endsWith("d"))
            {
                it.remove();
            }
        }
        
        for (String w : wordsAL)
        {
            
                System.out.println(w);
                //words.remove(w);
            
        }
        
        
        List value = List.of("A", 'A', 1, 1.0);
        
        System.out.println("Value " + value.get(0) instanceof String);
        System.out.println(value.get(1) instanceof Character);
        System.out.println(value.get(2) instanceof Integer);
        System.out.println(value.get(3) instanceof Double);
        
        
        List<Integer> numbers = List.of(101,102,103, 3, 2,9);
    
        List<Integer> numberAL  =new ArrayList<Integer>(numbers);
    
        for (Integer n: numbers)
        {
            System.out.println(n);
        }
        
        numberAL.remove(0);
        
        for (Integer n: numberAL)
        {
            System.out.println(n);
        }
        
        System.out.println("Sorting");
        Collections.sort(numberAL);
        
        for (Integer n: numberAL)
        {
            System.out.println(n);
        }
        
        
    }
    
    
    
}
