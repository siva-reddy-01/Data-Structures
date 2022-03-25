package Linkedlists;
import java.util.Scanner;
class DNode
{
	int data;
	DNode prev;
	DNode next;
	
	DNode(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
public class DoubleLinkedlist
{
      DNode InsertBeg(DNode head,int data)
      {
    	  DNode node=new DNode(data);
    		  node.next=head;
    		  if(head!=null)
    		  {
    			  head.prev=node;
    		  } 

    	  return node;
      }
      
      DNode InsertEnd(DNode head,int data)
      {
    	  DNode node=new DNode(data);
    	  if(head==null)
    		  return node;
    	  DNode temp=head;
    	  while(temp.next!=null)
    	  {
    		  temp=temp.next;
    	  }
    	  temp.next=node;
    	  node.prev=temp;
    	  return head;
      }
      
      DNode DeleteBeg(DNode head)
      {
    	  if(head==null)
    	  {
    		  return null;
    	  }
    	  if(head.next==null)
    	  {
    		  return null;
    	  }
    	  else
    	  {
    		  head=head.next;
    		  head.prev=null;
    		  return head;
    	  }
      }
      
      DNode DeleteEnd(DNode head)
      {
    	  if(head==null)
    	  {
    		  return null;
    	  }
    	  if(head.next==null)
    	  {
    		  return null;
    	  }
    	  else
    	  {
    		  DNode temp=head;
    		  while(temp.next!=null)
    		  {
    			  temp=temp.next;
    		  }
    		  temp.prev.next=null;
    		  return head;
    	  }
      }
      
      void Display(DNode head)
      {
    	  if(head==null)
    	  {
    		 System.out.println("No elements to display");
    	  }
    	  else
    	  {
    		  DNode temp=head;
    		  while(temp!=null)
    		  {
    			  System.out.print(temp.data+" ");
    			  temp=temp.next;
    		  }
    		  System.out.println();
    	  }
      }
      
      @SuppressWarnings("resource")
	public static void main(String args[])
      {
    	  DoubleLinkedlist d=new DoubleLinkedlist();
    	  DNode head=null;
    	  Scanner sc=new Scanner(System.in);
    	  
    	  do
    	  {
    		  System.out.println("**********MENU**********");
    		  System.out.println("================================");
    		  System.out.println("1.InsertBeg");
    		  System.out.println("2.InsertEnd");
    		  System.out.println("3.DeleteBeg");
    		  System.out.println("4.Delete End");
    		  System.out.println("5.Display");
    		  System.out.println("6.Exit");
    		  System.out.println("Enter your choice");
    		  int choice=sc.nextInt();
    		  switch(choice)
    		  {
    		  case 1:
    			  System.out.println("Enter the value");
    			  int x=sc.nextInt();
    			  head=d.InsertBeg(head, x);
    			  break;
    		  case 2:
    			  System.out.println("Enter the value");
    			  int val=sc.nextInt();
    			  head=d.InsertEnd(head, val);
    			  break;
    		  case 3:
    			  head=d.DeleteBeg(head);
    			  break;
    		  case 4:
    			  head=d.DeleteEnd(head);
    			  break;
    		  case 5:
    			  d.Display(head);
    			  break;
    		  case 6:
    			  System.exit(0);
    			  break;
    		  default:
    			  System.out.println("please enter correct choice");
    			  break;
    		  }
    		  System.out.println("do want to cont....Enter 1");
    	  }while(sc.nextInt()==1);
      }
}
