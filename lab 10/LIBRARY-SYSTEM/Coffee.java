
/**
 * Write a description of class Coffee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Coffee implements Cafe
{  int spoons;
    boolean milk=false;
    public void addMilk(){       
    System.out.println("Milk has been added to your Coffee");
    }
    public void addSugar(){
        Scanner s=new Scanner(System.in);
        int spoons=s.nextInt();
        this.spoons=spoons;
    System.out.println(spoons+" spoons of Sugar has been added in your Coffee");
    }
    public void addWater(){
    System.out.println("Water has been added to your Coffee");
    }
    public void make(){
        if(milk){
    addMilk();
}
    addSugar();
    addWater();
    System.out.println("Your Coffee is ready");
    
    }
    

}
