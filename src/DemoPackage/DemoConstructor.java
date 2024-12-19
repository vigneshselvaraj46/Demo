package DemoPackage;

public class DemoConstructor {


	    private String title;
	    private String author;

	    // Parameterized constructor
	    public DemoConstructor(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    // Constructor chaining using 'this()'
	    public DemoConstructor(String title) {
	        this(title, "Unknown Author");
	    }
	    
	    
	    public static void main(String[] args)
	    {
	    	
	    	DemoConstructor DC= new DemoConstructor("vignesh");
	    	System.out.println(DC.author+" " +DC.title );
	    	
	    }
}
