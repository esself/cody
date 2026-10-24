import java.util.Scanner;
public class weight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mass of the object in kilograms: ");
        double mass = scanner.nextDouble();
        double weight = mass * 9.81;
        

        if (weight > 1000) {
            System.out.println("The object is too heavy.");
        } else {
            System.out.println("The weight of the object is: " + weight + " Newtons");
        }
        if (weight < 10) {
            System.out.println("The oblect is too light.");
        }else {
            System.out.println("The weight of the object is: " + weight + " Newtons");
        }

        scanner.close();
    }

      
    }
    

