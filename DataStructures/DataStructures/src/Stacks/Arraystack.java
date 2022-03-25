package Stacks;
import java.util.*;
class Stack 
{
    
    int a[];
    int top;
    Stack()
    {
        a=new int[100];
        top=-1;
    }
    
    void push(int x)
    {
        if(top==a.length-1)
        {
            System.out.println("Stack is Full");
        }
        else
        {
            a[++top]=x;
        }
    }
    
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        return a[top--];
    }
    
    void display()
    {
    	if(top==-1)
    	{
    		System.out.println("No elements to display");
    	}
    	else
    	{
        for(int i=0;i<=top;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    	}
    }
    
    @SuppressWarnings("unused")
	void size()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.println(top+1);
            break;
        }
    }
    
    int count()
    {
    	int count=0;
    	if(top==-1)
    	{
    		return 0;
    	}
    	else
    	{
    		for(int i=0;i<=top;i++)
    		{
    			count++;
    		}
    	}
    	return count;
    }
    
   int peek()
	{
		if(top==-1)
			return 0;
		return a[top];
	}
    
    boolean isEmpty()
    {
        if(top==-1)
            return true;
        return false;
    }

  void Reverse()
  {
	  if(top==-1)
	  {
		  System.out.println("No elements to reverse the stack");
	  }
	  else
	  {
		  for(int i=top;i>=0;i--)
		  {
			  System.out.print(a[i]+" ");
		  }
		  System.out.println();
	  }
  }
}

public class Arraystack
{
    @SuppressWarnings("resource")
	public static void main(String args[])
    {
        Stack s=new Stack();
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("*****MENU*****");
            System.out.println("================================");
            System.out.println("1.PUSH");
            System.out.println("2.POP");
            System.out.println("3.PEEK");
            System.out.println("4.IS EMPTY");
            System.out.println("5.DISPLAY");
            System.out.println("6.Size");
            System.out.println("7.count");
            System.out.println("8.Reverse Stack");
            System.out.println("9.Exit");
            System.out.println("Enter your choice");
            switch(sc.nextInt())
            {
                case 1:
                    System.out.println("Enter the value");
                    int x=sc.nextInt();
                    s.push(x);
                    break;
                case 2:
                    System.out.println("Popped Element is "+s.pop());
                    break;
                case 3:
                    System.out.println("top element is: "+s.peek());
                    break;
                case 4:
                    System.out.println("Stack is Empty: "+s.isEmpty());
                    break;
                case 5:
                    System.out.println("Elements in the stack is ");
                    s.display();
                    break;
                case 6:
                    System.out.println("Size of the stack is");
                    s.size();
                    break;
                case 7:
                	System.out.println("No of elements in the stack is: "+s.count());
                	break;
                case 8:
                    s.Reverse();
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:System.out.println("Wrong choice");
                    break;
            }
            System.out.println("do you want to cont....");
        }while(sc.nextInt()==1);
    }
}