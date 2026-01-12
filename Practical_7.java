import java.util.Scanner;

public class Practical_7{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three side of triangle: ");
		float a = sc.nextFloat();	
		float b = sc.nextFloat();
		float c = sc.nextFloat();

	if(a+b > c || b+c > a || c+a > b){
		float s =(a+b+c)/2;
		double Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println(Area);
	}else{
		System.out.println("Invalid Triangles!!");			
	}

	sc.close();
	}

}