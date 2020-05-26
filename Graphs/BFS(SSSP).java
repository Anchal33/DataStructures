import java.util.*;
// Other imports go here
// Do NOT change the class name
// this method is only for unweighted graphs
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
   void shortestPath(int source)
   {
     int parent[]=new int[V];
     
     boolean visited[]=new boolean[V];
     for(int i=0;i<V;i++)
     {
         parent[i]=-1;
     }
     Queue<Integer> q=new LinkedList<>();
     q.add(source);
     visited[source]=true;
     
     while(q.size()!=0)
     {
         int vertex=q.remove();

         if(source!=vertex)
        {
            System.out.print("path from "+source+" to "+vertex+" is: ");
             printPath(source,vertex,parent);
             System.out.println();
        }


         Iterator it=graph.get(vertex).iterator();
         while(it.hasNext())
        {
            int l=(int)it.next();
           if(!visited[l])
        {
           q.add(l);
           if(parent[l]==-1)
           parent[l]=vertex;

           visited[l]=true;
        }
     }
     }

   }
   void printPath(int source,int dest,int parent[])
   {
       //System.out.print(dest+" ");
       if(parent[dest]==-1)
    {
      System.out.print(dest+" ");
       return;
   }
       printPath(source,parent[dest],parent);
       System.out.print(dest+" ");

   }
}

class Main
{
    public static void main(String[] args)
    {
        int V=8; //no. of vertices
        Graph g=new Graph(V);
        g.addEdge(0, 1); 
        g.addEdge(0, 3); 
        g.addEdge(1, 2); 
        g.addEdge(3, 4); 
        g.addEdge(3, 7); 
        g.addEdge(4, 5); 
        g.addEdge(4, 6); 
        g.addEdge(4, 7); 
        g.addEdge(5, 6); 
        g.addEdge(6, 7); 
        g.shortestPath(0);
        // Write your code here
    }
    }