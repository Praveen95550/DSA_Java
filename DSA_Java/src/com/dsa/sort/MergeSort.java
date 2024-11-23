package com.dsa.sort;

import java.util.Arrays;

public class MergeSort {

	
	private static void mergeSort(int[] arr, int l, int r) {
		
		if(l<r) {
		int mid = (l+r)/2;
		mergeSort(arr,l,mid);
		mergeSort(arr,mid+1,r);
		
		merge(arr,l,mid,r);
		}
		
	}
	private static void merge(int[] arr, int l, int mid, int r) {
		
		int n1 = mid -l +1;
		int n2 = r - mid;
		int[] leftArr = new int[n1];
		int rightArr[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			leftArr[i] = arr[l+i];
		}
		
		for(int i=0;i<n2;i++) {
			rightArr[i] = arr[mid+1+i];
		}
		int i=0,j=0,k=l;
		while(i <n1 && j <n2) {
			
			if(leftArr[i] <= rightArr[j]) {
				arr[k]=leftArr[i];
				i++;
			}else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rightArr[j];
			j++;
			k++;
		}
	}
	public static void main(String[] args) {
		int arr[] = {8,5,9,1,6,7};
		System.out.println("Unsorted Array");
		printArray(arr);
		mergeSort(arr,0,arr.length-1);
		printArray(arr);
	}
	private static void printArray(int[] arr) {
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(arr));
		
	}

	
}
