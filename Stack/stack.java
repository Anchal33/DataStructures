import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Stack
{
  public int maxSize; // size of stack array
  public int[] stackArray;
  public int top; // top of stack

  public Stack(int s) // constructor
  {
    maxSize=s;
    top=-1;
    stackArray=new int[s];
  }

  public void push(int j) // put item on top of stack
  {
    if(top==maxSize)
    {
      return;
    }
    else
    {
      top++;
      stackArray[top]=j;
    }
  }
  
  public int pop() // take item from top of stack
  {
    if(top==-1)
    {
      return -1;
    }
    return stackArray[top--];
  }

  public boolean isEmpty() // true if stack is empty
  {
    if(top==-1)
      return true;
    else
      return false;
  }

  public boolean isFull() // true if stack is full
  {
    if(top==maxSize)
      return true;
    else
      return false;
  }
    public static void main(String[] args)
    {
      Stack s=new Stack(10);
      s.push(1);
      s.push(2);
      s.pop();
      s.push(3);
      s.push(4);
      s.push(5);
      s.pop();
      for(int i=0;i<=s.top;i++){
          System.out.print(s.stackArray[i]);
      }
    }
    }