package printReverseList;

public class Client {
public static class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}
public static class SinglyList
{
	Node head;
	void insertAtHead(int data)
	{
		Node node=new Node(data);
		if(head==null)
			head=node;
		else
		{
			node.next=head;
			head=node;
		}
	}
	void printList()
	{
		Node c=head;
		while(c!=null)
		{
			System.out.print(c.data+" ");
			c=c.next;
		}
	}
	
	void printReverse()
	{
		reverse(head);
	}
	private void reverse(Node head)
	{
		if(head!=null)
		{
			reverse(head.next);
			System.out.print(head.data+" ");
		}
	}
}


public static void main(String[] args)
{
	//Node n=null;
	SinglyList list=new SinglyList();
	list.insertAtHead(10);list.insertAtHead(20);list.insertAtHead(30);list.insertAtHead(40);list.insertAtHead(50);
	list.printList();
	//list.reverse(n);
	System.out.println();
	list.printReverse();
	
}




}
