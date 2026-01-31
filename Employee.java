import java.util.Scanner;
class Employee
{
       private String employeeName;
       private double employeeSalary;

public void readEmployeeData()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name:");
	employeeName = sc.next();
	System.out.println("Enter your salary");
	employeeSalary = sc.nextDouble();
}
public void displayEmployeeData(){
	System.out.println("EmployeeName:"+employeeName);
	System.out.println("EmployeeSalary:"+employeeSalary);	
}
public static void main(String []args){
	System.out.println("Enrollment No. 240390107032");
	Employee Em1 = new Employee();	
	Em1.readEmployeeData();
	Em1.displayEmployeeData();
}

}