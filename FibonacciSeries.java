package week1.day1.Assignment3p1;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		int range=8;
		int firstNum=0;
		int secNum=1;
		
		System.out.print("Fibonacci Series of "+range+" numbers:");

	        for (int i = 1; i <= range; ++i)
	        {
	            System.out.print(firstNum+",");
	      
                int sum = firstNum + secNum;
	            firstNum = secNum;
	            secNum = sum;

	         }
	 }

}
