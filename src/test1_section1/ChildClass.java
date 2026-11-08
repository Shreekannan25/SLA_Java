package test1_section1;

public class ChildClass extends ParentClass {
	@Override
	void display() {
		System.out.println("This is child class");
		System.out.println("this is Over-riding method");
	}
	
	public static void main(String[]args) {
		ChildClass childClass = new ChildClass();
		ParentClass parentClass = new ParentClass();
		parentClass.display();
		childClass.display();
	}
}
