/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistapp;

import java.util.LinkedList;

/*
https://www.geeksforgeeks.org/linked-list-set-1-introduction/
*/

/**
 *
 * @author slam1
 */
public class LinkedListApp {

    static Node head;  // head of list 
  
    /* Linked list Node.  This inner class is made static so that 
       main() can access it */
    public static  class Node { 
        int data; 
        Node next; 
        Node(int d)  { data = d;  next=null; } // Constructor 
    } 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // create 3 node linked list
        
        LinkedListApp llist = new LinkedListApp();
        
        head  = new Node(1); 
        Node second = new Node(2); 
        Node third  = new Node(3); 
        Node fourth = new Node(6); 
        Node five = new Node(7); 
        Node six = new Node(8); 
        Node seven = new Node(16); 
        Node eight = new Node(26); 
        Node nine = new Node(36); 
        Node ten = new Node(46); 
        
        
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = five;
        five.next = six;
        six.next = seven;
        seven.next = eight;
        eight.next = nine;
        nine.next = ten;
        ten.next = null;
        
        
        printListList(head);
        
        /*
        Delete LinkedList
        Input: position = 1, Linked List = 8->2->3->1->7
        Output: Linked List =  8->3->1->7

        Input: position = 0, Linked List = 8->2->3->1->7
        Output: Linked List = 2->3->1->7
        
        
        */
        
        int position = 1;
        Node newNode = DeleteLinkedList(head, 0);
        printListList(newNode);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // binaary search
        
        
        head = insertAtBeginning(head, 20);
        printListList(head);
        head = insertAtEnd(head, 70);
        printListList(head);
    }
    
    public static Node DeleteLinkedList(Node _node, int pos)
    {
        System.out.println("Delete node " + pos);
        int i = 0;
        Node newNode = new Node(0);
        
        while (_node != null )
        {
            if ( pos >= 1) 
            {
                if ( i == pos - 1)
                {
                    _node.next = _node.next.next;
                    break;
                }
            }
            else
            {
                newNode = _node.next;
                _node.next = null;
                _node = newNode;
                break;
            }
            
            _node = _node.next;
            
            i++;
        }
        
        return _node;
    }
    
    
    public static Node getMiddleNode(Node first, Node last) 
    {
        Node slow = first;
        Node fast = first.next;
        
        return null;
    }
    
    public static Node binarySearch(Node last, int value) 
    {
        //Node start = 
        return null;
    }
    
    public static void printListList(Node _node)
    {
        System.out.println("printListList");
        while (_node != null )
        {
            System.out.println(_node.data);
            if ( _node.next != null)
                _node = _node.next;
            else
                break;
        }
    }
    
    public static Node insertAtBeginning(Node head1,int a1)
    {
        //Add your code here.
        System.out.println("insertAtBeginning");
        Node newnode = new Node(a1);

        newnode.next = head1;

        return newnode;

    }
// function appends the data at the end of the list and returns the head of LL.
    public static Node insertAtEnd(Node head1,int a1)
    {
        System.out.println("insertAtEnd");
        //Add your code here.
        if ( head1 != null)
        {
            Node temp = head1;
        Node newnode = new Node(a1);

        while (head1.next != null)
        {
            head1 = head1.next;
        }

        head1.next = newnode;

        return temp;

        }
        else
        {
            Node newnode = new Node(a1);
            return newnode;
        }


    }
}
