package doublyLinkedList;

public class DoublyList {
private Node head;
public int length;

void insertAtHead(int data)
{
	Node node=new Node(data);
	if(head==null)
		head=node;
	else
	{
		node.setNext(head);
		head.setPre(node);
		head=node;
	}
	length++;
}
void insertAtEnd(int data)
{
	Node node =new Node(data);
	if(head==null)
	head=node;
	else
	{
		Node current=head;
		while(current.getNext()!=null)
		current=current.getNext();
		current.setNext(node);
		node.setPre(current);
	}
	length++;
}

void deleteAtPos(int pos)
{
int flag=0;
Node current=head;
while(flag!=pos)
{
	current=current.getNext();
	flag++;
}
if(pos==0)
{
	if(length==1)
		head=null;
	else
	{
		head.getNext().setPre(null);
		head=head.getNext();
	}
}
else if(length==pos+1)
{
	current.getPre().setNext(null);
	current.setPre(null);
}
else
{
	current.getPre().setNext(current.getNext());
	current.getNext().setPre(current.getPre());
	current.setNext(null);
	current.setPre(null);
}
length--;
}

@Override
	public String toString() {
		String result="{ ";
		Node current=head;
		while(current!=null)
		{
			result+=current.toString()+",";
			current=current.getNext();
		}
		return result+" }";
	}
}
