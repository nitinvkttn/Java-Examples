				/* Progaram to find the area of Circle */
import java.util.Scanner;

class Learn{

	public static void main(String args[]){

		//Accept the radius from user
		System.out.println("Enter the radius of Circle:");
		Scanner obj = new Scanner(System.in);
		double radius = obj.nextInt();

		//Display the output
                Double area = (double) (Math.PI * radius * radius);
		System.out.println("Area =" +area);

	}
}