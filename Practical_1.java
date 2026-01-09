import java.util.Scanner;

public class Practical_1{
	public static void main(String[] args){
		
		System.out.println("Anrollment No. 240390107032");
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Distance:");
		double Distance = sc.nextDouble();
		double Feet = Distance * 3.228084;
		System.out.printf("Distance to Feet conversion : %.2f",Feet);		
	sc.close();
	
}

}