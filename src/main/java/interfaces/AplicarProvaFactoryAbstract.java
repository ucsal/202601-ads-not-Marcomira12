package interfaces;

import br.com.ucsal.olimpiadas.Questao;

public interface AplicarProvaFactoryAbstract {
	ValidacaoIsEmpty validarParticipantes();
    ValidacaoIsEmpty validarProvas();
    VerificarId escolherParticipante();
    VerificarId escolherProva();
    BuscarIdListQuestao<Questao> buscarQuestoesDaProva();
}	
