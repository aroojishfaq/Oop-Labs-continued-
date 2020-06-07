
/**
 * Write a description of class Tea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Tea implements Cafe
{ int spoons;
    boolean milk=false;
    public void addMilk(){       
    System.out.println("Milk has been added to your tea");
    }
    public void addSugar(){
        Scanner s=new Scanner(System.in);
        int spoons=s.nextInt();
        this.spoons=spoons;
    System.out.println(spoons+" spoons of Sugar has been added in your tea");
    }
    public void addWater(){
    System.out.println("Water has been added to your tea");
    }
    public void make(){
        if(milk){
    addMilk();
}
    addSugar();
    addWater();
    System.out.println("Your Tea is ready");
    
    }
    
}
