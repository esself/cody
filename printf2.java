public class printf2 {
    public static void main(String[] args){
        double price1 = 99.99;
        double price2 = -23.5;
        double price3 = 90000.00;
        //[flags] always remember to bring the "." .
        System.out.printf("+%.2f\n",price1); // brings a positive sign infront of it
        System.out.printf("%(.2f\n", price2); //only a negative number can enclosed in a bracket to show they are negative
        System.out.printf("%,.2f\n", price3); //to show thousands
        System.out.printf("% .2f\n", price3); // brings a space infront of every positive number and a negatice sign for negative numbers.
        System.out.printf("%.2f\n", price2); // two decimal places.


      
    }

}
