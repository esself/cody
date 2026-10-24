import java.util.Scanner;


public class mycity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of your favourite city: ");
        String cityName = scanner.nextLine();
        System.out.println("Number of characters: " + cityName.length());
        System.out.println("Uppercase: " + cityName.toUpperCase());
        System.out.println("Lowercase: " + cityName.toLowerCase());
        System.out.println("First character: " + cityName.charAt(0));
    
        scanner.close();
    }
}
