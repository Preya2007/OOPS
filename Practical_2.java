import java.util.Scanner;

public class Practical_2{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the value of a:");
	double a = sc.nextDouble();
	System.out.println("Enter the value of b:");
	double b = sc.nextDouble();
	System.out.println("Enter the value of c:");
	double c = sc.nextDouble();	
	System.out.println("Enter the value of d:");
	double d = sc.nextDouble();
	System.out.println("Enter the value of e:");
	double e = sc.nextDouble();
	System.out.println("Enter the value of f:");
	double f = sc.nextDouble();
	
	double D = a*d-b*c;
	double Dx = e*d-b*f;
	double Dy=a*f-c*e;

	if(D==0){
		
		System.out.print("No unique solution exists .");
	}else{
		double x =Dx / D;
		double y =Dy / D;
		
		System.out.printf("value of x:%.2f",x);
		System.out.printf("value of y:%.2f",y);
	}
	
				
	sc.close();
	
}


}
