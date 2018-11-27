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
public interface Queue<T> {
    Queue<T> enqueue(T ele);
    T dequeue();
}
