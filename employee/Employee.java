
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
  private String employee_name;
  private int employee_id;
  public static int count;
  
  Employee(String employee_name,int employee_id){
    this.employee_name=employee_name;
    this. employee_id=employee_id;
    this.count++;
    }
  public String toString(){
    return "Employee name:"+employee_name+"   employee_id:"+employee_id+"      employee_count:"+count;
    }
  
}
