package week1.day1.Assignment1;

public class TwoWheeler 
{
 int noOfWheels=2;
 short noOfMirrors=2;
 long chassisNumber=235051200L;
 boolean isPunctured=false;
 String bikeName="Honda";
 double runningKM=1000;
 
	public static void main(String[] args) 
	{
		TwoWheeler two=new TwoWheeler();
		System.out.println(two.noOfWheels);
		System.out.println(two.noOfMirrors);
		System.out.println(two.chassisNumber);
		System.out.println(two.isPunctured);
		System.out.println(two.bikeName);
		System.out.println(two.runningKM);
	}
}
