package br.com.ucsal.olimpiadas.Operacao;

import java.util.List;

import br.com.ucsal.olimpiadas.Questao;
import br.com.ucsal.olimpiadas.Resposta;
import br.com.ucsal.olimpiadas.Tentativa;

public class AplicarProva extends Acao<Tentativa> {
	private int proximaTentativaId = 1;

	@Override
	public void executar(Controle f) {

		ContextoAplicacaoProva contexto = f.getPrepararAplicacaoProva().preparar(f);

		if (contexto == null || contexto.getQuestoesDaProva().isEmpty())
			return;
		
		List<Questao> questoesDaProva = contexto.getQuestoesDaProva();
		
		

		Tentativa tentativa = f.getCriarTentativa().criar(contexto.getParticipanteId(), proximaTentativaId++,
				contexto.getProvaId());

		System.out.println("\n--- Início da Prova ---");

		for (var q : questoesDaProva) {
			System.out.println("\nQuestão #" + q.getId());
			System.out.println(q.getEnunciado());

			System.out.println("Posição inicial:");

			f.getTabuleiro().imprimirTabuleiroFen(q.getFenInicial());

			for (var alt : q.getAlternativas()) {
				System.out.println(alt);
			}

			System.out.print("Sua resposta (A–E): ");
			char marcada;
			try {
				marcada = Questao.normalizar(f.getIn().nextLine().trim().charAt(0));
			} catch (Exception e) {
				System.out.println("resposta inválida (marcando como errada)");
				marcada = 'X';
			}

			Resposta r = new Resposta();
			r.setQuestaoId(q.getId());
			r.setAlternativaMarcada(marcada);
			r.setCorreta(q.isRespostaCorreta(marcada));

			tentativa.getRespostas().add(r);
		}

		f.getTentativas().lista.add(tentativa);

		int nota = f.getCalcularNota().calcularNota(tentativa);
		System.out.println("\n--- Fim da Prova ---");
		System.out.println("Nota (acertos): " + nota + " / " + tentativa.getRespostas().size());
	}

	public int getProximaTentativaId() {
		return proximaTentativaId;
	}

}
