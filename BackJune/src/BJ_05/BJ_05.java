package BJ_05;
import java.util.*;
public class BJ_05 {
	public static void main(String[] args) {//https://www.acmicpc.net/problem/2309
		int[] nine = new int[9];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<9;i++) {
			nine[i] = sc.nextInt();
		}
		int sum=0;
		root:
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(i==j) continue;
				sum = getsum(nine, i, j);
				if(sum==100) {
					getary(nine, i, j);
					break root;
				}
			}
		}

	}
	public static int getsum(int[] ary ,int a, int b) {
		int sum=0;
		for(int i=0;i<9;i++) {
			if(i==a||i==b) {
				continue;
			}
			sum+=ary[i];
		}
		return sum;
	}
	public static void getary(int[] ary, int a, int b) {
		int[] alright = new int[7];
		int j=0;
		for(int i=0;i<9;i++) {
			if(i==a||i==b) continue;
			alright[j] = ary[i];
			j++;
		}
		Arrays.sort(alright);
		for(int i=0;i<7;i++) {
			System.out.println(alright[i]);
		}
	}
}
