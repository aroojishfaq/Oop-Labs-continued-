
/**
 * Write a description of class CARAVAN here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CARAVAN extends Moveable implements Habitable,Serializable
{
    // instance variables - replace the example below with your own
    public  void move(int distance ){
        if(distance< 10){
    System.out.println("move");}
    else
    System.out.println("can't move");
    }
    public  boolean canMove(){
        return true;
    }
    public  boolean canFit(int i){
         
        if (i< 4 ){
            System.out.println("can fit");
    return true;}
    else
    System.out.println("can't fit");
    return false;
    //return false;
}


}
