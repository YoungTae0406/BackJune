package BJ12;

import java.util.Arrays;
import java.util.Scanner;

public class BJ12 { //https://www.acmicpc.net/problem/10815
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N; int M;
		N=sc.nextInt();
		int[] sang = new int[N];
		for(int i=0;i<N;i++) {
			sang[i] = sc.nextInt();
		}
		M=sc.nextInt();
		int[] find = new int[M];
		for(int i=0;i<M;i++) {
			find[i] = sc.nextInt();
		}
		int[] answer = new int[M];
		Arrays.sort(sang);
		
		for(int i=0;i<M;i++) {
			int left=0; int right = sang.length-1;
			while(left<=right) {
				int mid=(right+left)/2;
				if(sang[mid]<find[i]) {
					left = mid+1;
				}
				else if(sang[mid]>find[i]) {
					right = mid-1;
				}
				else {
					answer[i]++;
					break;
				}
			}
		}
		for(int i=0;i<M;i++) {
			System.out.print(answer[i]+" ");
		}	
	}
}
