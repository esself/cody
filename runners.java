import java.util.Scanner;
public class runners{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the first runner: ");
        String firstRunner = scanner.nextLine();
        System.out.println("Enter the time in minutes for " + firstRunner + ": ");
        double time1 = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.println("Enter the name of the second runner: ");
        String secondRunner = scanner.nextLine();
        System.out.println("Enter the time in minutes for " + secondRunner + ": ");
        double time2 = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.println("Enter the name of the third runner: ");
        String thirdRunner = scanner.nextLine();
        System.out.println("Enter the time in minutes for " + thirdRunner + ": ");
        double time3 = scanner.nextDouble();
        scanner.nextLine();
        
        
        System.out.println("Results:");
        System.out.println(firstRunner + ": " + time1 + " minutes");
        System.out.println(secondRunner + ": " + time2 + " minutes");
        System.out.println(thirdRunner + ": " + time3 + " minutes");
        
        scanner.close();
    }
}



