package week1.day1.Assignment3p1;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		 int num = 13;
	        boolean flag = false;
		if(num==1 || num==0)
		{
			System.out.println("It is a Prime Number");
		}
		else
		{
	        for(int i = 2; i <= num/2; ++i)
	        {
	            if(num % i == 0)
	            {
	                flag = true;
	                break;
	            }
	        }

	        if (!flag)
	            System.out.println(num + " is a prime number.");
	        else
	            System.out.println(num + " is not a prime number.");	

	}
	}
}
