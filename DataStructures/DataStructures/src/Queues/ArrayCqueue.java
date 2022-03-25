package Queues;
import java.util.*;
class CQueue
{
	int front,rear;
	int cq[];
	
	CQueue()
	{
		int n=5;
		front=rear=-1;
		cq=new int[n];
	}
	
	void Enqueue(int x)
	{
		if(rear==cq.length-1 || front==rear+1)
		{
			System.out.println("Queue is full");
		}
		else if(front==-1 && rear==-1)
		{
			front=rear=0;
			cq[rear]=x;
		}
		else if(rear==cq.length-1)
		{
			rear=0;
			cq[rear]=x;
		}
		else
		{
			rear++;
			cq[rear]=x;
		}
	}
	
	void Dequeue()
	{
		int ele;
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is empty");
		}
		else if(front==rear)
		{
			ele=cq[front];
			System.out.println("Dequeue element is: "+ele);
			front=rear=-1;
		}
		else if(front==cq.length-1)
		{
			ele=cq[front];
			System.out.println("Dequeue element is: "+ele);
			front=0;
		}
		else
		{
			ele=cq[front++];
			System.out.println("Dequeue element is: "+ele);
		}
	}
	
	void Display()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("No elements to display");
		}
		
		else 
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.print(cq[i]+" ");
			}
		}
		System.out.println();
	}
}
public class ArrayCqueue 
{
     @SuppressWarnings("resource")
	public static void main(String args[])
     {
    	 CQueue cq=new CQueue();
    	 Scanner sc=new Scanner(System.in);
    	 do
    	 {
    		 System.out.println("*****MENU*****");
    		 System.out.println("============================================");
    		 System.out.println("1.Enqueue");
    		 System.out.println("2.Dequeue");
    		 System.out.println("3.Display");
    		 System.out.println("4.Exit");
    		 System.out.println("Enter your choice");
    		 int choice=sc.nextInt();
    		 switch(choice)
    		 {
    		 case 1:
    			 System.out.println("Enter the value");
    			 int x=sc.nextInt();
    			 cq.Enqueue(x);
    			 break;
    		 case 2:
    			 cq.Dequeue();
    			 break;
    		 case 3:
    			 cq.Display();
    			 break;
    		 case 4:
    			 System.exit(0);
    			 break;
    		 default:
    			 System.out.println("please Enter correct choice");
    			
    		 }
    		 System.out.println("Do you want to cont...Enter 1");
    		 
    	 }while(sc.nextInt()==1);
     }
}
