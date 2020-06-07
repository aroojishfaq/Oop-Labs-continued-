
public class Main 
{
static int computeDivision(int a, int b) {
int res = 0;
try {
res = a / b;
}
catch(NumberFormatException ex) {
System.out.println("NumberFormatException is occured");
}
catch (ArithmeticException ex)
{
	System.out.println("Arithmetic Exception is occured");
}
return res;
}
// In this method found appropriate Exception handler.
// i.e. matching catch block.
public static void main(String args[]){
int a = 1;
int b = 0;
try
{
int i = computeDivision(a,b);
} // matching ArithmeticException
catch(ArithmeticException ex)
{
// getMessage will print description of exception(here / by zero)
System.out.println(ex.getMessage());
}
}

}