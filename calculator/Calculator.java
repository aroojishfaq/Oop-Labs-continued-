
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{ 
  public int add(int x,int y){
      int sum=x+y;
  System.out.println("VAlues enterd of type int x,int y are:"+x+","+y);
  System.out.println("Sum of givn numbers is:"+sum);
  return sum;
}
 /*public double add(int x,int y){
      int sum=x+y;
  System.out.println("VAlues enterd of type int x,int y are:"+x+","+y);
  System.out.println("Sum of givn numbers is:"+sum);
  return sum;
}
*/
   public void add(int x,double y){
      double sum=x+y;
  System.out.println("VAlues enterd of type int x,double y are:"+x+","+y);
  System.out.println("Sum of givn numbers is:"+sum);
}
 public void add(double x,double y){
      double sum=x+y;
  System.out.println("VAlues enterd of type double x,double y are:"+x+","+y);
  System.out.println("Sum of givn numbers is:"+sum);
}
 public void add(double x,int y){
      double sum=x+y;
  System.out.println("VAlues enterd of type double x,int y are:"+x+","+y);
  System.out.println("Sum of givn numbers is:"+sum);
}
public void add(int x,int y,int z){
      int sum=x+y+z;
  System.out.println("VAlues enterd of type int x,int y are:"+x+","+y+","+z);
  System.out.println("Sum of givn numbers is:"+sum);
}

public void displayValue(char d){
 System.out.println("Char= "+d);
}
/*
public void displayValue(char d,int n){
 System.out.println("Char= "+d+", "+"num="+n);
}
*/
public void displayValue(int n1,int n2){
 System.out.println("num1= "+n1+", "+"num2="+n2);
}

public static void main (String args[]){
    
    Calculator c=new Calculator();
    c.add(2,7);
    c.add(1.21,3);
    c.add(2.2,3.2);
    c.add(4,3.1);
    c.add(3,8,9);
    c.displayValue('d',3);
}
}
