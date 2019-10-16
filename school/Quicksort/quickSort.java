package Quicksort;

import java.util.Scanner;

public class quickSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 원소개수
		int m = sc.nextInt(); //파티션수
		String a = sc.next(); //오름,내림차순
		
		String[] qquick = new String[n];
		for(int i=0;i<n;i++) {
			qquick[i] = sc.next();
		}
	}
}
