package br.com.ucsal.olimpiadas.Operacao;

import java.util.Scanner;

import br.com.ucsal.olimpiadas.Questao;
import br.com.ucsal.olimpiadas.OperacaoInterna.EscolherObjetos;

public class CadastrarQuestaoNovo implements Execucao {
	private Scanner in;
	private RepositorioProva repositorioProva;
    private RepositorioQuestao repositorioQuestao;
	private EscolherObjetos escolher;
	
	
	
	
	
	public CadastrarQuestaoNovo(Scanner in, RepositorioProva repositorioProva, RepositorioQuestao repositorioQuestao,
			EscolherObjetos escolher) {
		this.in = in;
		this.repositorioProva = repositorioProva;
		this.repositorioQuestao = repositorioQuestao;
		this.escolher = escolher;
	}

	@Override
	public void executarAcao() {
		if (repositorioProva.listar().isEmpty()) {
			System.out.println("não há provas cadastradas");
			return;
		}

		Integer provaId = escolher.escolher();
		if (provaId == null)
			return;

		System.out.println("Enunciado:");
		String enunciado = in.nextLine();

		var alternativas = new String[5];
		for (int i = 0; i < 5; i++) {
			char letra = (char) ('A' + i);
			System.out.print("Alternativa " + letra + ": ");
			alternativas[i] = letra + ") " + in.nextLine();
		}

		System.out.print("Alternativa correta (A–E): ");
		char correta;
		try {
			correta = Questao.normalizar(in.nextLine().trim().charAt(0));
		} catch (Exception e) {
			System.out.println("alternativa inválida");
			return;
		}
		
		Questao q = new Questao();
		q.setProvaId(provaId);
		q.setEnunciado(enunciado);
		q.setAlternativas(alternativas);
		q.setAlternativaCorreta(correta);
		
		repositorioQuestao.salvar(q);
		

		System.out.println("Questão cadastrada: " + q.getId() + " (na prova " + provaId + ")");

	}

}
