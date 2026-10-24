import java.util.Scanner;

public class romanNumber2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] romanNumerals = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        System.out.print("Enter a number between 1 and 10: ");
        int number = input.nextInt();

        if (number < 1 || number > 10) {
            System.out.println("Error! Please enter a number from 1 to 10");
        }else{
            System.out.println("The Roman number " + number + " is:" + " " + romanNumerals[number-1] );
            input.close();
        }
    }
}
