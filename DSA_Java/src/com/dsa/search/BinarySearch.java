package com.dsa.search;

public class BinarySearch {

	/*
	 * We can do in two approaches 1. Recursive 2. Iterative
	 * 
	 * Divide and conquer rule -> find mid index and compare the data 
	 * 
	 * terminate condition -> l <= r
	 * 
	 */  
	private void searchRecursive(int[] arr,int min, int max) {
		int x= 28;
		
		int mid = (min + max)/2;
		if(min <= max) {
		if(x == arr[mid]) {
			System.out.println(x +" is present");
		}else if(x < arr[mid]) {
			searchRecursive(arr, min, mid-1);
		}else {
			searchRecursive(arr, mid+1, max);
			}
		}else {
			System.out.println(x +" is not present");
		}
		
	}
	
	private int searchIterative(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		int x = 17;
		while(l <= r) {
			int mid = (l+r)/2;
			if(x == arr[mid]) {
				return mid;
			}else if(x < arr[mid]) {
				r = mid-1;
			}else {
				l = mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,5,7,10,16,20,25,28};
		BinarySearch bs = new BinarySearch();
		bs.searchRecursive(arr, 0, arr.length-1);
		int x =bs.searchIterative(arr, 0, arr.length-1);

	}
}
