package trabalhoStatePattern;

public class main {

	public static void main(String[] args) {
	      contexto context = new contexto();
	      
	      stateParalasia stateParalasia = new stateParalasia();
	      stateLivre stateLivre = new stateLivre();
	      stateCura stateCura = new stateCura();

	      stateLivre.acao(context);


	      
	      System.out.println("\n"+stateParalasia.debuff());
	      stateParalasia.acao(context);

	      System.out.println("\n");
	      
	      stateCura.acao(context);
	      System.out.println(stateCura.debuff());
	      
	      System.out.println("\n"+stateLivre.debuff());
	      stateLivre.acao(context);
	
	      System.out.println("\nUsando Package \n");

	      Package pkg = new Package("Jogador Um");
	      
	      pkg.printStatus();
	    
	      pkg.previousState();
	      System.out.println("\n");

	      pkg.printStatus();
	      pkg.previousState();
	     
	      System.out.println("\n");

	      pkg.printStatus();
	      

	      pkg.previousState();
	
	
	}
	
	
	

}
