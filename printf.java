public class printf {
    public static void main(String[] args) {
        // printf is used to format  output
        // %f[flags][width][.precision][specifier-character]


        //[Spcifier-character] can either be string,int,double etc it has letter to identify each of them.
        String name = "Freda";
        int age = 18;
        double height = 157.48;
        char firstLetter = 'F';
        boolean isStudent = true;
        //[.precision] this decides how many decimal points you want to show whether .1 or .2

        System.out.printf("My name is %s\n", name); //%s for string and \n for a new line
        System.out.printf("I am %d years\n", age); //%d for int
        System.out.printf("I am %.1f tall\n", height); //%f for double .1 means 1 decimal point.
        System.out.printf("My name starts with an %c\n",firstLetter); //%c for char
        System.out.printf("Student: %b\n", isStudent); //%b for boolean

        /*It can also be;
        System.out.print("My name is %s, name. I am %d years old, age") */
    


    }
}
