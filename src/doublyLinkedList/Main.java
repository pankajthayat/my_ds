package doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		DoublyList list=new DoublyList();
		list.insertAtHead(10);
		list.insertAtHead(20);
		list.insertAtHead(30);
		System.out.println(list);
		list.insertAtEnd(90);
		list.insertAtEnd(100);
		
		System.out.println(list);
		System.out.println(list.length);
		list.deleteAtPos(3);
		list.deleteAtPos(0);
		System.out.println(list.length);
		list.deleteAtPos(2);
		System.out.println(list);

	}

}
