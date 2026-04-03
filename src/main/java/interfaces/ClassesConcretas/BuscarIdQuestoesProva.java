package interfaces.ClassesConcretas;

import java.util.List;

import br.com.ucsal.olimpiadas.Questao;
import br.com.ucsal.olimpiadas.Operacao.Factory;
import interfaces.BuscarIdList;

public class BuscarIdQuestoesProva implements BuscarIdList<Questao> {

	@Override
	public List<Questao> buscarIdList(Factory f) {

		Integer provaId= f.getEscolherProvaId().escolherId(f);
		return f.getCadastrarQuestao().getLista().stream().filter(q -> q.getProvaId() == provaId).toList();
	}

}
