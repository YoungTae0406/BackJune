package BJ_04;
import java.util.Scanner;
public class BJ_04 { //https://www.acmicpc.net/problem/14724
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] candidate = new int[9][N];
		int max=0;	int number=-1;

		for(int i=0;i<9;i++) {
			for(int j=0;j<N;j++) {
				candidate[i][j] = sc.nextInt();
				max = Math.max(max, candidate[i][j]);
				
			}
		}
		
		label: for(int i=0;i<9;i++) {
			for(int j=0;j<N;j++) {
				number++;
				if(candidate[i][j]==max) {
					number = number/N;
					break label; //최상위 for문 탈출
				}
			}
		}
		switch(number) {
		case 0:
			System.out.println("PROBRAIN");
			break;
		case 1:
			System.out.println("GROW");
			break;
		case 2:
			System.out.println("ARGOS");
			break;
		case 3:
			System.out.println("ADMIN");
			break;
		case 4:
			System.out.println("ANT");
			break;
		case 5:
			System.out.println("MOTION");
			break;
		case 6:
			System.out.println("SPG");
			break;
		case 7:
			System.out.println("COMON");
			break;
		case 8:
			System.out.println("ALMIGHTY");
			break;
		
		}
	}
}


