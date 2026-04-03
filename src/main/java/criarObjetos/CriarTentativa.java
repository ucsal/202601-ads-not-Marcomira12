package criarObjetos;

import br.com.ucsal.olimpiadas.Tentativa;

public class CriarTentativa {
	 public Tentativa criar(Integer id, Integer participanteId, Integer provaId) {
	        Tentativa tentativa = new Tentativa();
	        tentativa.setId(id);
	        tentativa.setParticipanteId(participanteId);
	        tentativa.setProvaId(provaId);
	        return tentativa;
	    }
}
