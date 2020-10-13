package main;

import java.util.Random;

public class Celsius implements Temperatura {
	

	public double mostrarTemperaturaCelsius() {
		return new Random().nextDouble()+1;
		
	}

}
