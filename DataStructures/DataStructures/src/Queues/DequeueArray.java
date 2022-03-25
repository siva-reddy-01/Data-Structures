package Queues;
import java.util.Scanner;
class Dequeue
{
	int front;
	int rear;
	int d[];
	
	Dequeue()
	{
		
		front=rear=0;
		d=new int[10];
	}
	
	void InsertFront(int x)
	{
		if(rear==d.length-1 || front==rear+1)
		{
			System.out.println("Queue is Empty");
		}
		else if(front==-1 && rear==-1)
		{
			front=rear=0;
			d[front]=x;
		}
		else if(front==0)
		{
			front=d.length-1;
			d[front]=x;
		}
		else
		{
			front--;
			d[front]=x;
		}
	}
	
	void InsertRear(int x)
	{
		if((front==0 && rear==d.length-1) || front==rear+1)
		{
			System.out.println("Queue is full");
		}
		else if(front==-1 && rear==-1)
		{
			rear=0;
			d[rear]=x;
		}
		else if(rear==d.length-1)
		{
			rear=0;
			d[rear]=x;
		}
		else
		{
			rear++;
			d[rear]=x;
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
			for(int i=front;i!=rear;i=(i+1)%d.length)
			{
				System.out.print(d[i]+" ");
			}
		}
		System.out.println();
	}
	
	void getfront()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Dequeue is empty");
		}
		else
		{
			System.out.println("front element is:- "+d[front]);
		}
	}
	
	void getrear()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Dequeue is empty");
		}
		else
		{
			System.out.println("Rear element is:- "+d[rear]);
		}
	}
	
	void DeleteFront()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Dqueue is Empty");
		}
		else if(front==rear)
		{
			System.out.println("Delete element is:- "+d[front]);
			front=rear=-1;
		}
		else if(front==d.length-1)
		{
			System.out.println("Delete element is:- "+d[front]);
			front=0;
		}
		else
		{
			System.out.println("Delete element is:-"+d[front]);
			front++;
		}
	}
	
	void DeleteRear()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is empty");
		}
		else if(front==rear)
		{
			System.out.println("Delete element is:- "+d[rear]);
			front=rear=-1;
		}
		else if(rear==0)
		{
			System.out.println("Delete element is:- "+d[rear]);
			rear=d.length-1;
		}
		else
		{
			System.out.println("Delete element is:-"+d[rear]);
			rear--;
		}
	}
	
}
public class DequeueArray
{
     @SuppressWarnings("resource")
	public static void main(String args[])
     {
    	 Dequeue d=new Dequeue();
    	 Scanner sc=new Scanner(System.in);
    	 do
    	 {
    		 System.out.println("*********MENU**********");
    		 System.out.println("====================================");
    		 System.out.println("1.InsertFront");
    		 System.out.println("2.InsertRear");
    		 System.out.println("3.DeleteFront");
    		 System.out.println("4.DeleteRear");
    		 System.out.println("5.getFront");
    		 System.out.println("6.getRear");
    		 System.out.println("7.Display");
    		 System.out.println("8.Exit");
    		 System.out.println("Enter your choice");
    		 int choice =sc.nextInt();
    		 switch(choice)
    		 {
    			 case 1:
    				 System.out.println("Enter the value");
    				 int x=sc.nextInt();
    				 d.InsertFront(x);
    				 break;
    			 case 2:
    				 System.out.println("Enter the value");
    				 int x1=sc.nextInt();
    				 d.InsertRear(x1);
    				 break;
    			 case 3:
    				 d.DeleteFront();
    				 break;
    			 case 4:
    				 d.DeleteRear();
    				 break;
    			 case 5:
    				 d.getfront();
    				 break;
    			 case 6:
    				 d.getrear();
    				 break;
    			 case 7:
    				 d.Display();
    				 break;
    			 case 8:
    				 System.exit(0);
    				 break;
    			 default:
    				 System.out.println("you entered wrong");
    				 break;
    		 }
    		 System.out.println("do you want to cont....Enter 1");
    	 }while(sc.nextInt()==1);
    	 
     }
}
