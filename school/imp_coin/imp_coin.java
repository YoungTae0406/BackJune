package imp_coin;
import java.util.Arrays;
import java.util.Scanner;
public class imp_coin {
	public static int[] coins;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		coins = new int[number];
		for(int i=0;i<coins.length;i++) {
			coins[i] = sc.nextInt();
		}
		int retgap = sc.nextInt();
		Arrays.sort(coins);
		
		int temp = retgap/coins[4];
		retgap = retgap - temp/2*coins[4]; //temp/2 더해주기
		int ttemp = mini(coins.length-1, retgap);
		System.out.println(temp/2 + ttemp);
		
	}
	public static int mini(int a, int retgap) {
		if(a==0) {
			if(retgap==0)
				return 0;
			else
				return 21478888;
		}
		int minimum = 21478888;
		
		for(int i=0;i<=retgap/coins[a]; i++) {
			minimum = Math.min(minimum, i+mini(a-1, retgap-coins[a]*i));
		}
		return minimum;
	}
}
