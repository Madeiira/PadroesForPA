package trabalhoStatePattern;

public class stateCura implements state {

	   public void acao(contexto context) {
	      System.out.println("Jogador est� sendo curado");
	      context.setState(this);	
	   }

	   public String debuff(){
	      return "Debuff foi retirado";
	   }
}