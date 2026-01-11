import java.util.Scanner;

public class Practical_4{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnrollment No.: 240390107032");
		System.out.println("Enter Your Weigth In Pounds: ");
		double w = sc.nextDouble();
		
		System.out.println("Enter Your Height in Inches: ");
		double h = sc.nextDouble();
		
		double kg= w * 0.45359237;
		System.out.println("Your Weight in Kilograms: "+ kg+ " kgs.");
		
		double meter= h * 0.0254;
		System.out.println("Your Height in Meters: "+ meter+ " meter.");
		
		double bmi = kg / (meter * meter);
		System.out.println("Your BMI : "+ bmi);
		
		sc.close();
		
	}

}