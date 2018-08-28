package dataStructure;

public class Main {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();
		l1.insertAtHead(10);l1.insertAtHead(20);l1.insertAtHead(30);
		l2.insertAtHead(10);l2.insertAtHead(20);l2.insertAtHead(30);
		l1.printList();
		System.out.println("\n L2 : ");
		l2.printList();
		System.out.println("l1 and l2 are equlal : "+LinkedList.compareTwoList(l1.head, l2.head));
		
		

	}

}
