package implementation;

public class ArrayListCompareLinkedList {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();

		a.addLast(10);
		a.addLast(20);
		a.addLast(30);
		a.addFirst(5);
		a.get(2);
		ArrayList.ListIterator ai = a.listIterator();

		LinkedList l = new LinkedList();
		l.addLast(10);
		l.addLast(20);
		l.addLast(30);
		l.addFirst(5);
		l.get(2);
	}

}
