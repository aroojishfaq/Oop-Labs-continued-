
/**
 * Write a description of class Truck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Truck extends Vehicle
{
    protected int num_wheels;
   Truck(int num_wheels){
    this.num_wheels=num_wheels;
    }
    
    
   public String toString(){
    return "Number of wheels: "+num_wheels;
    }
}

