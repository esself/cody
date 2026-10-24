import java.util.Random;
public class RandomExample {
    public static void main(String[] args){
        Random random = new Random();
        int number;
        double number1;
        boolean isTails;
        // generate a random int from 1 to 5
        number = random.nextInt(5) + 1; //
        System.out.println(number);

        number1 = random.nextDouble();
        System.out.println(number1);

        isTails = random.nextBoolean();
        if(isTails){
            System.out.println("Heads");
        }else{
            System.out.println("Tails");
        }
    }
}

// how to use the random statement. 
