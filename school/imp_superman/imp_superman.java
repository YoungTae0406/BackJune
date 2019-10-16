package imp_superman;

import java.util.Scanner;
import java.math.BigInteger;

public class imp_superman {
	static BigInteger[] known = new BigInteger[1000];
	static BigInteger bi;	static BigInteger x;
	static BigInteger one = new BigInteger("1");
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int m = sc.nextInt();
		System.out.println(jump(n,m));
		
	}
	public static BigInteger jump(int n, int m) {
		bi = new BigInteger("0");
		if(known[n]!=null) {
			return known[n];
		}
		else if(n==0) {
			return one;
		}
		else {
			x = new BigInteger("0");
			x = BigInteger.ZERO;
			for(int i=1;i<=m;i++) {
				if(n-i<0) break;
			
				x = x.add(jump(n-i,m));				
			}
			known[n] = x;
			return x;
		}
	}	
}
	
