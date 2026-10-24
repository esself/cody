public class Main {
    public static void main(String[] args) {
        
        final double PI = 3.142;
        double r = 5.0;
        double areaOfCircle = PI * r * r;
        double volumeOfSphere = (4.0/3.0) * PI * r * r * r;
        double circumferenceOfCircle = 2 * PI * r;

        // System.out.println("Area of Circle: " + areaOfCircle);
       // System.out.println("Volume of Sphere: " + volumeOfSphere);
      //System.out.println("Circumference of Circle: " + circumferenceOfCircle);

      System.out.printf("%.2f\n", areaOfCircle);
      System.out.printf("%.2f\n", volumeOfSphere);
      System.out.printf("%.2f\n", circumferenceOfCircle);
     //this makes the values in two decimal places.

    }
    
}
