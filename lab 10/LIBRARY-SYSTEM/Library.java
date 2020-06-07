import java.util.*;
import java.util.Arrays;
// Required by the Comparator function
import static java.util.Comparator.comparing;

public class Library
{
    
        
   public void Sorting(){
    Book b1= new Book("C++ programming","hasan ali",600);
    Book b2= new Book("C++ programming","hasan ali",200);
    Book b3= new Book("Abstract programming","hasan ali",700);
    Book b4= new Book("Abstract programming","Fatima Nadeem",700);
    Book b5= new Book("Java programming","raza khan",600);
    Book b6= new Book("Python programming","raza khan",900);
    Book[] myBooks = new Book[6];
    myBooks[0]=b1;
    myBooks[1]=b2;
    myBooks[2]=b3;
    myBooks[3]=b4;
    myBooks[4]=b5;
    myBooks[5]=b6;
    System.out.println("UNSORTED ARRAY ");
    for(int i =0; i<myBooks.length; i++){
        System.out.println("\n ");
    myBooks[i].display();
    }
   // NameComparator NC = new NameComparator();
    Arrays.sort(myBooks,Book.NameComparator);
    System.out.println("TITLE BASED SORTING ");
    for(int i =0; i<myBooks.length; i++){
        System.out.println("\n ");
    myBooks[i].display();
    }
    Arrays.sort(myBooks,Book.AuthorComparator);
     System.out.println("AUTHOR BASED SORTING ");
    for(int i =0; i<myBooks.length; i++){
        System.out.println("\n ");
    myBooks[i].display();
    }
    Arrays.sort(myBooks,Book.PageComparator);
     System.out.println("PAGE BASED SORTING ");
    for(int i =0; i<myBooks.length; i++){
        System.out.println("\n ");
    myBooks[i].display();
    }
    System.out.println("SORTED ARRAY ");
    for(int i =0; i<myBooks.length; i++){
        System.out.println("\n ");
    myBooks[i].display();
    }
}
    
    public static void main(String args[]){
    Library L1 = new Library();
    L1.Sorting();
    }
}
    