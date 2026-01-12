import java.util.Scanner;

public class Practical_6{
	public static void main(String[] args){

	System.out.println("Enrollment No. 240390107032");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 5 digit no.: ");
	int a = sc.nextInt();
		int d1,d2,d3,d4,d5;
		int carry = 0;
	d5 = a%10;
	d4 = (a/10)%10;
	d3 = (a/100)%10;
	d2 = (a/1000)%10;
	d1 = (a/10000)%10;
	
	d5 = d5 + 1;
	if(d5==10){
		d5 = 0;
		carry = 1;
	}
	d4 = d4 + 1 + carry;
	if(d4==10){
		d4 = 0;
		carry = 1;
	}
	d3 = d3 + 1 + carry;
	if(d3==10){
		d3 = 0;
		carry = 1;
	}
	d2 = d2 + 1 + carry;
	if(d2==10){
		d2 = 0;
		carry = 1;
	}
	d1 = d1 + 1 + carry;
	if(d1==10){
		d1 = 0;
	}

	int NewNo = d1*10000 + d2*1000 + d3*100 + d4*10 + d5;	
	System.out.printf("New number after adding 1 to each digit: %d",+NewNo);

	sc.close();
}

}