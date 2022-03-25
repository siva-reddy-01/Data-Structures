package Stacks;
import java.util.Scanner;
class LLNode
{
	int data;
	LLNode next;
	
	LLNode(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class Stack1
{
	LLNode Push(int data,LLNode head)
	{
		LLNode node=new LLNode(data);
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
	
	LLNode Pop(LLNode head)
	{
		if(head==null)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			head=head.next;
		}
		return head;
	}
	
	void Display(LLNode head)
	{
		LLNode temp=head;
		if(temp==null)
		{
			System.out.println("Stack is Empty");
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
	
	boolean isEmpty(LLNode head)
	{
		if(head==null)
		{
			return true;
		}
		return false;
	}
	
	int Peek(LLNode head)
	{
		if(head==null)
		{
			return -1;
		}
		return head.data;
	}
	
	int Count(LLNode head)
	{
		LLNode temp=head;
		int count=0;
		if(temp==null)
		{
			return 0;
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
}

public class LinkedlistStack
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Stack1 s=new Stack1();
		LLNode head=null;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("**********MENU**********");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PEEK");
			System.out.println("4.isEmpty");
			System.out.println("5.count");
			System.out.println("6.Display");
			System.out.println("7.Exit");
			System.out.println("Enter your choice...");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter value");
				int x=sc.nextInt();
				head=s.Push(x,head);
				break;
			case 2:
				head=s.Pop(head);
				break;
			case 3:
				System.out.println("Top Element is:- "+s.Peek(head));
				break;
			case 4:
				System.out.println("Stack is Empty:- "+s.isEmpty(head));
				break;
			case 5:
				System.out.println(s.Count(head));
				break;
			case 6:
				s.Display(head);
				break;
			case 7:
				System.exit(0);
				break;
			default:System.out.println("Wrong Choice");
			    break;
			}
			System.out.println("Do you want to cont...Enter 1");
			
		}while(sc.nextInt()==1);
	}
}