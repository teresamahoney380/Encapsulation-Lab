package lab1;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 * @version     Terry Mahoney Lab
 */
public class Startup {
    public static void main(String[] args) {
        // first new hire
        Employee newHire = new Employee();
        newHire.createEmployeeFile("Peter", "Piper", "333-1234");
        newHire.orientEmployee();
      
        System.out.println("The employee's status is: " + newHire.getStatus());
        // Second new hire
        Employee newHire2 = new Employee();
        newHire2.createEmployeeFile("Sam", "Sung", "999-1234");
        newHire2.orientEmployee();
      
        System.out.println("The employee's status is: " + newHire2.getStatus());
    }
    
    
}
