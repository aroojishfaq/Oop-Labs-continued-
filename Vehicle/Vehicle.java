
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
   protected String licenseplate;
   protected String brand;
   public String toString(){
    return "license plate number is:"+licenseplate;
    }
   public void setLicensePlate(String license){
    this.licenseplate=license;
    }
    
}
