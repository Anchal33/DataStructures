import java.util.*;
// Other imports go here
// Do NOT change the class name
class Graph
{ 
     //Implementing using adjacency Lists
    int V;
    ArrayList<LinkedList<Integer>>graph;    //array of LinkedList
    Graph(int V)
    {
        this.V=V;
        graph=new ArrayList<LinkedList<Integer>>(V);
     for(int i=0;i<V;i++)
     {
         graph.add(new LinkedList<Integer>());
     }
    }
    void addEdge(int v1,int v2)
    {
        graph.get(v1).add(v2);
        graph.get(v2).add(v1);
    }
    void printLists()
    {
        for(int i=0;i<V;i++)
        {
            System.out.println("adjacency list of vertex "+i);
            for(int j=0;j<graph.get(i).size();j++)
            {
                System.out.print(graph.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}

class Main
{
    public static void main(String[] args)
    {
        int V=7; //no. of vertices
        Graph g=new Graph(V);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,5);
        g.addEdge(1,6);
        g.addEdge(4,6);
        g.addEdge(2,3);
        g.addEdge(4,5);
        g.addEdge(3,4);
        g.printLists();
        // Write your code here
    }
    }