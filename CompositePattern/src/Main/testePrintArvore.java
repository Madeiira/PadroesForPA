package Main;

public class testePrintArvore {
	//OK
	    public static void main(String args[]) {
	        arvore folhaComercial = new folhaComercial();
	        arvore folhaMarketPlace = new folhaMarketPlace();
	 
	        folhaPai folhapai = new folhaPai(3, "Teste pai");
			
			
	   	 
	        folhapai.addFolha(folhaMarketPlace);
	        folhapai.addFolha(folhaComercial);
	 
	        folhapai.printArvore();
	    }
	
}
