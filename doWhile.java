import java.util.Scanner;
public class doWhile {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int number = 0;
         do{
            System.out.print("Enter number between 1 - 10: "); // block of codes
            number = keyboard.nextInt();
         }
         while(number < 1 || number > 10); // || means "OR"
         System.out.println("You picked " + number);

         keyboard.close();

    }
    
}
 /* the dowhile executes the block of code
 before checking if the condition is true the condition
 the dowhile loop will be executed at least once even 
 if the condition is false this is because it executes the 
 code before checking the condition. The print statement repeats itself 
 until the you enter a value 
 which makes the condition true.  */