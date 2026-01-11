import java.util.Scanner;

public class Practical_5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int amount =787;

		System.out.printf("Number of 100's note: %d \n",amount / 100);
		amount = amount%100;
		System.out.printf("Number of 50's note: %d \n",amount/50);
		amount = amount%50;
		System.out.printf("Number of 10's note: %d \n",amount/10);
		amount = amount%10;
		System.out.printf("Number of 5's note: %d \n",amount/5);
		amount = amount%5;
		System.out.printf("Number of 2's note: %d \n",amount/2);
		amount = amount%2;
		System.out.printf("Number of 1's note: %d \n",amount);

		sc.close();
	}
}

