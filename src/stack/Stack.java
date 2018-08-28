package stack;

public class Stack {
public int capacity;
private static final int CAPACITY=1;// make this variable non static and see the difference
private int top=-1;
private int[] arr;
public Stack() {
	this(CAPACITY);
}
public Stack(int cap)
{
	this.capacity=cap;
	arr=new int[capacity];
}
public boolean isEmpty()
{
	return top<0;
}
public boolean isfull()
{
	return top>capacity-1;
}
public int size()
{
	return top+1;
}
public void push(int data) throws Exception
{
	if(size()>=capacity)
	{
		System.out.println("stack is full.. expending it");
		expend();
	}
	arr[++top]=data;
}

// to implement the concept of dynamic array
private void expend()
{
	capacity=2*capacity;
	int arrNew[]=new int[capacity];
	System.arraycopy(arr, 0, arrNew, 0, size());
	arr=arrNew;
}
// this method is not defined
private void shrink()
{
	capacity=capacity;
}

public void pop() throws Exception
{
	if(isEmpty())
		throw new Exception("stack is EMpty");
	else if(size()<=(3/4)*capacity)
	{
		System.out.println("size is very less... shrinking the stack");
		shrink();
	}
	arr[top--]=Integer.MIN_VALUE;
}

@Override
	public String toString() {
		String result="[ ";
		int i=0;
		while(i<=top)
		{
			result+=arr[i]+",";
			i++;
		}
		return result+" ]";
	}
}
