package queue;

public class Main {

	public static void main(String[] args) throws Exception {
Queue obj=new Queue();
System.out.println("is Empty : "+obj.isEmpty());
obj.enQueue(10);
obj.enQueue(20);
obj.enQueue(30);
obj.enQueue(50);
obj.enQueue(60);
obj.enQueue(80);
obj.enQueue(1000);
obj.deQueue();
obj.deQueue();
obj.display();
	}

}
