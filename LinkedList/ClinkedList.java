class Node
{
int data;
Node next;
Node(int data)
{
this.data=data;
next=null;
}
}
class ClinkedList
{
Node head;


void insert(int data)
{
Node n=new Node(data);
 if(head==null)
{
  head=n;
  n.next=head;
}
else
{
 Node last=head;
 while(last.next!=head)
{
last=last.next;
}
last.next=n;
n.next=head;
}
}



void deleteBeg()
{
  if(head==null)
    return;
  else
  {
    Node last=head;
    while(last.next!=head)
    {
      last=last.next;
    }
    last.next=head.next;
    head=head.next;
  }
}


void deleteEnd()
{
  if(head==null)
    return;
  else
  {
    Node last=head;
    Node prev=null;
    while(last.next!=head)
    {
      prev=last;
      last=last.next;
    }
    prev.next=head;
   last.next=null;
}
}



int countNodes() {
    int count=1;
   if(head==null)
    return 0;
  else
  {
    Node last=head;
    while(last.next!=head)
    {
      count++;
      last=last.next;
    }
  }
    return count;
}



public boolean search(int value)
{
 if(head==null)
 return false;
else if(head.data==value)
return true;
else
{
 Node last=head;
 while(last.next!=head)
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
Node last=head;
System.out.print(last.data+" ");
while(last.next!=head)
{
last=last.next;
System.out.print(last.data+" ");
}
System.out.println();
}

}