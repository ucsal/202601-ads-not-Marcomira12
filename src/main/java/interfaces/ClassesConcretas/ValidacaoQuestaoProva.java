package interfaces.ClassesConcretas;

import br.com.ucsal.olimpiadas.Operacao.Controle;
import interfaces.ValidacaoIsEmpty;

public class ValidacaoQuestaoProva implements ValidacaoIsEmpty {

	@Override
	public boolean ValidacaoIsEmpty(Controle f) {
		
		return f.getCadastraProva().getLista().isEmpty();
	}

}
