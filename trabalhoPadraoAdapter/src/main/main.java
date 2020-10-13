package main;

public class main {
	

	public static void main(String[] args) {

		Fairenheit fai = new Fairenheit();

		Temperatura temperaturaTarget = new transformarTemperatura(fai);
		//temperaturaTarget.mostrarTemperaturaCelsius();
		
		System.out.print(temperaturaTarget.mostrarTemperaturaCelsius());
		System.out.println("");
		System.out.print(temperaturaTarget.mostrarTemperaturaCelsius());
	}

}
