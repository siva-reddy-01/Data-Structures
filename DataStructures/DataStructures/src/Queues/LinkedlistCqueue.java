package Queues;
import java.util.Scanner;
class CNode
{
	int data;
	Node next;
	CNode(int data)
	{
		this.data=data;
		this.next=null;
	}
	
}
public class LinkedlistCqueue 
{
	Node Enqueue(int data,Node head)
	{
		Node node=new Node(data);
		if(head==null)
		{
			node.next=node;
			return node;
		}
		else
		{
			Node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=node;
			node.next=head;
		}
		return head;
	}
	
	Node Dequeue(Node head)
	{
		if(head==null)
		{
			return null;
		}
		else if(head.next==head)
		{
			return head;
		}
		else
		{
			Node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=head.next;
			return temp.next;
		}
		
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
			do
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}while(temp!=head);
		}
		System.out.println();
	}
	
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		LinkedlistCqueue l=new LinkedlistCqueue();
		Node head=null;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("**********MENU*********");
			System.out.println("======================================");
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
				head=l.Enqueue(x, head);
				break;
			case 2:
				head=l.Dequeue(head);
				break;
			case 3:
				l.Display(head);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("you entered wrong choice");
				break;
			}
			System.out.println("Do you want to cont.....Enter 1");
		}while(sc.nextInt()==1);
	}
}
