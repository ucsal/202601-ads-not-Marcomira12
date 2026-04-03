package interfaces.ClassesConcretas;

import br.com.ucsal.olimpiadas.Questao;
import interfaces.BuscarIdList;
import interfaces.AplicarProvaFactoryAbstract;
import interfaces.ValidacaoIsEmpty;
import interfaces.VerificarId;

public class AplicarProvaFactoryConcrete implements AplicarProvaFactoryAbstract{

	@Override
	public ValidacaoIsEmpty validarParticipantes() {
		// TODO Auto-generated method stub
		return new ValidarCadastroParticipante();
	}

	@Override
	public ValidacaoIsEmpty validarProvas() {
		// TODO Auto-generated method stub
		return new ValidacaoQuestaoProva();
	}

	@Override
	public VerificarId escolherParticipante() {
		// TODO Auto-generated method stub
		return new EscolherIdParticipante();
	}

	@Override
	public VerificarId escolherProva() {
		// TODO Auto-generated method stub
		return new EscolherProvaId();
	}

	@Override
	public BuscarIdList<Questao> buscarQuestoesDaProva() {
		// TODO Auto-generated method stub
		return new BuscarIdQuestoesProva();
	}


}
