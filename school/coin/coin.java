package coin;

import java.util.Arrays;
import java.util.Scanner;

public class coin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] coins = new int[number];
		for(int i=0;i<coins.length;i++) {
			coins[i] = sc.nextInt();
		}
		int retgap = sc.nextInt();
		int count=number;		
		for(int i=0;i<coins.length;i++) {
			if(coins[i]>=retgap) {
				count--;
				coins[i] = 0;
			}
		}
		int[] realcoin = new int[count];
		count=0;
		for(int i=0;i<coins.length;i++) {
			if(coins[i]!=0) {
				realcoin[count] = coins[i];
				count++;
			}
		}
		Arrays.sort(realcoin);
		System.out.println(mini(realcoin, count-1, retgap));
	}
	public static int mini(int[] realcoin, int a, int retgap) {
		if(retgap%realcoin[a]==0) {
			return retgap/realcoin[a];
		}
		else {
			int x=0;	int temp;
			temp = retgap;
			retgap = retgap%realcoin[a];
			x = mini(realcoin, a-1, retgap);
			
			return x = temp/realcoin[a] + x;
		}
	}
	
}
