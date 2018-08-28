package stack;

public class Main {

	public static void main(String[] args) throws Exception {
		Stack s=new Stack();
		System.out.println(s.size());
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println("Capacity : "+s.capacity);
		s.push(40);
		s.push(50);
		System.out.println("Capacity : "+s.capacity);
		System.out.println("size : "+s.size());
		System.out.println(s);
		s.pop();
		System.out.println(s);

	}

}
