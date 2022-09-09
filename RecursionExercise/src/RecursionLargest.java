public class RecursionLargest {
	public static void main(String[] args) {
		int a[]  = {5,12,33,15,32,1,-8,48,29,101};
		int i = 0;
		System.out.print(findLargest(a,i));
		
	}
	public static int findLargest(int a[] , int i)
	{
		if (i > a.length-2)
			return a[i];
		else
			return Math.max(a[i], findLargest(a,i+1));

	
	}
	
}
