public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee(String name, int idNumber, String department, String position){
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position; 
    }
    public  Employee(String name, int idNumber){
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";

    }
    public Employee (){
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }
    //Mutator methods Mutator modifies data
    public void setName(String name){
        this.name = name;
    }
    public void setidNumber(int idNumber){
        this.idNumber = idNumber;
    }
    public void setdepartment(String department){
        this.department = department; 
    }
    public void setposition(String position){
        this.position = position;
    }
    // Accessor methods Accessor retrieves data
    public String getName(){
        return name;
    }
    public int getidNumber(){
        return idNumber;
    }
    public String getdepartment(){
        return department;
    }
    public String getposition(){
        return position;
    }
}
    /* A programm consiting of constructors
    This program assigns values to each employee
    It's reference is mainEmployee.java
    Everything done here is properly 
    displayed in mainEmployee.java */
