package algorithem.graph;

import java.util.LinkedList;

public class GraphDemo {
    public static void main(String args[]) {


    }


}

class Graph{
    private int v;
    private LinkedList<Integer>adj[];//领节表

    public Graph(int v){
        this.v = v;
        adj= new LinkedList[v];
        for (int i=0;i<v;i++){
            adj[i]= new LinkedList<>();
        }
    }

    public void  addEdge(int i,int j){

        adj[i].add(j);
        adj[j].add(i);
    }
}