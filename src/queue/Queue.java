package queue;

public class Queue {
private int data;
public int capacity=6;
public int length;
public int front=-1;
public int end=-1;
private int arr[];
public Queue() {
arr=new int[capacity];	
}
public boolean isEmpty() {
	return front>end||front==-1;
}
public boolean isFull()
{
	return end-front>=capacity;
}
void display()
{
	int f=front;
	int e=end;
	String s="[ ";
	while(f<=e)
	{
		s=s+arr[f%capacity]+" , ";
		f++;
	}
	System.out.println(s+" ]");
}
public void enQueue(int data) throws Exception
{
	if(isFull())
		throw new Exception("Queue is  full");
	else if(front==-1)
	{
		arr[++end]=data;
		front++;
	}
	else
	{
		end++;
		arr[end%capacity]=data;
	}
}

public void deQueue() throws Exception
{
	if(isEmpty())
		throw new Exception("Queue is empty");
	front++;
}


}
