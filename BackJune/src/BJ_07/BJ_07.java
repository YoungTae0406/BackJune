package BJ_07;
import java.util.Scanner;

public class BJ_07 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] ary = new int[100];
		int gcdsum=0;
		for(int i=0;i<t;i++) {
			gcdsum=0;
			int n = sc.nextInt();
			for(int j=0;j<n;j++) {
				ary[j] = sc.nextInt();
			}
			for(int k=0;k<n-1;k++) {
				for(int m=k+1;m<n;m++) {
					gcdsum += GCD(ary[k], ary[m]);
				}
			}
			System.out.println(gcdsum);
		}
		
		
	}
	public static int GCD(int a, int b) {
		int temp;
		while(b!=0) {
			a = a%b;
			temp = a;
			a = b;
			b = temp;
		}
		return a;
	}
}
