package test1section3;

public class Manager  extends Employee {
String emprole;
	
	
	Manager(int employeeId,String empname,String emprole){
		super(employeeId,empname);
		this.emprole = "Manager";
	}
	
	public void displayDetails() {
		System.out.println("Employee Name:"+empname);
		System.out.println("Employee ID:"+employeeId);
		System.out.println("Employee Role:"+this.emprole);
	}
}
