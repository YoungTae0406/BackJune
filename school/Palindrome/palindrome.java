package Palindrome;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		s1.replace(" ", "");
		s1 = s1.toLowerCase();
		StringBuffer a1 = new StringBuffer(s1);
		String temp = new String("");
		String temp3 = new String("");
		int j=0;
		int palindromecount=1;
		if(a1.length()==1) System.out.println("1");
		
		for(int i=2;i<a1.length()+1; i++) { //string 길이
			while(j+i<=a1.length()) {
				temp = a1.substring(j, j+i);
				StringBuffer temp2 = new StringBuffer(temp);
				temp2 = temp2.reverse();
				temp3 = temp2.toString();
				if(temp.equals(temp3)) {
					palindromecount=i;
				}
				j++;
			}
			j=0;
		}
		System.out.println(palindromecount); 
	}
}
