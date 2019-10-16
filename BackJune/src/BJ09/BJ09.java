package BJ09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BJ09 {
	public static void main(String[] args) {
		int A,B,C;
		Scanner sc = new Scanner(System.in);
		List list1 = new ArrayList();
		int zerocount=0;	int[] count = new int[10];
		A = sc.nextInt();	B = sc.nextInt();	C = sc.nextInt();
		int multip = A*B*C;
		while(multip/1!=0) {
			int temp = multip % 10;
			if(temp==0) zerocount++;
			multip = multip / 10;
			list1.add(temp);
		}
		Iterator iterator = list1.iterator();
		while(iterator.hasNext()) {
			int tempp = (int)iterator.next();
			count[tempp]++;
		}
		System.out.println(zerocount);
		for(int i=1;i<10;i++) {
			System.out.println(count[i]);
		}
	}
}
