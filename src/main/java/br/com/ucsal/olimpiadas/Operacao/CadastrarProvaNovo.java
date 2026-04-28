package br.com.ucsal.olimpiadas.Operacao;

import java.util.Scanner;

import br.com.ucsal.olimpiadas.Prova;

public class CadastrarProvaNovo implements Execucao {
	private Scanner in;
	private Repository<Prova> cadastroProva;
	
	public CadastrarProvaNovo(Scanner in, Repository<Prova> cadastroProva) {
		this.in = in;
		this.cadastroProva = cadastroProva;
	}



	@Override
	public void executarAcao() {
		System.out.print("Título da prova: ");
		String titulo = in.nextLine();

		if (titulo == null || titulo.isBlank()) {
			System.out.println("título inválido");
			return;
		}
		Prova prova= new Prova();
		prova.setTitulo(titulo);

		cadastroProva.salvar(prova);
		System.out.println("Prova criada: " + cadastroProva.listar().size());

	}

}
