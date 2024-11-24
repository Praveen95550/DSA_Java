package com.dsa.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 5,8, 9, 1, 6, 7 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int l, int r) {
		if (l < r) {
			int loc = partition(arr, l, r);
			quickSort(arr, l, loc - 1);
			quickSort(arr, loc + 1, r);
		}
	}

	private static int partition(int[] arr, int l, int r) {
		int pivot = arr[l];
		int start = l, end = r;
		while (start < end) {
			while (start < end && arr[start] <= pivot) {
				start++;
			}
			while (arr[end] > pivot) {
				end--;
			}
			if (start < end) {
				swap(arr, start, end);
			}
		}
		System.out.println("before pivot swap"+Arrays.toString(arr));
		swap(arr, l, end); // swapping the pivot element not start
		System.out.println(Arrays.toString(arr));
		return end;
	}

	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
