package dataStructure.sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sort {

	// 버블 정렬 알고리즘
	public void bubbleSort(int[] numbers) {
		boolean numbersSwitched;
		do {
			numbersSwitched = false;
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i + 1] < numbers[i]) {
					int tmp = numbers[i + 1];
					numbers[i + 1] = numbers[i];
					numbers[i] = tmp;
					numbersSwitched = true;
				}
			}
		} while (numbersSwitched);
	}

	// 삽입 정렬 알고리즘
	public List<Integer> insertSort(List<Integer> numbers) {
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

	// 퀵 정렬 알고리즘
	public List<Integer> quickSort(List<Integer> numbers) {
		if (numbers.size() < 2) {
			return numbers;
		}

		Integer pivot = numbers.get(0);
		List<Integer> lower = new ArrayList<>();
		List<Integer> higher = new ArrayList<>();

		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) < pivot) {
				lower.add(numbers.get(i));
			} else {
				higher.add(numbers.get(i));
			}
		}

		List<Integer> sorted = quickSort(lower);
		sorted.add(pivot);
		sorted.addAll(quickSort(higher));

		return sorted;
	}

	// 병합 정렬 알고리즘
	public List<Integer> mergeSort(List<Integer> values) {
		if (values.size() < 2) {
			return values;
		}

		List<Integer> leftHalf = values.subList(0, values.size() / 2);
		List<Integer> rightHalf = values.subList(values.size() / 2, values.size());
		return merge(mergeSort(leftHalf), mergeSort(rightHalf));
	}

	// 병합
	private List<Integer> merge(List<Integer> left, List<Integer> right) {
		int leftPtr = 0;
		int rightPtr = 0;

		List<Integer> merged = new ArrayList<>(left.size() + right.size());

		while (leftPtr < left.size() && rightPtr < right.size()) {
			if (left.get(leftPtr) < right.get(rightPtr)) {
				merged.add(left.get(leftPtr));
				leftPtr++;
			} else {
				merged.add(right.get(rightPtr));
				rightPtr++;
			}
		}

		while (leftPtr < left.size()) {
			merged.add(left.get(leftPtr));
			leftPtr++;
		}

		while (rightPtr < right.size()) {
			merged.add(right.get(rightPtr));
			rightPtr++;
		}

		return merged;
	}

	// private static void mergeSort(int[] arr) {
	// int[] temp = new int[arr.length];
	// mergeSort(arr, temp, 0, arr.length - 1);
	// }
	//
	// private static void mergeSort(int[] arr, int[] temp, int start, int end) {
	// if (start < end) {
	// int mid = (start + end) / 2;
	// mergeSort(arr, temp, start, mid);
	// mergeSort(arr, temp, mid + 1, end);
	// merge(arr, temp, start, mid, end);
	// }
	// }
	//
	// private static void merge(int[] arr, int[] temp, int start, int mid, int end)
	// {
	// for (int i = start; i <= end; i++) {
	// temp[i] = arr[i];
	// }
	// int part1 = start;
	// int part2 = mid + 1;
	// int index = start;
	// while (part1 <= mid && part2 <= end) {
	// if (temp[part1] <= temp[part2]) {
	// arr[index] = temp[part1];
	// part1++;
	// } else {
	// arr[index] = temp[part2];
	// part2++;
	// }
	// index++;
	// }
	// for (int i = 0; i <= mid - part1; i++) {
	// arr[index + i] = temp[part1 + i];
	// }
	// }
	//
	// private static void printArray(int[] arr) {
	// for (int data : arr) {
	// System.out.print(data + " ");
	// }
	// System.out.println();
	// }
	//
	// public static void main(String[] args) {
	// int[] arr = { 3, 9, 4, 7, 5, 0, 1, 6, 8, 2 };
	// printArray(arr);
	// mergeSort(arr);
	// printArray(arr);
	// }

	static class HeapSort {
		private static int[] data;
		private static int number = 10;

		public static void heap(int[] data, int number) {
			for (int i = 1; i < number; i++) {
				int child = i;
				while (child > 0) {
					int parent = (child - 1) / 2;
					if (data[child] > data[parent]) {
						int temp = data[parent];
						data[parent] = data[child];
						data[child] = temp;
					}
					child = parent;
				}
			}
		}

		public static void main(String[] args) {
			data = new int[number];
			for (int i = 0; i < number; i++) {
				data[i] = (int) (Math.random() * 100);
			}

			System.out.print("정렬 전 : ");
			for (int i = 0; i < number; i++) {
				System.out.print(data[i] + " ");
			}

			heap(data, number);

			for (int i = number - 1; i > 0; i--) {
				int temp = data[0];
				data[0] = data[i];
				data[i] = temp;

				heap(data, i);
			}

			System.out.print("\n정렬 후 : ");
			for (int i = 0; i < number; i++) {
				System.out.print(data[i] + " ");
			}

		}
	}

}
