package BJ_03;
import java.util.Scanner;
public class BJ_03 { //https://www.acmicpc.net/problem/14720
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int[] milk = new int[N];
			int eatMax =0;	boolean cont = false;
			int younghakeat = -1;	int index=0;
			for(int i=0;i<milk.length;i++) {
				milk[i] = sc.nextInt();
			}
			
			for(int i=0;i<milk.length;i++) {
				if(milk[i]==0) {
					younghakeat = 0;
					eatMax++;
					index = i;	cont = true;
					break;
				}
			}
			if(cont) {
				for(int i=index;i<milk.length;i++) {
					if(younghakeat==0) {
						if(milk[i]==1) {
							eatMax++;
							younghakeat = 1;
							continue;
						}
					}
					if(younghakeat==1) {
						if(milk[i]==2) {
							eatMax++;
							younghakeat = 2;
							continue;
						}
					}
					if(younghakeat==2) {
						if(milk[i]==0) {
							eatMax++;
							younghakeat = 0;
							continue;
						}
					}
				}
			}
			System.out.println(eatMax);
			
		}
	}