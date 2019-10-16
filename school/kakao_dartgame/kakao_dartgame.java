package kakao_dartgame;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class kakao_dartgame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String[] d1 = s1.split("[0-9]+"); //S, D, T, *, #
		String[] d2 = s1.split("\\D+"); // 1 ~ 9
		
		int[] score = new int[3]; // 점수
		int[] digit = new int[d2.length];
		int i=0;
		for(String digittemp: d2) {
			digit[i] = Integer.parseInt(digittemp); //d2의 숫자를 digit에 옮김
			i++;
		}
		for(int j=0;j<d2.length;j++) {
			if(d1[j+1].contains("S")) {
				score[j] = digit[j];
			}
			else if(d1[j+1].contains("D")) {
				score[j] = digit[j]*digit[j];
			}
			else if(d1[j+1].contains("T")) {
				score[j] = digit[j]*digit[j]*digit[j];
			}
			//*, #
		}
		for(int j=0;j<d2.length;j++) {
			if(d1[j+1].length() >= 2) {
				if(d1[j+1].contains("#")) {
					score[j] = score[j]*-1;
					
				}
				else if(d1[j+1].contains("*")) {
					if(j == d2.length-1) {
						score[j] = score[j] * 2;
					}
					else {
						score[j] = score[j] *2;
						score[j+1] = score[j+1]*2;
					}
				}
			}
		}
		int totalscore = 0;
		for(int k=0;k<score.length;k++) {
			totalscore += score[k];
		}
		System.out.println(totalscore);
		
	}
}
