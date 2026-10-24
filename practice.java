import java.util.Scanner;
public class practice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.println("Enter the total number to find the average");
        n = scanner.nextInt();

        //array
        int[] numbers = new int[n];
        int sum = 0;
        System.out.println("Enter the " + n + " numbers: ");

        for(int i = 0; i < n; i++){
            numbers[1] = scanner.nextInt();
            sum += numbers[1];

        }
        double average = (double) sum / n;
        System.out.println(average);

        scanner.close();
    }
    




    
}
