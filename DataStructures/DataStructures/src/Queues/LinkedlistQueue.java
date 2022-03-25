package Queues;
import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}

class Queue1
{
	Node Enqueue(Node head,int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
		return head;
	}
	
	Node Dequeue(Node head)
	{
		if(head==null)
		{
			System.out.println("Queue is underflow");
		}
		else
		{
			head=head.next;
		}
		return head;
	}
	
	void Display(Node head)
	{
		if(head==null)
		{
			System.out.println("No elements to display");
		}
		else
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	
	boolean isEmpty(Node head)
	{
		if(head==null)
			return true;
		return false;
	}

}

public class LinkedlistQueue
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
	
	Queue1 q=new Queue1();
	Node head=null;
	Scanner sc=new Scanner(System.in);
	do
	{
		System.out.println("*****MENU*****");
		System.out.println("=============================");
		System.out.println("1.Enqueue");
		System.out.println("2.Dequeue");
		System.out.println("3.Display");
		System.out.println("4.isEmpty");
		System.out.println("5.Exit");
		System.out.println("Enter your choice");
		int choice= sc.nextInt();
		switch(choice)
		{
		  case 1:
			  System.out.println("Enter the value");
			  int x=sc.nextInt();
			  head=q.Enqueue(head, x);
			  break;
		  case 2:
			  head=q.Dequeue(head);
			  break;
		  case 3:
			  q.Display(head);
			  break;
		  case 4:
			  System.out.println("Queue is Empty: "+q.isEmpty(head));
			  break;
		  case 5:
			  System.exit(0);
			  break;
		  default:
			  System.out.println("Please enter Wright choice!");
			  break;
		}
		System.out.println("do you want to cont...Enter 1");
	}while(sc.nextInt()==1);
	}
}
