import java.util.Scanner;

public class conversion {
// this is a void method with arguments
    public static void showKilometers( double meters){
        double kilometers = meters* 0.001;
        System.out.println(meters + "meters in kilometers is: " + kilometers);
    }
    public static void showInches(double meters){
        double inches = meters * 39.37;
        System.out.println(meters + "meters is: " + inches); 
    }
    public static void showFeet(double meters){
        double feet = meters * 3.281;
        System.out.println(meters + "meters is: " + feet);
    } // void method without arguments
    public static void menu(){
        System.out.println("1. Convert to Kilometers.");
        System.out.println("2. Convert to inches.");
        System.out.println("3. Convert to feet.");
        System.out.println("4. Quit program.");
    }
    void main(){
        Scanner scanner = new Scanner(System.in);
        double meters;
        do{
            System.out.println("Enter a distance in meters: ");
            meters = scanner.nextDouble();
        
            if(meters < 0){
            System.out.println("Do not enter a negative value");
        }
    }while(meters < 0);
    int choice;
    do{
        menu();
        System.out.println("Enter a distance in meters: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showKilometers(meters);
                break;
            case 2:
                showInches(meters);
                break;
            case 3:
                showFeet(meters);
                break;
            case 4:
                System.out.println("Program ended.");
                break;
            default:
                System.out.println("Error! Select again.");
                break;
        }
        System.out.println();
    }while(choice != 4);

          scanner.close();
        
        
    
    
    }
}   