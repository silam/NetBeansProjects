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
public class DFSApp {

    public static Vertex[] adjLists;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        adjLists = new Vertex[10];
        
    }
    
    public void dfx()
    {
        boolean [] visited = new boolean[adjLists.length];
        for (int vind = 0; vind < adjLists.length; vind++)
        {
            if ( !visited[vind])
            {
                visited[vind] = true;
            }
        }
    }
    public void dfs(int vnum , boolean[] visited)
    {
        visited[vnum] = true;
        
        for (Neighbor nbr = adjLists[vnum].adjList; 
                nbr != null; nbr = nbr.Next)
        {
            if (!visited[nbr.vertexNum]) 
                dfs(nbr.vertexNum, visited);
        }
    }
}

