package Main;

public class testePrintArvores {
	//OK
	    public static void main(String args[]) {
	        arvores folhacomercial = new folhaComercial(1,"Folha Comercial");
	        arvores folhamarketPlace = new folhaMarketPlace(2,"Folha MarketPlace");
	 
	        HeadComponent folhapai = new HeadComponent(3, "Teste pai");
			
			
	   	 
	        folhapai.addFolha(folhamarketPlace);
	        folhapai.addFolha(folhacomercial);
	 
	        folhapai.printArvore();
	    }
	
}
