package trabalhoStatePattern;

public class stateParalasia implements state {

	   public void acao(contexto context) {
	      System.out.println("Jogador est� imobilizado(Com debuff)");
	      context.setState(this);	
	   }

	   public String debuff(){
	      return "Veneno de paralisia ";
	   }
	}
