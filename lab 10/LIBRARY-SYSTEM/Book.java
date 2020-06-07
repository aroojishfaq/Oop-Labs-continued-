import java.util.Comparator;



public class Book implements Comparable<Book>
{
    // instance variables - replace the example below with your own
    private String title;
    private String author;
   
    private int numOfPages;
   
    
    

    /**
     * Empty Constructor for objects of class Book
     */
    public Book(){
        this.title = "";
        this.author = "";
        this.numOfPages=0;
    }
    
    public Book(String title, String author,int numOfPages){
        this.title = title;
        this.author = author;
        
        this.numOfPages=numOfPages;
    }
    
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
	
	public int getNumOfPages() {
		return numOfPages;
	}
	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
	
	
	
    
	
	
    public void display()
    {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Number of pages : " + this.numOfPages);
        
    }
    public static Comparator<Book> NameComparator = new Comparator<Book>() {
     public int compare(Book b1,Book b2){
        
        
        return (b1.getTitle().compareTo(b2.getTitle()));
    
        
        }};
    public static Comparator<Book> PageComparator = new Comparator<Book>() {    
        public int compare(Book b1, Book b2) {
       
        return b1.getNumOfPages() - b2.getNumOfPages();
    }};
    
   public static Comparator<Book> AuthorComparator = new Comparator<Book>() {    
     public int compare(Book b1,Book b2){
        
        
        return (b1.getAuthor().compareTo(b2.getAuthor()));
    
        
        }};
        
        
        

    }
