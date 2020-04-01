class Node
{
 int data;
 Node next;
 
Node(int Data)
{
   this.data=Data;
   next=null;
}
}

class Linkedlist
{
 Node head;
 public void insert(int data)
{
 Node n=new Node(data);
 if(head==null)
{
  head=n;
}
else
{
Node last=head;
while(last.next!=null)
{
last=last.next;
}
last.next=n;
}
}

//insertion at a given position
public void insert(int pos,int data)
{
  Node n=new Node(data);
int count=1;
Node last=head;

if(pos==0)
{
  n.next=last;
  head=n;
}
else
{
if(pos>length())
{
  pos=length();
}
while(count<pos)
{
  last=last.next;
count++;
}
n.next=last.next;
last.next=n;
}
}


//delete Node containing given value
public void delete(int key)
{
int flag=0;
 Node prev=null;
 Node last=head;
 while(last.data!=key)
{
  if(last.next!=null)
 { prev=last;
  last=last.next;
}
else
{
flag=1;
break;
}
}
if(flag==0)
{prev.next=last.next;
last.next=null;
}
else
{
System.out.println("Key Not Found");
}
}


//delete Node at given position
public void deleteIndex(int pos)
{
 Node last=head;
Node temp=null;
if(pos==0)
{head=last.next;
 last.next=null;
}
else
{ int count=1;
 while(count<pos)
{
 last=last.next;
count++;
}
temp=last.next;
last.next=temp.next;
temp.next=null;
}
}

//delete complete list
public void deleteLinkedList()
{
head=null;
}

//length of linkedList
public int length()
{
int count=1;
if(head==null)
{
count=0;
}
else
{

Node last=head;
while(last.next!=null)
{
 last=last.next;
 count++;
}
}
 return count; 
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

//delete last node
public void deleteEnd()
{
 Node last=head;
Node prev=null;
 while(last.next!=null)
{ prev=last;
  last=last.next;
}
 prev.next=null;
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