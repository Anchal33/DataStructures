class Node
{
  Node next;
  Node prev;
  int data;
  Node(int data)
{
 this.data=data;
 prev=null;
 next=null; 
}
}
class DlinkedList
{
 Node head;
public void insert(int data)
{
 Node n1=new Node(data);
  if(head==null)
  {
    head=n1;

  }
  else
{
 Node last=head;
while(last.next!=null)
{
  last=last.next;
}
last.next=n1;
n1.prev=last;
}
}


//insert at beginning
public void insertAtFirst(int data)
{
Node n=new Node(data);
 if(head==null)
 {
  head=n;  
 } 
else
{
 n.next=head;
 head.prev=n;
 head=n;
}
}


//insert after a given node
public void insertAfter(Node n,int data)
{
if(n==null)
System.out.println("this node can not be null");
else{
Node n1=new Node(data);
n1.next=n.next;
n1.prev=n;
n.next=n1;
n1.next.prev=n1;
}
}


//insert before a given Node
public void insertBefore(Node n,int data)
{
if(n==null)
System.out.println("this node can not be null");
else{
Node n1=new Node(data);
n1.prev=n.prev;
n.prev=n1;
n1.next=n;
n1.prev.next=n1;
}
}

//delete a given Node
public void delete(Node n)
{
if(n.prev==null)
{
 head=n.next;
 n.next=null;
}
else
{
 Node pre=n.prev;
 Node nex=n.next;
if(pre!=null && nex!=null)
 {pre.next=nex;
 nex.prev=pre;
 n.next=null;
 n.prev=null;
}
else
{
 n.prev.next=null;
n.prev=null;
}
}
}


//delete a node containing given value
public void deleteVal(int d)
{
 Node last=head;
 while(last.data!=d && last.next!=null)
{
last=last.next;
}
if(last.data!=d)
{
System.out.println("Data Not found");
}
else if(last.next==null)
{
last.prev.next=null;
}
else if(last.prev==null)
{
head=last.next;
last.next=null;
}
else{
Node temp=last.prev;
Node temp2=last.next;
temp.next=temp2;
temp2.prev=temp;
last.next=null;
last.prev=null;
}
}

//search a given value
public boolean search(int value)
{
 if(head==null)
 return false;
else
{
 Node last=head;
 while(last.next!=null)
{
 if(last.data==value)
 return true;

last=last.next;
}
return false;
}
}


public void print()
{
if(head==null)
System.out.println("Linked List is empty");
else
{
Node last=head;
while(last.next!=null)
{
System.out.print(last.data+" ");
last=last.next;
}
System.out.print(last.data);
System.out.println();
}
}
}