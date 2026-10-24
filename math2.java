import java.util.Scanner;
public class math2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double circumference;
        double area;
        double volume;
        double radius;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius , 2); //radius to the power 2
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3); //radius to the power 3

        System.out.printf("The circumference is: %.1fcm\n ", circumference);
        System.out.printf("The area is: %.1fcm^2\n ", area);
        System.out.printf("The volume is: %.1fcm^3\n ", volume);
        /*the f means format. 1 before the f means one decimal place 
        a comma is used istead of "+" else,
        there will be an error.
        \n moves every line of text to a new line. */
        
        scanner.close();
    }
}
