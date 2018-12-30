package implementation;

public class LinkedList {

	private Node head;
	private Node tail;
	private int size = 0;

	private class Node {
		private Object data;
		private Node next;

		public Node(Object input) {
			this.data = input;
			this.next = null;
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	}

	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if (head.next == null) {
			tail = head;
		}
	}

	public void addLast(Object input) {
		Node newNode = new Node(input);
		if (size == 0) {
			addFirst(input);
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

//	내부적인 부품이 외부에 노출되면 안됨
//	public Node node(int index) {
	Node node(int index) {
		Node x = head;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

	public void add(int index, Object input) {
		if (index == 0) {
			addFirst(input);
		} else {
			Node temp1 = node(index - 1);
			Node temp2 = temp1.next;
			Node newNode = new Node(input);
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
			if (newNode.next == null) {
				tail = newNode;
			}
		}
	}

	public String toString() {
		if (head == null) {
			return "[]";
		}

		Node temp = head;
		String str = "[";

		while (temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		str += temp.data;

		return str + "]";
	}

	public Object removeFirst() {
		Node temp = head;
		head = head.next;
		Object returnData = temp.data;
		temp = null;
		size--;
		return returnData;
	}

	public Object remove(int index) {
		if (index == 0) {
			return removeFirst();
		}
		Node temp = node(index - 1);
		Node todoDeleted = temp.next;
		temp.next = temp.next.next;
		Object returnData = todoDeleted.data;
		if (todoDeleted == tail) {
			tail = temp;
		}
		size--;
		return returnData;
	}

	public Object removeLast() {
		return remove(size - 1);
	}
	
	public int size() {
		return size;
	}
	
	public Object get(int index) {
		Node temp = node(index);
		return temp.data;
	}

}
