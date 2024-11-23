package com.dsa.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,4,9,29,15,3};
	int[] sortedArr= bubbleSort(arr);
	System.out.println(Arrays.toString(sortedArr));
	}

	private static int[] bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for(int i=0;i <n-1;i++) {
			for(int j=0; j< n-1-i;j++) { //(-i -> skip the comparisons which has already sorted)
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

}
