package br.com.ucsal.olimpiadas.Operacao;

import java.util.List;

import br.com.ucsal.olimpiadas.Questao;
import interfaces.AplicarProvaFactoryAbstract;
import interfaces.ClassesConcretas.AplicarProvaFactoryConcrete;

public class PrepararAplicacaoProva {
	private AplicarProvaFactoryAbstract factoryAplicar = new AplicarProvaFactoryConcrete();

	public ContextoAplicacaoProva preparar(Controle f) {
		if(factoryAplicar.validarParticipantes().ValidacaoIsEmpty(f))
			return null;
		if(factoryAplicar.validarProvas().ValidacaoIsEmpty(f))
			return null;
		Integer participanteId= factoryAplicar.escolherParticipante().escolherId(f);
		if(participanteId==null)
			return null;
		Integer provaId= factoryAplicar.escolherProva().escolherId(f);
		if(provaId==null)
			return null;
		List<Questao> questoesDaProva=factoryAplicar.buscarQuestoesDaProva().buscarIdList(f,provaId);
		if(questoesDaProva==null) {
			System.out.println("essa prova não possui questões");
		    return null;
		}
		return new ContextoAplicacaoProva(participanteId, provaId, questoesDaProva);

	}
}
