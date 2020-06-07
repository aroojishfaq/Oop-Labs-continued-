
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    protected int num_seats;
    Car(String brand1,int num_seats){
    this.num_seats=num_seats;
    brand=brand1;
    }
    
    
   public String toString(){
    return "Brand of car: "+brand+"   Number of seats: "+num_seats;
    }
}
