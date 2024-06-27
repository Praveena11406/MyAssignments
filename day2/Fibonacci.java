package week1.day2;

public class Fibonacci {
	public static void main(String[]arg) {
		int n=8,firstNum=0,secondNum=1;
		System.out.println("fibonacci series range"+n+"range:");
		for(int i=1;i<=n;i++)
		{
			System.out.println(firstNum+",");
			int num=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=num;
		}
	}

}
