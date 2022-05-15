package week1.day1.Assignment3p1;

public class ArmstrongNumber 
{

	public static void main(String[] args) 
	{
		int input = 153;
		int original,remainder,calculated=0;
		original = input;
		// (1*1*1) + (5*5*5) + (3*3*3) = 153
		
		while(input>0) 
		{
			remainder = input%10;
			calculated = calculated + (remainder*remainder*remainder);
			input = input/10;
		}
		if(original==calculated) 
		{
			System.out.println(original+" is a Armstrong number.");
		} else 
		{
			System.out.println(original+" is Not an Armstrong number.");
		}

	}

}
