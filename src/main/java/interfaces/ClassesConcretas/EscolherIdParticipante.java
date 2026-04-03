package interfaces.ClassesConcretas;

import br.com.ucsal.olimpiadas.Operacao.Factory;
import interfaces.VerificarId;

public class EscolherIdParticipante implements VerificarId {

	@Override
	public Integer escolherId(Factory f) {
		return f.getEscolherParticipante().escolherParticipante(f);
	}

}
