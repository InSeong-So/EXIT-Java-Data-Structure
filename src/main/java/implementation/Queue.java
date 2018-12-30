package implementation;

public class Queue {

	private int front;
	private int rear;
	private int size;
	private Object[] queueArray;

	public Queue(int size) {
		this.front = 0;
		this.rear = -1;
		this.size = size;
		this.queueArray = new Object[size];

	}
}
