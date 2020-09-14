package Main;

import java.util.ArrayList;
import java.util.List;

public  class folhaPai implements arvore {
	//OK
	    private Integer id;
	    private String name;
	 
	    private List<arvore> folhasFilhas;
	 
	    public folhaPai(Integer id, String name) {
	        this.id = id;
	        this.name = name;
	        this.folhasFilhas = new ArrayList<>();
	    }
	 
	    public void printArvore() {
	    	folhasFilhas.forEach(arvore::printArvore);
	    }
	 
	    public void addFolha(arvore Arvore) {
	    	folhasFilhas.add(Arvore);
	    }
	 
	    public void removeFolha(arvore Arvore) {
	    	folhasFilhas.remove(Arvore);
	    }


	    
	    
		
	}

