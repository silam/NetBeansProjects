/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeapp;

/**
 *
 * @author slam1
 */
public interface Tree<E extends Comparable> {
    boolean search(E tofind);
    void insert(E toinsert);
}
