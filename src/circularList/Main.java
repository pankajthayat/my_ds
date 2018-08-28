package circularList;

public class Main {

	public static void main(String[] args) {
		CircularList list=new CircularList();
		list.insertAtHead(10);list.insertAtHead(20);list.insertAtHead(20);list.insertAtHead(40);
		list.print();
		System.out.println();
		list.insertAtTail(11);list.insertAtTail(22);list.insertAtTail(33);
		list.print();

	}

}
