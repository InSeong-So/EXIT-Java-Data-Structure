package sortingAlgorithm.insertionSort;

import java.util.LinkedList;
import java.util.List;

public class InsertionSort {

	// 삽입 정렬 알고리즘
	public static List<Integer> insertionSort(List<Integer> numbers) {
		List<Integer> sortedList = new LinkedList<>();
		originalList: for (Integer number : numbers) {
			for (int i = 0; i < sortedList.size(); i++) {
				if (number < sortedList.get(i)) {
					sortedList.add(i, number);
					continue originalList;
				}
			}
			sortedList.add(sortedList.size(), number);
		}

		return sortedList;
	}
}
