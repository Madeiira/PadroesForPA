package trabalhoPadraoObserver;

public class main {
	public static void main(String[] args) {
	      Subject subject = new Subject();

	      new googleEarthObserver(subject);

	      System.out.println("Primeiro status da distancia entre as montanhas");	
	      subject.setState(5);
	      System.out.println("Segundo status da distancia entre as montanhas");	
	      subject.setState(10);
	   }
}
