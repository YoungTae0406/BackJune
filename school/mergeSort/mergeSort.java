package mergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {
	static String[] temp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 원소개수
		int m = sc.nextInt(); //합병수
		String a = sc.next(); //오름,내림차순
		
		temp = new String[n];
		String[] mergge = new String[n];
		for(int i=0;i<n;i++) {
			mergge[i] = sc.next();
		}
		if(a.equals("A")) {
			temp = merge_sortA(mergge, m);
			
			for(int i=0;i<temp.length;i++) {
				System.out.print(temp[i]+" ");
			}
		}

	}
	public static String[] merge_sortA(String[] a, int m) {
		if(a.length <=1 ) {
			return a;
		}
		int middle = a.length/2;
		int j =0;
		String[] lefttemp = new String[middle];
		for(int i=0;i<middle;i++) {
			lefttemp[i] = a[j];
			j++;
		}
		String[] righttemp = new String[a.length-middle];
		for(int i=0;i<a.length-middle;i++) {
			righttemp[i] = a[j];
			j++;
		}
		merge_sortA(lefttemp, m);
		merge_sortA(righttemp, m);
		temp = mergeA(lefttemp, righttemp);
		return temp;
	}
	public static String[] mergeA(String[] left, String[] right) {
		int k =0;
		while(left.length>0 && right.length >0) {
			if(left.length>0 && right.length>0) {
				if(left[0].compareTo(right[0])<=0) {
					temp[k] = left[0];
					left = Arrays.copyOfRange(left, 1, left.length);
					k++;
				}
				else {
					temp[k] = right[0];
					right = Arrays.copyOfRange(right, 1, right.length);
					k++;
				}
			}
			else if (left.length>0) {
				temp[k] = left[0];
				left = Arrays.copyOfRange(left, 1, left.length);
				k++;
			}
			else if(right.length >0) {
				temp[k] = right[0];
				right = Arrays.copyOfRange(right, 1, right.length);
				k++;
			}
		}
		return temp;
		
	}
	
}
