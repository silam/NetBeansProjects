/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfsapp;

/**
 *
 * @author slam1
 */
public class Neighbor {
    public int vertexNum;
    public Neighbor Next;
    Neighbor(int vnum, Neighbor neighbor)
    {
        this.vertexNum = vnum;
        this.Next = neighbor;
    }
}
