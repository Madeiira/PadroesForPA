package Main;

public class folhaMarketPlace implements arvores {
	  
	//OK 
	    private Integer id;
	    private String name;
	    
	    public folhaMarketPlace(Integer id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	    
	    public void printArvore() {
	        System.out.println(getClass().getSimpleName());
	    }
	 
	    // standard constructor, getters, setters
	}
