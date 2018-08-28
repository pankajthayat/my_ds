package doublyEndedList;

public class Main {

	public static void main(String[] args) {
	DoublyEndedList list=new DoublyEndedList();
	list.insertAtHead(10);
	list.insertAtHead(20);
	list.insertAtHead(30);
	System.out.println(list);
	list.insertAtTail(90);
	list.insertAtTail(80);
	System.out.println(list);
	}

}
