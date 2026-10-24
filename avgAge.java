public class avgAge {
    public static void main(String[]args){
        int[] ages = {20, 18, 22, 32, 43, 26, 87, 90};
        float avg, sum = 0;
        int length = ages.length; // shows the length og the array
        for (int age : ages) {
            sum += age;
        }
        avg = sum / length;
        System.out.println("The average age is " + avg);
        System.out.println("The length of ages is " + length);
        }
    }
// this program calculates the average age of a group og people.