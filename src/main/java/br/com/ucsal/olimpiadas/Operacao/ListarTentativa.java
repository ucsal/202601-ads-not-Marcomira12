package br.com.ucsal.olimpiadas.Operacao;

import br.com.ucsal.olimpiadas.Tentativa;

public class ListarTentativa extends Acao<Tentativa> {

	@Override
	public void executar(Controle f) {
		System.out.println("\n--- Tentativas ---");
		for (var t : lista) {
			System.out.printf("#%d | participante=%d | prova=%d | nota=%d/%d%n", t.getId(), t.getParticipanteId(),
					t.getProvaId(), f.getCalcularNota().calcularNota(t), t.getRespostas().size());
		}

	}

}
