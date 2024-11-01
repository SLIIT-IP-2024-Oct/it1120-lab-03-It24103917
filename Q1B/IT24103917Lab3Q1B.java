import java.util.Scanner;
public class IT24103917Lab3Q1B {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
	   //prompt user for the price of 1 Kg of rice
	   System.out.print("Enter the price of 1 Kg of rice:");
	   double pricePerKg = scanner.nextDouble();
	   //prompt user for the number of killograms they want to buy
	   System.out.print("Enter the number of kilograms you want to buy:");
	   double kilograms = scanner.nextDouble();
	   //Calculate total cost 
	   double totalCost = pricePerKg*kilograms;
	   //Apply a 10% discount 
	   double discount = 0.10*totalCost;
	   System.out.print("The discount is:"+ discount);
	   double finalAmount = totalCost-discount;
	   //Display the total cost system.out.printf("The total amount you have to pay after a 10%% discount is: %.2f\n",finalAmount);
	  	  System.out.println("");
		  System.out.print("The total amount is:" + finalAmount);
		  scanner.close();
	  
	   }
}
	 
	   
	 
	   
