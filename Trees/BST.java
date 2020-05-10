import java.util.Scanner;

class Node 
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
class BST
{
    //insertion
    Node insert(Node root,int data)
    {
        if(root==null)
        return new Node(data);
        else if(root.data>data)
        {
            root.left=insert(root.left,data);
        }
        else
        {
            root.right=insert(root.right,data);
        }
       return root;
    }

//Deletion 
Node Delete(Node root,int key)
{
 if(root==null)
   return root;
  if(root.data>key)
{
 root.left=Delete(root.left,key);
}
else if(root.data<key)
{
  root.right=Delete(root.right,key);
}
else
{
  //Node is a leaf Node
  if(root.left==null && root.right==null)
  {
     root=null;
  }
  //Node has one child
 else if(root.left==null || root.right==null)
{
if(root.left==null)
 {
    root=root.right;
 }
else
{
  root=root.left;
}
}
else
{
   //Node has two children
   //find min element in right subtree
   Node min=root.right;
   int minv=min.data;
   while(min.left!=null)
   {
    minv=min.left.data;
    min=min.left;  
   }
  // replace node to be deleted key with min value
  root.data=minv;
  //delete the min value;
  root.right=Delete(root.right,minv);
}
}
return root;
}
//searching
 boolean search(Node root,int key)
{
  if(root==null)
   return false;
  else if(root.data==key)
  return true;
else if(root.data>key)
{
 return search(root.left,key);
}
else
{
return search(root.right,key);
}
}

}