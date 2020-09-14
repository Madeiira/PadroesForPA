package Main;


	public class folhaComercial implements arvores {
		//OK
	    private Integer id;
	    private String name;
	   
	    public folhaComercial(Integer id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	  

		public void printArvore() {
	        System.out.println(getClass().getSimpleName());
	    }
	 
	    // standard constructor, getters, setters


}
