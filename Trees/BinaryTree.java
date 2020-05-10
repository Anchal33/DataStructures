import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
    }
}
class BinaryTree
{
    //insertion in a binary tree
    void insert(Node root,int data)
   {
       Node n=new Node(data);
       if(root==null)
       {
           root=n;
       }
       else
       {
           Queue<Node>q=new LinkedList<>();
           q.add(root);
           while(!q.isEmpty())
           {
               Node a=q.remove();
               if(a.left==null)
               {
                   a.left=n;
                   break;
               }
               else
               {
                   q.add(a.left);
               }
               if(a.right==null)
               {
                   a.right=n;
                   break;
               }
               else
               {
                   q.add(a.right);
               }
           }
       }
   }
  //deletion in a binary tree
  void delete(Node root,int Key)
  {
      if(root==null)
      return;
    Queue<Node>q=new LinkedList<>();
    q.add(root);
    Node key=null;
    Node deepest=null;
    while(!q.isEmpty())
    {
       key =q.remove();
        if(key.data==Key)
        {
            break;
        }
        if(key.left!=null)
        q.add(key.left);
        if(key.right!=null)
        q.add(key.right);
    }
  if(key.data!=Key)
  System.out.println("Not found");
else{
  q.clear();
  q.add(root);
  while(!q.isEmpty())
  {
    deepest=q.remove();
    if(deepest.left!=null)
    q.add(deepest.left);
    if(deepest.right!=null)
    q.add(deepest.right);
  }
  key.data=deepest.data;
q.add(root);
Node temp;
while(!q.isEmpty())
{
    temp=q.remove();
    if(temp.left==deepest)
    {
        temp.left=null;
        break;
    }
    else
    {
    q.add(temp.left);
    }
    if(temp.right==deepest)
    {
        temp.right=null;
        break;
    }
    else
    {
        q.add(temp.right);
    }
}
}
}
//searching a value 
boolean search(Node root,int value)
{
if(root==null)
      return false;
    Queue<Node>q=new LinkedList<>();
    q.add(root);
    Node a;
    while(!q.isEmpty())
    {
       a =q.remove();
        if(a.data==value)
        {
            return true;
        }
        if(a.left!=null)
        q.add(a.left);
        if(a.right!=null)
        q.add(a.right);
    }
   return false;
} 
}