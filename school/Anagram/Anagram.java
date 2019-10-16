package Anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		char[] a1 = new char[s1.length()];
		char[] a2 = new char[s2.length()]; 
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if(a1.length==a2.length) {
			for(int i=0;i<s1.length();i++) {
				a1[i] = s1.charAt(i);
			}
			for(int i=0;i<s2.length();i++) {
				a2[i]  = s2.charAt(i);
			}
			Arrays.sort(a1);	Arrays.sort(a2);
			
			int count=0;
			for(int i=0;i<a1.length;i++) {
				if(a1[i]!=a2[i]) {
					count++;
				}
			}
			
			if(count>0) System.out.println("False");
			else System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
		
	}
}
