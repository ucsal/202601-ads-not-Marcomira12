package interfaces;

import java.util.List;

import br.com.ucsal.olimpiadas.Operacao.Controle;

public interface BuscarIdListQuestao<T> {
	
	List<T> buscarIdList(Controle f,Integer id);
}
