
/**
 * Write a description of class EmployeeManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeManager
{
  public static void main(String args[]){
      System.out.println("EMployee_count is: "+Employee.count);
    Employee e1=new Employee("Arooj",1);
    Employee e2=new Employee("zehra",2);
    Employee e3=new Employee("Ali",3);
    System.out.println("Employees are:");
    System.out.println(e1);
    System.out.println(e2);
    System.out.println(e3);
    }
}
