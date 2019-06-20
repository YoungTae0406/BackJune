package BJ_06;
import java.util.*;
public class BJ_06 {//https://www.acmicpc.net/problem/1065
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ary = new int[3];
		int[] num = {100, 10, 1};
		int count=99;
		int NN = N;
		
		if(N==1000) System.out.println(144);
		if(1<=N&&N<=99) System.out.println(N);
		if(100<=N&&N<=999) {
			int temp = 100;
			while(temp!=N+1) {
				int ttemp = temp;
				ary[0]=temp/100;
				temp = temp%100;
				ary[1]=temp/10;
				temp = temp%10;
				ary[2]=temp/1;
				int po = ary[1] - ary[0];
				if(po == ary[2] - ary[1]) {
					count++;
				}
				temp = ttemp;
				temp++;
			}
			System.out.println(count);
		}	
	}
}
