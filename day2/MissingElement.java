package week1.day2;

public class MissingElement {
	static int MissingNumber(int a[],int n) {
		int i,total;
		total=(n-0)+(n-10)/2;
		for(int x=0;x<n;x++)
			total=a[x];
		return total;
	}
	public static void main(String[]arg) {
		
	int a[]= {1,2,3,4,6,7,8};
	int miss=MissingNumber(a,5);
	System.out.println("the missing number is:"+miss);
	
		}
		
	}


