import java.util.Scanner;
public class scanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();
        if(name.isEmpty()){
            System.out.println("You did not enter a name!");
        }else{
            System.out.println("Hello " + name );
        }
        
    
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        if(age < 0){
            System.out.println("You are not born yet!");
        }else if(age == 0){
            System.out.println("You are a baby!");
        }else if(age >= 18){
            System.out.println("You are legal!");
        }else{
            System.out.println("You are not legal!");
        }
        scanner.close();
    }
}

        
        
    



    

        
        
    
      
    

