package binarySearch;

public class binarySearch {
	public static void main(String[] args) {
		int[] presort =  {10, 39, 45, 65, 88, 90 , 102};
		
		int start = 0;
		int end = presort.length-1;
		int mid = (start+end)/2;
		int x = 90;
		int count=0;
		
		while(start<=end) {
			if(presort[mid]==x) {
				count++;
				System.out.println(mid);
				break;
			}
			else if(presort[mid]>=x) {
				count++;
				end = mid-1; //mid가 다시 포함될 필요가 없으니
				mid = (start+end)/2;
			}
			else {
				count++;
				start = mid+1;
				mid = (start+end)/2;
			}
		}
		System.out.println(count);
			
		System.out.println(binaryRecursiveSearch(presort, 90, start, end));;
	
	}
	public static int binaryRecursiveSearch(int[] ary, int x ,int start, int end) {
		int mid = (start+end)/2;
		if(start>end)	return -1;
		
		if(ary[mid]==x) {
			return mid;
		}
		else if(ary[mid]>x) {
			return binaryRecursiveSearch(ary, x, start, mid-1);
		}
		else {
			return binaryRecursiveSearch(ary, x, mid+1, end);
		}

	}

}
