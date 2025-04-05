package Practice;

public class Exercise {
	    
	    private String title;
	    private String author;
	    private static int totalBooks=0;

	//Constructor to initialize book title and author

	public Exercise(String title, String author)
	{
	    this.title = title;
	    this.author = author;
	    totalBooks++;
	}

	//static method to get the total number of totalBooks
	public static int getTotalBooks()
	{
	    return totalBooks;
	}

	//Instance method to get the book's title
	public String getTitle()
	{
	    return title;
	}

	//Instance method to get the book's author
	public String getAuthor()
	{
	    return author;
	}

	public static void main (String[] args) {
	    //Creating book Objects
	    Exercise book1 = new Exercise("1984","George Orwell");
	    Exercise book2 = new Exercise("To Kill a Mockingbird","Harper Lee");
	    Exercise book3 = new Exercise("The Great Gatsby","F.Scott Fitzgerald");
	    
	    //Displaying book details
	    System.out.println("Book1: "+ book1.getTitle() +" by "+book1.getAuthor());
	    System.out.println("Book2: "+book2.getTitle()+" by "+book2.getAuthor());
	    System.out.println("Book3: "+book3.getTitle()+" by "+book3.getAuthor());
	    
	    //Displaying total number of books
	    System.out.println("Total number of books: "+Exercise.getTotalBooks());
	}
	}
