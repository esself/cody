import java.util.Scanner;

public class romanNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 10: ");
        int number = scanner.nextInt();
        String romanNumeral = "";

        if (number == 1) {
            romanNumeral = "I";
        } else if (number == 2) {
            romanNumeral = "II";
        } else if (number == 3) {
            romanNumeral = "III";
        } else if (number == 4) {
            romanNumeral = "IV";
        } else if (number == 5) {
            romanNumeral = "V";
        } else if (number == 6) {
            romanNumeral = "VI";
        } else if (number == 7) {
            romanNumeral = "VII";
        } else if (number == 8) {
            romanNumeral = "VIII";
        } else if (number == 9) {
            romanNumeral = "IX";
        } else if (number == 10) {
            romanNumeral = "X";
        } else {
            System.out.println("Invalid number. Please enter a number from 1 to 10.");
            scanner.close();
            return;
        
        }

        System.out.println("The Roman numeral for " + number + " is: " + romanNumeral);
        scanner.close();
    }
}

