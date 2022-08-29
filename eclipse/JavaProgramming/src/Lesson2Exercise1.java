import java.util.Scanner;

public class Lesson2Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Height: ");
		
		double t = myObj.nextDouble();  // Read user input
		double h = 100-4.9*t*2;
		
		System.out.println("Enter a time less than 4.5 seconds: " + t);
		System.out.println("The height of the object is: " + h + " meters");
	}

}
