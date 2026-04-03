package interfaces;

import java.util.List;

import br.com.ucsal.olimpiadas.Operacao.Factory;

public interface BuscarIdList<T> {
	List<T> buscarIdList(Factory f);
}
