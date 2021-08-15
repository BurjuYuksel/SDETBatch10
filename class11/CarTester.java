package class11;

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1=new Car();
		
		car1.make="Mercedes";
		car1.model="S550";
		car1.color="Black";
		car1.year=2021;
		
		System.out.println (" I have " +car1.make );
		car1.moveBackward ();
		
	
		Car car2 = new Car();
		
		car2.make="Tesla";
		car2.model="S";
		car2.color="Red";
		car2.year = 2020;
		
		car2.moveForward();
		
	}

}
