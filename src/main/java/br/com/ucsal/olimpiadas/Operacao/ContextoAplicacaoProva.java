package br.com.ucsal.olimpiadas.Operacao;

import java.util.List;

import br.com.ucsal.olimpiadas.Questao;

public class ContextoAplicacaoProva {
	private Integer participanteId;
    private Integer provaId;
    private List<Questao> questoesDaProva;

    public ContextoAplicacaoProva(Integer participanteId, Integer provaId, List<Questao> questoesDaProva) {
        this.participanteId = participanteId;
        this.provaId = provaId;
        this.questoesDaProva = questoesDaProva;
    }

    public Integer getParticipanteId() {
        return participanteId;
    }

    public Integer getProvaId() {
        return provaId;
    }

    public List<Questao> getQuestoesDaProva() {
        return questoesDaProva;
    }
}
