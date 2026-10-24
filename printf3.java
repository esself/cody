public class printf3 {
    public static void main(String[] args) {
        //[width] for aligning 
        int Id1 = 1;
        int Id2 = 23;
        int Id3 = 456;
        int Id4 = 7890;

        System.out.printf("%04f\n", Id1); // arranges then to be inline with id4
        System.out.printf("%04f\n", Id2);
        System.out.printf("%04f\n", Id3);// - for left alignment  
        System.out.printf("%04f\n", Id4);// + for right alignment
        // doesn't run try on intellij 
   
        
    }
    
}
