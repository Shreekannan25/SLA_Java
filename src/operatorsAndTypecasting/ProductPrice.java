package operatorsAndTypecasting;

public class ProductPrice {
	 public static void main(String[] args) {

	        double price = 999.50;
	        int quantity = 3;
	        double discount = 10;

	        double total = price * quantity;

	        double discountAmount = total * (discount / 100);

	        total -= discountAmount;

	        System.out.println("Product Price = " + price);
	        System.out.println("Quantity = " + quantity);
	        System.out.println("Discount = " + discount + "%");
	        System.out.println("Final Price = " + total);
	    }

}
