package implementation;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);

		System.out.println(numbers.node(0));
		
		System.out.println(numbers);
	}
}
