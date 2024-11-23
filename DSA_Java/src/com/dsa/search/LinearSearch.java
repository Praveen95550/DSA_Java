package com.dsa.search;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {15,23,10,5,6,3,2,29};
		 int x = 29;
		int i = linearSearch(arr,x);
		 if(i == -1) {
			 System.out.println("not present");
		 }else {
			 System.out.println("present at index :"+i);
		 }
		 
	}

	private static int linearSearch(int[] arr, int x) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			if(x == arr[i]) {
				return i;
			}
		}
		return -1;
	}

}
