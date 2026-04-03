package interfaces.ClassesConcretas;

import java.util.List;

import br.com.ucsal.olimpiadas.Questao;
import br.com.ucsal.olimpiadas.Operacao.Controle;
import interfaces.BuscarIdListQuestao;

public class BuscarIdQuestoesProva implements BuscarIdListQuestao<Questao> {

	@Override
	public List<Questao> buscarIdList(Controle f,Integer id) {
		Integer provaId= id;
		return f.getCadastrarQuestao().getLista().stream().filter(q -> q.getProvaId() == provaId).toList();
	}

}
