public class mainEmployee {
    public static void main(String[] args){

        Employee emp1 = new Employee("Susan Mayers", 47899,"Accounting", "Vice president");
        Employee emp2 = new Employee("Mark Jones", 39119, "IT","Programmer");
        Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        System.out.println("Employee 1: ");
        displayEmployee(emp1);

        System.out.println("Employee 2: ");
        displayEmployee(emp2);

        System.out.println("Employee 3: ");
        displayEmployee(emp3);
    }

    public static void displayEmployee(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("idNumber: " + emp.getidNumber());
        System.out.println("Department: " + emp.getdepartment());
        System.out.println("Position: " + emp.getposition());

        
    }
    
}
