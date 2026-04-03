package interfaces.ClassesConcretas;

import br.com.ucsal.olimpiadas.Operacao.Factory;
import interfaces.ValidacaoIsEmpty;

public class ValidacaoQuestaoProva implements ValidacaoIsEmpty {

	@Override
	public boolean ValidacaoIsEmpty(Factory f) {
		
		return f.getBuscarIdQuestoesProva().buscarIdList(f).isEmpty();
	}

}
