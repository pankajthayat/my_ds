package sortedLinkedList;

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
	this.data=data;
}
@Override
	public String toString() {
		
		return " data :"+data;
	}
}
