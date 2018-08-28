package doublyEndedList;

public class Node {
private int data;
private Node next;
public void setData(int data) {
	this.data = data;
}public void setNext(Node next) {
	this.next = next;
}public int getData() {
	return data;
}public Node getNext() {
	return next;
}
public Node(int data) {
	// TODO Auto-generated constructor stub
	this.data=data;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "data :"+data;
	}
}
