package Trees;
import java.util.Scanner;
class BNode
{
	int data;
	BNode left;
	BNode right;
	
	BNode(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
		
	}
}
public class BST
{
     BNode root;
     
     BNode Insert(int data,BNode root)
     {
    	 BNode node=new BNode(data);
    	 if(root==null)
    	 {
    		 root=node;
    	 }
    	 else if(data<root.data)
    	 {
    		
    		 root.left=Insert(data,root.left);
    	 }
    	 else
    	 {
    		 root.right=Insert(data,root.right);
    	 }
    	 return root;
     }
     
     BNode delete(BNode root,int data)
     {
    	 if(root==null)
    	 {
    		 return root;
    	 }
    	 if(data<root.data)
    	 {
    		 root.left=delete(root.left,data);
    	 }
    	 else if(data>root.data)
    	 {
    		 root.right=delete(root.right,data);
    	 }
    	 else
    	 {
    		 if(root.left==null)
    		 {
    			 return root.right;
    		 }
    		 else if(root.right==null)
    		 {
    			 return root.left;
    			 
    		 }
    		 
    		 root.data=minvalue(root.right);
    		 root.right=delete(root.right,root.data);
    	 }
    	 return root;
     }
     static void Inorder(BNode root)
     {
    	 if(root!=null)
    	 {
    		 Inorder(root.left);
    		 System.out.print(root.data+" ");
    		 Inorder(root.right);
    	 }
    	 
     }
     
     static void Preorder(BNode root)
     {
    	 if(root!=null)
    	 {
    		 System.out.print(root.data+" ");
    		 Preorder(root.left);
    		 Preorder(root.right);
    	 }
    
     }
     
     static void Postorder(BNode root)
     {
    	 if(root!=null)
    	 {
    		 Postorder(root.left);
    		 Postorder(root.right);
    		 System.out.print(root.data+" ");
    	 }    	
     }
     
     BNode Search(BNode root,int data)
     {
    	 if(root.data==data)
    	 {
    		 return root;
    	 }
    	 else if(data<root.data)
    	 {
    		 return Search(root.left,data);
    	 }
    	 else
    	 {
    		 return Search(root.right,data);
    	 }
     }
     
     int minvalue(BNode root)
     {
    	 int min=root.data;
    	 while(root.left!=null)
    	 {
    		 min=root.left.data;
    		 root=root.left;
    	 }
    	 return min;
     }
     
    @SuppressWarnings({ "resource", "static-access" })
	public static void main(String args[])
     {
    	 BST bst=new BST();
    	 BNode root=null;
    	 Scanner sc=new Scanner(System.in);
    	 do
    	 {
    		 System.out.println("**********MENU**********");
    		 System.out.println("1.Insert");
    		 System.out.println("2.Inorder");
    		 System.out.println("3.Preorder");
    		 System.out.println("4.postorder");
    		 System.out.println("5.Delete");
    		 System.out.println("6.Search");
    		 System.out.println("7.MinValue");
    		 System.out.println("8.Exit");
    		 System.out.println("Enter your choice");
    		 int x=sc.nextInt();
    		 switch(x)
    		 {
    		 case 1:
    			 System.out.println("Enter the data");
    			 int d=sc.nextInt();
    			 root=bst.Insert(d, root);
    			 break;
    		 case 2:
    			 System.out.println("Inorder Elements are:-");
    			 bst.Inorder(root);
    			 break;
    		 case 3:
    			 System.out.println("Preorder Elements are:-");
    			 bst.Preorder(root);
    			 break;
    		 case 4:
    			 System.out.println("Postorder Elements are");
    			 bst.Postorder(root);
    			 break;
    		 case 5:
    			 System.out.println("Enter data to delete");
    			 int data=sc.nextInt();
    			 bst.delete(root, data);
    			 break;
    		 case 6:
    			 System.out.println("Enter data to search");
    			 int data1=sc.nextInt();
    			 bst.Search(root,data1);
    			 break;
    		 case 7:
    			 bst.minvalue(root);
    			 break;
    		 case 8:
    			 System.exit(0); 
    		 }
    		 System.out.println("do you want to cont....Enter 1");
    	 }while(sc.nextInt()==1);
    	 
     }
}
