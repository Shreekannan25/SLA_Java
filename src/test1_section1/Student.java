package test1_section1;

public class Student {
	
	private String name;
	private int age;
	private double marks;
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	public void setmarks(double marks) {
		this.marks = marks;
	}
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public double getmark() {
		return marks;
	}
	
	public static void main(String [] args) {
		Student student = new Student();
		student.setname("natheem");
		student.setage(22);
		student.setmarks(567.67);
		
		System.out.println(student.getname());
		System.out.println(student.getage());
		System.out.println(student.getmark());	
	}

}
