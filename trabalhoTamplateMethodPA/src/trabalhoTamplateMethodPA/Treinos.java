package trabalhoTamplateMethodPA;

public abstract class Treinos {
	
	protected void aquecendo() {
		System.out.println("10 minutos de aquecimento");
	}
	
	protected void hidratacao() {
		System.out.println("Beber agua a cada termino de uma serie");
	}
	
	protected void dropSet() {
		System.out.println("Em exercicios de 3 series");
	}
	
	protected abstract void preparoFisico();
	protected abstract void treinoFisico();
	
	public void executarTreino() {
		System.out.println("");
		
		this.preparoFisico();
		this.treinoFisico();
		this.aquecendo();
		this.hidratacao();
		this.dropSet();
		
		
		System.out.println("");
		
	}
	
	}
