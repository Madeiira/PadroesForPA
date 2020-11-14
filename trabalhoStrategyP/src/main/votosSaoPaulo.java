package main;

import java.math.BigDecimal;

public class votosSaoPaulo implements IApurarVotos {
    

	@Override
	public BigDecimal aplicarApuracao(BigDecimal Apuracao) {
		// TODO Auto-generated method stub
        return Apuracao.multiply(BigDecimal.valueOf(1));
	}
	


	@Override
	public String aplicarCandidato(String Candidato) {
		// TODO Auto-generated method stub
		return "Candidato De São paulo:"+Candidato;
	}
}

