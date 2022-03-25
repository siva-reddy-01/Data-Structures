package Linkedlists;
import java.util.Scanner;
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
public class SingleLinkedlist
{
	Node InsertBeg(Node head,int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
			node.next=head;
			head=node;
		}
		return head;
	}
	
	Node InsertEnd(Node head,int data)
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
	
	Node InsertPos(Node head,int data,int pos)
	{
		Node node=new Node(data);
		Node temp=head;
		if(temp==null)
		{
			temp=node;
		}
		else if(pos==1)
		{
			node.next=temp;
			temp=node;
		}
		else
		{
			for(int i=1;i<pos-1 && temp.next!=null;i++)
			{
				temp=temp.next;
			}
			temp.next=node;
			node.next=temp.next.next;
		}
		return head;
	}
	
	Node DeleteBeg(Node head)
	{
		if(head==null)
		{
			System.out.println("No Elements to Delete");
		}
		else
		{
			head=head.next;
		}
		return head;
	}
	
	Node DeleteEnd(Node head)
	{
		
		if(head==null)return null;
		Node temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;

		return head;
	}
	
	Node DeletePos(Node head,int pos)
	{
		if(head==null)
		{
			System.out.println("No elements to Delete");	
		}
		else if(pos==1)
		{
			head=head.next;
		}
		else
		{
			Node temp=head;
			for(int i=1;i<pos-1 && temp.next!=null;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
		return head;
	}
	
	void Display(Node head)
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("No elements to display");
		}
		else
		{
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		}
	}
	
	@SuppressWarnings("unused")
	int search(Node head,int x)
	{ 
		Node node=new Node(x);
		Node temp=head;
		int pos=1;
		while(temp!=null)
		{
			
		 if(temp==null)
		 {
		    System.out.println("No elements to search");
		 }
		 if(temp.data==x)
		 {
			return pos;
			
		 }
		 else
		 {
			pos++;
			temp=temp.next;
		 }
		}
			
		return -1;
	}
	
	int count(Node head)
	{
		Node temp=head;
		int count=0;
		if(temp==null)
		{
			return count;
		}
		else
		{
			while(temp!=null)
			{
				temp=temp.next;
				count++;
			}
		}
		return count;
	}
	
	Node Reverse(Node head)
	{
		Node curnode=head,prevnode=null,nextnode=null;
		while(curnode!=null)
		{
			nextnode=curnode.next;
			curnode.next=prevnode;
			
			prevnode=curnode;
			curnode=nextnode;
		}
		head=prevnode;
		return head;
	}
	
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		SingleLinkedlist l=new SingleLinkedlist();
		Node head=null;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("*********MENU**********");
			System.out.println("==================================================");
			System.out.println("1.InsertBeg");
			System.out.println("2.InsertEnd");
			System.out.println("3.InsertPos");
			System.out.println("4.DeleteBeg");
			System.out.println("5.DeleteEnd");
			System.out.println("6.DeletePos");
			System.out.println("7.Display");
			System.out.println("8.Search");
			System.out.println("9.count");
			System.out.println("10.Reverse");
			System.out.println("11.Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the value");
				int x=sc.nextInt();
				head=l.InsertBeg(head, x);
				break;
			case 2:
				System.out.println("Enter the value");
				int x1=sc.nextInt();
				head=l.InsertEnd(head, x1);
				break;
			case 3:
				System.out.println("Enter the value");
				int x2=sc.nextInt();
				System.out.println("Enter position to Insert");
				int pos=sc.nextInt();
				head=l.InsertPos(head, x2, pos);
				break;
			case 4:
				head=l.DeleteBeg(head);
				break;
			case 5:
				head=l.DeleteEnd(head);
				break;
			case 6:
				System.out.println("Enter position to Delete");
				int pos1=sc.nextInt();
				head=l.DeletePos(head,pos1);
				break;
			case 7:
				l.Display(head);
				break;
			case 8:
				System.out.println("Enter value to search");
				int val=sc.nextInt();
				int res2=l.search(head,val);
				System.out.println(res2);
				break;
			case 9:
				int res=l.count(head);
				System.out.println(res);
				break;
			case 10:
				head=l.Reverse(head);
				break;
			case 11:
				System.exit(0);
				break;
			default:
				System.out.println("You Enter wrong choice....please Enter correct choice");
				break;
			}
			System.out.println("Do you want to cont....Enter 1");
		}while(sc.nextInt()==1);
	}
}