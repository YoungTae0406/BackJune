package BJ11;

import java.util.Arrays;
import java.util.Scanner;

public class BJ11 { //https://www.acmicpc.net/problem/1920
	public static void main(String[] args) {
		int N, M;	Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[] A = new int[N];
		
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}	
		M = sc.nextInt();
		int[] find = new int[M];
		int[] answer = new int[M];
		for(int i=0;i<M;i++) {
			find[i] = sc.nextInt();
		}
		Arrays.sort(A);
		for(int i=0;i<M;i++) {
			int left=0;	int right=A.length-1; int mid = (left+right)/2;
			while(left<=right) {
				mid = (left+right)/2;
				if(A[mid]<find[i]) {
					left = mid+1;
				}
				else if(A[mid]>find[i]) {
					right = mid-1;
				}
				else {
					answer[i]++;
					break;
				}
			}
		}
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}
}
