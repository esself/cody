public class math {
    public static void main(String[] args){
        double result;
        result = Math.pow(2, 3); // pow means power. It help calculate the power of a value.
        result= Math.round(3.14); //returns 3.14 to the nearest integer
        result = Math.floor(3.99); // rounds DOWN a value(returns a larger value less than or equal to 3.14)
        result = Math.ceil(3.14); // rounds UP a value(returns the smallest integer greater than or equal to 3.14)
        result = Math.sqrt(9); //returns the square root of 9
        result = Math.abs(-100); // returns the positive value of 100
        result = Math.max(20, 30); 
        result = Math.min(20,30);
        System.out.println(result);
    }
}
