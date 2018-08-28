package doublyEndedList;

public class DoublyEndedList {
private Node head;
private Node tail;
private int length;
void insertAtHead(int data)
{
	Node node=new Node(data);
	if(head==null)
	{
		head=node;
		tail=head;
	}
	else
	{
		node.setNext(head);
		head=node;
	}
}
void insertAtTail(int data)
{
	Node node=new Node(data);
	if(head==null)
	{
		head=node;
		tail=head;
	}
	else
	{
		tail.setNext(node);
		tail=node;
	}
}
@Override
	public String toString() {
		Node current=head;
		String result="{ ";
		while(current!=null)
		{
			result+=current.toString()+" ,";
			current=current.getNext();
		}
		return result+" }";
	}

}
