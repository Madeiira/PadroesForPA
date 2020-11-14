package main;

import java.math.BigDecimal;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    Votos vt = new Votos(new votosSaoPaulo(), null);
	    System.out.println("Nome do candidato:");
	    String Candidato = sc.next();
	    vt.aplicarCandidato(Candidato);
	   
	    System.out.println("Total De Votos: ");
	    BigDecimal Apuracao = sc.nextBigDecimal();
	    vt.adicionarVotos(Apuracao);
	    

	    System.out.println("Candidato: " + vt.obterCandidato());
	    System.out.println("Valor de votos: " + vt.obterVotos());

	    
	}

}
