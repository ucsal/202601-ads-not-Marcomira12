package br.com.ucsal.olimpiadas.Operacao;

import br.com.ucsal.olimpiadas.Tentativa;

public class GerarTentativa implements Instanciar{

	@Override
	public Tentativa criar(Factory f) {
		Tentativa tentativa = new Tentativa();
		tentativa.setId(f.getAplicarProva().getProximaTentativaId()+1);
		tentativa.setParticipanteId(f.getEscolherParticipante().escolherParticipante(f));
		tentativa.setProvaId(f.getEscolherProva().escolherProva(f));
		return tentativa;
	}

}
