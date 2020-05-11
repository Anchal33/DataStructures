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

    void BFS(int s) //s is vertex from where to start traversal
    {
       boolean visited[]=new boolean[V];
       for(int i=0;i<V;i++)
       if(!visited[i])
       BFS(i,visited);
    }
    void BFS(int s,boolean visited[])
       {
       visited[s]=true;
       Queue<Integer>q =new LinkedList<Integer>();
       q.add(s);
       while(q.size()!=0)
       {
           int vertex=q.remove();
           System.out.print("V"+vertex+" ");
           Iterator it=graph.get(vertex).iterator();
           while(it.hasNext())
           {
               int n=(int)it.next();
               if(!visited[n])
               {
                   visited[n]=true;
                   q.add(n);
               }
           }
       }
    }


    public static void main(String[] args)
    {
        int V=10; //no. of vertices
        Graph g=new Graph(V);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,5);
        g.addEdge(1,6);
        g.addEdge(4,6);
        g.addEdge(2,3);
        g.addEdge(4,5);
        g.addEdge(3,4);
        g.BFS(0);
      
        // Write your code here
    }
    }