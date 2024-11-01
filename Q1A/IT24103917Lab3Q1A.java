import java.util.Scanner;
public class IT24103917Lab3Q1A {
    public static void main(String[]
args) {
       Scanner scanner = new Scanner(System.in);
	   //prompt user for the price of 1 Kg of rice
	   System.out.print("Enter the price of 1 Kg of rice:");
	   double pricePerKg = scanner.nextDouble();
	   //prompt user for the number of killograms they want to buy
	   System.out.print("Enter the number of kilograms you want to buy:");
	   double kilograms = scanner.nextDouble();
	   //Calculate total cost 
	   double totalCost = pricePerKg*kilograms;
	   //Display the total cost system.out.printf("The total amount you have to pay is: %.2f\n", totalCost);
	  	  System.out.println("");
		  System.out.print("The total amount is:" + totalCost);
		  scanner.close();
	  
	   }
}
	 
	   