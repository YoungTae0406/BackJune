package BJ_01;
import java.util.Scanner;

public class BJ_01 { //https://www.acmicpc.net/problem/14723
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int up=1, down=1;
		int set=1;
		int prevreturn;
		
		
		for(int i=1; ;i++) {
			if(n-sigma(i)<=set+1) {
				prevreturn = n-sigma(i);
				up = set+1;
				break;
			}
			set++;
		}
		
		for(int j=0;j<prevreturn-1;j++) {
			up--;	down++;
			
		}
		if(n==1) {
			up=1; down=1;
		}
		System.out.println(up+" "+down);
		
	
	}
	public static int sigma(int n) {
		return n*(n+1)/2;
	}
}
