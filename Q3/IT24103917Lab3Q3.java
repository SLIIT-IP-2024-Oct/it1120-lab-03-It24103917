import java.util.Scanner;
      public class IT24103917Lab3Q3{

         public static void main(String[] args)
    {    
         //create and object called input to Scanner class
         Scanner input=new Scanner(System.in);
    
         System.out.println("Enter amount-");
         int amount=input.nextInt();
         
         
        int notes5000 = amount / 5000;
        amount = amount % 5000;
        int notes1000 = amount / 1000;
        amount = amount % 1000;
        int notes500 = amount / 500;
        amount = amount % 500;
        int notes200 = amount / 200;
        amount = amount % 200;
        int notes100 = amount / 100;
        amount = amount % 100;
        int notes50 = amount / 50;
        amount = amount % 50;
        int notes20 = amount / 20;
        amount = amount % 20;
        int coins10 = amount / 10;
        amount = amount % 10;
        int coins5 = amount / 5;
        amount = amount % 5;
        int coins2 = amount / 2;
        amount = amount % 2;
        int coins1 = amount / 1;

        System.out.println("5000 Notes - " + notes5000);
        System.out.println("1000 Notes - " + notes1000);
        System.out.println("500 Notes - " + notes500);
        System.out.println("200 Notes - " + notes200);
        System.out.println("100 Notes - " + notes100);
        System.out.println("50 Notes - " + notes50);
        System.out.println("20 Notes - " + notes20);
        System.out.println("10 Coins - " + coins10);
        System.out.println("5 Coins - " + coins5);
        System.out.println("2 Coins - " + coins2);
        System.out.println("1 Coins - " + coins1);
    }
}
