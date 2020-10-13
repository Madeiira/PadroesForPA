package main;

public class transformarTemperatura implements Temperatura  {

	private Fairenheit fairenheit;
	
	public  transformarTemperatura(Fairenheit fairenheit) {
		this.fairenheit = fairenheit;
	}

	public double mostrarTemperaturaCelsius() {
		return fairenheit.getTemperaturaFairenheit();
		
	}
}
