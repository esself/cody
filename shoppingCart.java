import java.util.Scanner;
public class shoppingCart {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to purchase? ");
        item = input.nextLine();

        System.out.println("What is the price of the item you would like to purchase?: ");
        price = input.nextDouble();
        
        System.out.println("How many items would you like to purchase?: ");
        quantity = input.nextInt();

        total = price * quantity;
        System.out.println("You have bought " + quantity + " " + item + "(s)");
        System.out.println("The total is " + currency + total);

       input.close();
    }
    
}
