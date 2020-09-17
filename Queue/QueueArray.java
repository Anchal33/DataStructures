import java.util.*;

class QueueArray
{
  static int SIZE=100;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];
  QueueArray()
  {
    front=rear=-1;
  }
  // Method to add an item to the queue.
  void enqueue(int item)
  {
    if(front==-1 && rear==-1)
    {
      front++;
      rear++;
      array[rear]=item;
    }
    else if(rear==SIZE)
      return;
    else
    {
      rear++;
      array[rear]=item;
    }
  }

  // Method to remove an item from queue.
  int dequeue()
  { 
    int item=0;
    if(front>rear)
    {
      return -1;
    }
   
  else if(front==rear)
   {
      item = array[front];
     front++;
     
     
   }
   else{
      item = array[front];
    front++;
   }
     return item;  

    }
    public static void main(String[] args)
    {
      QueueArray q=new QueueArray();
      q.enqueue(1);
      q.enqueue(2);
      q.dequeue();
      q.enqueue(3);
      q.enqueue(4);
      q.enqueue(5);
      q.dequeue();
      for(int i=q.front;i<=q.rear;i++){
          System.out.print(q.array[i]);
      }
    }
  }
