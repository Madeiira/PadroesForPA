package Main;

public class testePrintArvore {

	    public static void main(String args[]) {
	        arvore folhaComercial = new folhaComercial(1, " Folha Comercial ");
	        arvore folhaMarketPlace = new folhaMarketPlace(2," Folhar MarketPlace ");
	 
	        folhaPai folhapai = new folhaPai(3," Folha Pai ");
			
			
	   	 
	        folhapai.addFolha(folhaMarketPlace);
	        folhapai.addFolha(folhaComercial);
	 
	        folhapai.printFolha();
	    }
	
}
