package circularList;

public class CircularList {
private Node tail;
public int length;



void insertAtHead(int data)
{
	Node node =new Node(data);
	if(tail==null)
	{
		tail=node;
		node.setNext(tail);
	}
	else
	{
		node.setNext(tail.getNext());
		tail.setNext(node);
	}
	length++;
}

void insertAtTail(int data)
{
	Node node =new Node(data);
	if(tail==null)
	{
		tail=node;
		node.setNext(tail);;
	}
	else
	{
		node.setNext(tail.getNext());
		tail.setNext(node);
		tail=node;
	}
}

void print()
{
	
	if(tail==null)
		System.out.println("No elemnts to print");
	else
	{
		Node current=tail;
		do
		{
			System.out.print(current.getNext());
			current=current.getNext();
		}
		while(current!=tail);
	}
}
}
