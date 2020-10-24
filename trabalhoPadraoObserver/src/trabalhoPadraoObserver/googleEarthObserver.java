package trabalhoPadraoObserver;

public class googleEarthObserver extends Observer {

	
	public googleEarthObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
	
	
	
	
	@Override
	   public void update() {
		System.out.println( "Distância: " + Integer.toOctalString( subject.getState()  )+"cm" ); 
	   }
	   
}
