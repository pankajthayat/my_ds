package dataStructure;

public class LinkedList {
public Node head;
public int length;

public void insertAtHead(int data)
{
	Node node =new Node(data);
	if(head==null)
		head=node;
	else
	{
		node.setNext(head);
		head=node;
	}
	length++;
}
void printList()
{
	Node flag=head;
	if(flag==null)
		System.out.println("List is empty");
	while(flag!=null)
	{
		System.out.println(flag.getData()+" ");
		flag=flag.getNext();
	}
}
void deleteAtHead()
{
	if(head==null)
		System.out.println("list is empty ");
	else
	{
	head=head.getNext();
	length--;
	}	
}
void insertAtPos(int pos,int data)
{
	Node node =new Node(data);
	int x=0;
	Node flag=head;
	if(pos==0)
	{
		node.setNext(head);
		head=node;
		return;
	}
	while(x!=pos-1)
	{
		flag=flag.getNext();
		x++;
	}
	node.setNext(flag.getNext());
	flag.setNext(node);
	length++;
}
void insertAtTheEnd(int data)
{
	Node node =new Node(data);
	Node current=head;
	if(current==null)
		head=node;
	while(current.getNext()!=null)
	{
		current=current.getNext();
	}
	current.setNext(node);
	length++;
}

void printReverse()
{
	reverseprint(head);
	System.out.println(head.getData());
}
Node reverseprint(Node head)//this is just by luck....try to understand the recursive methods deeply
{
	if(head.getNext()==null)
		return head;
	System.out.println(reverseprint(head.getNext()).getData());
	//System.out.println(head.getData()+" , ");
	return head;
}

public void reverseList()
{
	Node x=head;
	if(x==null)
		System.out.println("No elements in list");;
	Node y=x.getNext();
	if(y==null)
		return;
	Node z=y.getNext();
	
	while(z!=null)
	{
	y.setNext(x);
	x=y;
	y=z;
	z=z.getNext();
	}
	y.setNext(x);
	head.setNext(null);
	head=y;
}

public static boolean compareTwoList(Node head1,Node head2)
{
	if(head1==null&&head2==null)
		return true;
	else if(head1==null||head2==null)
	{
		return false;
//		if(head1.getData()==head2.getData())
//			compareTwoList(head1.getNext(), head2.getNext());
//		else
//			return false;
		
	}
	
		if(head1.getData()==head2.getData())
		compareTwoList(head1.getNext(), head2.getNext());
	else
		return false;
	
}




}
