package sortingAlgorithm.quickSort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sortingAlgorithm.quickSort.QuickSort;

public class QuickSortTest {
	int[] numbers = { 4, 7, 1, 6, 3, 5, 4 };
	int[] afterSorting = { 1, 3, 4, 4, 5, 6, 7 };
	public static List<Integer> numbersList = Arrays.asList(4, 7, 1, 6, 3, 5, 4);
	public static List<Integer> sortingList = Arrays.asList(1, 3, 4, 4, 5, 6, 7);

	@Test
	public void quickSortTest() {
		assertEquals(sortingList, QuickSort.quickSort(numbersList));
	}
}
