import java.util.Scanner;
 
public class Practical_3{
	
	public static void main(String[] args){
		System.out.println("Anrollment No. 240390107032");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character:");
		char ch = sc.next().charAt(0);
		
		if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
			System.out.println("Given character is Vowel.");
		}else{
			System.out.println("Given character is Consonant.");
		}

		sc.close();
	}
}