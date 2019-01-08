package dataStructure.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import dataStructure.search.Search;
import dataStructure.sort.SortTest;

public class SearchTest {

	@Test
	public void binarySearchTest() {
		Search search = new Search();

		assertEquals(true, search.binarySearch(SortTest.sortingList, 3));

	}
}
