package BJ_02;
import java.util.*;
public class BJ_02 { //https://www.acmicpc.net/problem/14719
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int H, W;//h는 세로, w는 가로
			H= sc.nextInt();	W=sc.nextInt();
			
			int[] Wnumber = new int[W];
			for(int i=0;i<W;i++) {
				Wnumber[i] = sc.nextInt();
			} // 입력
			System.out.println(quantity(Wnumber));

		}
		
		public static int quantity(int[] number) {
			int max1=0, max2=0, small=0, temp=-1;
			boolean end=false;
			int index0=0, index1=0;
			int sum=0;
			while(true) {
			for(int i=index0;i<number.length;i++) {
				if(number[i]>max1) {
					max1 = number[i];
					index0 = i;
					break; 
				}
			}
			for(int i=index0+1;i<number.length;i++) {
				if(number[i]>=max1) {
					end=false;
					max2 = number[i];
					index1 = i;
					break;
				}
				else end=true;
			}
			if(end) {
				temp = most(number, index0+1, number.length);
				for(int i=index0+1;i<number.length;i++) {
					if(temp==number[i]) {
						max2 = number[i];
						index1 = i;
						break;
					}
				}
				
			}
			small = max1 > max2 ? max2 : max1;
			for(int i=index0+1;i<index1;i++) {
				sum+=(small - number[i]);
				 // 확인 나중에 지우셈
			}
			index0 = index1;
			max1 =0;
			if(index1==number.length-1) break;
			}
			return sum;
		}
		public static int most(int[] array,int a, int b) {
			int temp=0;
			for(int i=a;i<b;i++) {
				if(array[i]>=temp) {
					temp = temp > array[i] ? temp : array[i];
				}
			}
			return temp;
		}
	}

