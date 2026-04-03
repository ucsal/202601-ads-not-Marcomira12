package criarObjetos;

import br.com.ucsal.olimpiadas.Questao;
import br.com.ucsal.olimpiadas.Resposta;

public class CriarResposta {
	 public Resposta criar(Questao questao, char marcada) {
	        Resposta resposta = new Resposta();
	        resposta.setQuestaoId(questao.getId());
	        resposta.setAlternativaMarcada(marcada);
	        resposta.setCorreta(questao.isRespostaCorreta(marcada));
	        return resposta;
	    }
}
