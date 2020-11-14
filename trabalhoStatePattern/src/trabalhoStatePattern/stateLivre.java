package trabalhoStatePattern;

public class stateLivre implements state {

	   public void acao(contexto context) {
	      System.out.println("Jogador em movimento livre");
	      context.setState(this);	
	   }

	   public String debuff(){
	      return "Jogador sem debuff";
	   }
}