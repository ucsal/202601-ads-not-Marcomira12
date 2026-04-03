package interfaces.ClassesConcretas;

import br.com.ucsal.olimpiadas.Operacao.Factory;
import interfaces.ValidacaoIsEmpty;

public class ValidarCadastroParticipante implements ValidacaoIsEmpty {

	@Override
	public boolean ValidacaoIsEmpty(Factory f) {
		return f.getCadastrar().getLista().isEmpty();
	}

}
