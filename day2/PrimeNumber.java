package week1.day2;

public class PrimeNumber {
	public static void main(String[]arg) {

	int i=20;	
	int n;
	boolean x=false;
		for(n=2;n<=i/2;++n) {
		if(i%n==20)
		{
		x=false;
		break; 
		}
		}
		if (!x)
	      	System.out.println(i+" is prime number");
		else
			System.out.println(i+" is not prime number");
	 
	}
	}



