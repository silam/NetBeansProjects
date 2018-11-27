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
public class QueueInterfaceApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        QueueArray q = new QueueArray();
        
        int a = 9;
        q.enqueue(a);
        q.enqueue(10);
        q.enqueue(11);
        q.enqueue(12);
        
        int b = (int)q.dequeue();
        b = (int)q.dequeue();
        b = (int)q.dequeue();
                
    }
    
    
}
