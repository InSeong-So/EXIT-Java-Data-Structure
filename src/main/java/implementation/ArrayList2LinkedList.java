package implementation;

class LinkedList1<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	private class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T input) {
			this.data = input;
			this.next = null;
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	}
}

public class ArrayList2LinkedList {

	public static void main(String[] args) {

	}
}
