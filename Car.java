package week1.day1.Assignment2;

public class Car 
{
 public void applyBreak()
 {
	 System.out.println("applying break");
 }
 public void applyGear()
 {
	 System.out.println("applying gear");
 }
 public void switchonAc()
 {
	 System.out.println("switchichg on Air Conditioner");
 }
 public void applyAccelerate()
 {
	 System.out.println("applying Acceleration");
 }


	public static void main(String[] args) 
	{
       Car mycar=new Car();
       mycar.applyAccelerate();
       mycar.applyBreak();
       mycar.applyGear();
       mycar.switchonAc();
	}

}
