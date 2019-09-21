package superman;

import java.util.Scanner;

public class supermanjump {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int m = sc.nextInt(); 
		System.out.println(jump(n,m));
		
	}
	public static int jump(int n, int m) {
		if(n==0) {
			return 1;
		}
		else {
			int x = 0;
			for(int i=1;i<=m;i++) {
				if(n-i<0) break;
				x = x + jump(n-i,m);
			}
			return x;
		}
	}
}
