package Linkedlists;
import java.util.Scanner;
class CNode
{
	int data;
	CNode next;
	CNode(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class CircularLinkedlist 
{
     Node InsertBeg(Node head,int data)
     {
    	 Node node=new Node(data);
    	 if(head==null)
    	 {
    		 node.next=node;
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
    	 return node;
     }
     
     Node InsertEnd(Node head,int data)
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
     
   Node DeleteBeg(Node head)
   {
	  if(head==null)
	  {
		  return null;
	  }
	  else  if(head.next==head)
	  {
		  return null;
	  }
	  else
	  {
		  Node temp=head;
		  while(temp.next!=head)
		  {
			  temp=temp.next;
		  }
		  temp.next=head.next;
		  head=temp.next;
	  }
	  return head;
   }
   
  Node DeletePos(Node head,int pos)
  {
	  if(head==null)
	  {
		  return null;
	  }
	  else if(pos==1)
	  {
		  return null;
	  }
	  else
	  {
		  Node temp=head;
		  for(int i=1;i<pos-1;i++)
		  {
			  temp=temp.next;
		  }
		  temp.next=temp.next.next;
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
		  do
		  {
			  System.out.print(temp.data+" ");
			  temp=temp.next;
		  }while(temp!=head);
		  System.out.println();
	  }
  }
  
  @SuppressWarnings("resource")
public static void main(String args[])
  {
	  CircularLinkedlist c=new CircularLinkedlist();
	  Node head=null;
	  Scanner sc=new Scanner(System.in);
	  do
	  {
		  System.out.println("**********MENU**********");
		  System.out.println("================================");
		  System.out.println("1.InsertBeg");
		  System.out.println("2.InsertEnd");
		  System.out.println("3.DeleteBeg");
		  System.out.println("4.Delete at paticular pos");
		  System.out.println("5.Display");
		  System.out.println("6.Exit");
		  System.out.println("Enter your choice");
		  int choice=sc.nextInt();
		  switch(choice)
		  {
		  case 1:
			  System.out.println("Enter the value");
			  int x=sc.nextInt();
			  head=c.InsertBeg(head, x);
			  break;
		  case 2:
			  System.out.println("Enter the value");
			  int val=sc.nextInt();
			  head=c.InsertEnd(head, val);
			  break;
		  case 3:
			  head=c.DeleteBeg(head);
			  break;
		  case 4:
			  System.out.println("Enter position to delete");
			  int pos=sc.nextInt();
			  head=c.DeletePos(head, pos);
			  break;
		  case 5:
			  c.Display(head);
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
