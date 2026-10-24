import java.util.Scanner;
public class calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        double result = 0;
        char operator;
        boolean validOperator = true;

        System.out.println("Enter the first number: ");
        num1 = input.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, ^): ");
        operator = input.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2 = input.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    validOperator = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator.");
                validOperator = false;
            }
        }

        if (validOperator) {
            System.out.println("The result is: " + result);
        }

        input.close();
    }
}
