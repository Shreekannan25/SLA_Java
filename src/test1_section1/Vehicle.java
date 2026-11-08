package test1_section1;

public class Vehicle {
	String modelName;
	double price;
	
	Vehicle(String modelName , double price){
		this.modelName=modelName;
		this.price = price;
	}
	
	void displayCarInfo() {
		System.out.println("Model Name:"+this.modelName);
		System.out.println("Price:"+this.price);
	}
}
