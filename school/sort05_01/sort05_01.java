package sort05_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sort05_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String m = sc.next();
		
		String[] a = new String[n];
		String atemp ;
		String temp = sc.nextLine();
		atemp = sc.nextLine();
		a = atemp.split(" ");
		
		if(m.equals("A")) {
			Arrays.sort(a);
			for(int i=0;i<n;i++) {
				System.out.print(a[i]+" ");
			}
		}
		if(m.equals("D")) {
			Arrays.sort(a, Collections.reverseOrder());
			for(int i=0;i<n;i++) {
				System.out.println(a[i]+" ");
			}
		}
	}
}
