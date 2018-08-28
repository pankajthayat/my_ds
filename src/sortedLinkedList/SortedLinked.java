package sortedLinkedList;

public class SortedLinked {
private Node head;
private int length;

void insert(int data)
{
	Node node=new Node(data);
	if(head==null)
		head=node;
	else if(head.getData()>data)
	{
		node.setNext(head);
		head=node;
	}
	else
	{
		Node current=head;
		while(current.getNext()!=null&&current.getNext().getData()<data)
		{
			current=current.getNext();
		}
		node.setNext(current.getNext());
		current.setNext(node);
	}
}
@Override
	public String toString() {
		String result="{";
		Node current=head;
		while(current!=null)
		{
			result+=current.toString();
			current=current.getNext();
		}
		return result+"}";
	}
}
