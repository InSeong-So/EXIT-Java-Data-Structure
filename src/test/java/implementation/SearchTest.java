package implementation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import implementation.Search;
import implementation.SortTest;

public class SearchTest {

	@Test
	public void binarySearchTest() {
		Search search = new Search();

		assertEquals(true, search.binarySearch(SortTest.sortingList, 3));

	}
}
