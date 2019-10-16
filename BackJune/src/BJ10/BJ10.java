package BJ10;

import java.util.Arrays;
import java.util.Scanner;

public class BJ10 {//https://www.acmicpc.net/problem/2578
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] binggo = new int[5][5];
		int[] simpan = new int[25];
		boolean[][] call = new boolean[5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				binggo[i][j] = sc.nextInt();
			}
		}
		forout :
		for(int i=0;i<25;i++) {
			simpan[i] = sc.nextInt();
			for(int k=0;k<5;k++) {
				for(int p=0;p<5;p++) {
					if(simpan[i] == binggo[k][p]) {
						call[k][p] = true;
						if(checkbinggo(call)) {
							System.out.println(i+1);
							break forout;
						}
					}
				}
			}
		}
		
	}
	public static boolean checkbinggo(boolean[][] call) {
		boolean check = false;
		int count=0;
		for(int i=0;i<5;i++) {//가로
			check = call[i][0];
			for(int j=0;j<5;j++) {
				if(call[i][j]&&check) {
					check = call[i][j];
					if(j==4) count++;
				}
				else break;
			}
		}
		for(int i=0;i<5;i++) {//세로
			check=call[0][i];
			for(int j=0;j<5;j++) {
				if(call[j][i]&&check) {
					check = call[j][i];
					if(j==4) count++;
				}
				else break;
			}
		}
		if(call[0][0]&&call[1][1]&&call[2][2]&&call[3][3]&&call[4][4]) {
			count++;
		}
		if(call[4][0]&&call[3][1]&&call[2][2]&&call[1][3]&&call[0][4]) {
			count++;
		}
		if(count>=3) return true;
		else return false;
	}
}
