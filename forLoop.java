public class forLoop {
    public static void main(String[] args) {
       for(int i = 0; i < 10; i++) { // for loop executes some code for a certain amount of times
         if (i == 5) {
           continue; // stops the loop when x = 5 
         } // continue will skip x = 5  and execute the rest of the code
   
      System.out.println(i);
      } 
   }
}