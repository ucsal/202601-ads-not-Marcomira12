package interfaces.ClassesConcretas;

import br.com.ucsal.olimpiadas.Operacao.Controle;
import interfaces.ValidacaoIsEmpty;

public class ValidarCadastroParticipante implements ValidacaoIsEmpty {

	@Override
	public boolean validacaoIsEmpty(Controle f) {
		return f.getCadastrar().getLista().isEmpty();
	}

}
