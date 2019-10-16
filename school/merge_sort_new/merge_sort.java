package merge_sort_new;

import java.util.Scanner;

public class merge_sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 원소개수
		int m = sc.nextInt(); //합병수
		String a = sc.next(); //오름,내림차순
		
		String[] merggee = new String[n];
		for(int i=0;i<n;i++) {
			merggee[i] = sc.next();
		}
		mergeeSort(merggee, 0, merggee.length-1);
		printArray(merggee);
		
	}
	public static void mergeeSort(String[] arr, int left, int right) {
		if(left<right) {
			int mid = (left+right)/2;
			mergeeSort(arr, left, mid);
			mergeeSort(arr, mid+1, right);
			mergee(arr, left, mid, right);
		}
	}
	
	public static void mergee(String[] arr, int left, int mid, int right) {
		int i = left;
		int j = mid+1;
		int k = left;
		String temp[] = new String[arr.length];
		while(i<=mid && j<=right) {
			if(arr[i].compareTo(arr[j])>=0) {
				temp[k++] = arr[i++];
			}else {
				temp[k++] = arr[j++];
			}
		}
		while(i<=mid)
			temp[k++] = arr[i++];
		while(j<=right)
			temp[k++] = arr[j++];
		for(int index=left; index<k; index++)
			arr[index] = temp[index];
	}
	public static void printArray(String arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print( arr[i] + " ");
		}
		System.out.println();
	}
	
}
