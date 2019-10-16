package BubbleSort;

import java.util.Collections;
import java.util.Scanner;

public class bubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String a = sc.next();
		
		String[] mm = new String[n];
		for(int i=0;i<n;i++) {
			mm[i] = sc.next();
		}
		
		if(a.equals("A")) {
			for(int i=0;i<m;i++) {
				for(int j=0;j<mm.length-1;j++) {
					if(mm[j].compareTo(mm[j+1])>0) {
						String temp = mm[j+1];
						mm[j+1] = mm[j];
						mm[j] = temp;
					}
				}
			}
			for(int k=0;k<mm.length;k++) {
				System.out.print(mm[k]+" ");
			}
		}
		else if(a.equals("D")) {
			for(int i=0;i<m;i++) {
				for(int j=0; j<mm.length-1;j++) {
					if(mm[j].compareTo(mm[j+1])<0) {
						String temp = mm[j+1];
						mm[j+1] = mm[j];
						mm[j] = temp;
					}
				}
			}
			for(int k=0;k<mm.length;k++) {
				System.out.print(mm[k]+" ");
			}
		}
	}

}
