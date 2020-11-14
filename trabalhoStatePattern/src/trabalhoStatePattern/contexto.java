package trabalhoStatePattern;

public class contexto {
	   private state state;

	   public contexto(){
	      state = null; //valor padrão
	   }

	   public void setState(state state){
	      this.state = state;		 // setar novo state
	   }

	   public state getState(){
	      return state; //retornar stado
	   }
}