package Queues;
import java.util.*;
class Queue
{
	int front;
	int rear;
	int q[];
	Queue()
	{
		front=rear=0;
		q=new int[10];
	}
	
	
	void Enqueue(int x)
	{
		if(rear==q.length-1)
		{
			System.out.println("Queue is full");
		}
		else
		{
			q[rear++]=x;
		}
	}
	
	void Dequeue()
	{
		if(front==rear)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println("Deleted element is:- "+q[front]);
			for(int i=0;i<rear-1;i++)
			{
				q[i]=q[i+1];
			}
			rear--;
		}
	}
	
	void Display()
	{
		if(rear==front)
		{
			System.out.println("Queue is Underflow");
		}
		else
		{
			for(int i=front;i<rear;i++)
			{
				System.out.print(q[i]+" ");
			}
		}
		System.out.println();
	}
	
	boolean isEmpty()
	{
		if(rear==front)
			return true;
		return false;
	}
	
}
public class ArrayQueue 
{
   public static void main(String args[])
   {
	   Queue q=new Queue();
	   @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	   do
	   {
		   System.out.println("**********MENU**********");
		   System.out.println("1.Enqueue");
		   System.out.println("2.Dequeue");
		   System.out.println("3.Display");
		   System.out.println("4.isEmpty");
		   System.out.println("5.Exit");
		   System.out.println("Enter your choice");
		   int choice=sc.nextInt();
		   switch(choice)
		   {
		   case 1:
			   System.out.println("Enter the value");
			   int x=sc.nextInt();
			   q.Enqueue(x);
			   break;
		   case 2:
			   q.Dequeue();
			   break;
		   case 3:
			   q.Display();
			   break;
		   case 4:
			   System.out.println(q.isEmpty());
			   break;
		   case 5:
			   System.exit(0);
			   break;
		   default:
			   System.out.println("you enter the wrong choice please enter the correct choice");
			   break;
		   }
		   System.out.println("Do you want to cont..Enter 1");
	   }while(sc.nextInt()==1);
	   
   }
}
