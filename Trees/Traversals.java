import java.util.*;
class Node
{
  int data;
  Node left;
  Node right;
  Node(int data)
  {
   this.data=data;
   left=null;
   right=null;
  }
}
class Tree
{
void preorderTraversal(Node root)
{
  if(root==null)
  return;
  
  System.out.print(root.data+" ");
  preorderTraversal(root.left);
  preorderTraversal(root.right);
}

void inorderTraversal(Node root)
{
  if(root==null)
  return;

  inorderTraversal(root.left);
  System.out.print(root.data+" ");
  inorderTraversal(root.right);
}

void postorderTraversal(Node root)
{
  if(root==null)
  return;

  postorderTraversal(root.left);
  postorderTraversal(root.right);
  System.out.print(root.data+" "); 
}

void LevelOrderTraversal(Node root)
{
  if(root==null)
  return;

  Queue<Node> q=new LinkedList<>();
  q.add(root);
  Node temp;
  while(!q.isEmpty())
  {
   temp=q.remove();
   System.out.println(temp.data+" ");
   if(temp.left!=null)
   q.add(temp.left);
   if(temp.right!=null)
   q.add(temp.right);
  }      
}
}