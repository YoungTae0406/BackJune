package ggcd;

import java.util.Scanner;

public class ggc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0; int b=0;
		a = sc.nextInt();
		b= sc.nextInt();
		System.out.println(ggcd(a,b));
	}
	public static int ggcd(int a, int b) {
		if(a%b==0) {
			return b;
		}
		else {
			int temp = b;
			b=a%b;
			a = temp;
			return ggcd(a, b);
		}
	}
}

