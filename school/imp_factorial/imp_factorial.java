package imp_factorial;

import java.util.Scanner;
import java.math.BigInteger;

public class imp_factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long result=1;
		
		for(int i=n;i>0;i--) {
			result *=i;
		}
		System.out.println(result);
	}
}
