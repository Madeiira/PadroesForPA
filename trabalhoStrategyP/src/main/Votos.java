package main;

import java.math.BigDecimal;

public class Votos {
	  private IApurarVotos aplicarApuracao;
	  private BigDecimal votos;
	private String Candidato;
	private IApurarVotos aplicarCandidato;

	  public Votos(IApurarVotos aplicarApuracao, IApurarVotos aplicarCandidato) {
		    this.aplicarApuracao = aplicarApuracao;
		    votos = new BigDecimal(0);
		    this.aplicarCandidato = aplicarCandidato;
		  }

		  public void adicionarVotos(BigDecimal votos) {
		    this.votos = this.votos.add(votos);
		  }
		  
		  public void aplicarCandidato(String candidato) {
			    this.Candidato = candidato;
			  }

		  public BigDecimal obterVotos() {
		    return aplicarApuracao.aplicarApuracao(this.votos);
		  }
		  
		  public String obterCandidato() {
			    return Candidato;
			  }

	}

