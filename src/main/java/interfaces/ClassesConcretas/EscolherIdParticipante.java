package interfaces.ClassesConcretas;

import br.com.ucsal.olimpiadas.Operacao.Controle;
import interfaces.VerificarId;

public class EscolherIdParticipante implements VerificarId {

	@Override
	public Integer escolherId(Controle f) {
		return f.getEscolherParticipante().escolherParticipante(f);
	}

}
