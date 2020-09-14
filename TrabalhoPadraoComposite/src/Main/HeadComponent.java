package Main;

import java.util.ArrayList;
import java.util.List;

public  class HeadComponent implements arvores {
	//OK
	    private Integer id;
	    private String name;
	 
	    private List<arvores> folhasFilhas;
	 
	    public HeadComponent(Integer id, String name) {
	        this.id = id;
	        this.name = name;
	        this.folhasFilhas = new ArrayList<>();
	    }
	 
	    public void printArvore() {
	    	folhasFilhas.forEach(arvores::printArvore);
	    }
	 
	    public void addFolha(arvores Arvore) {
	    	folhasFilhas.add(Arvore);
	    }
	 
	    public void removeFolha(arvores Arvore) {
	    	folhasFilhas.remove(Arvore);
	    }


	    
	    
		
	}

