package br.com.ucsal.olimpiadas.OperacaoInterna;

import java.util.Scanner;

import br.com.ucsal.olimpiadas.Prova;
import br.com.ucsal.olimpiadas.Operacao.Repository;

public class EscolherProvaNovo implements EscolherObjetos {
	private Repository<Prova> provaCadastrada;
	private Scanner in;

	

	public EscolherProvaNovo(Repository<Prova> provaCadastrada, Scanner in) {
		super();
		this.provaCadastrada = provaCadastrada;
		this.in = in;
	}



	@Override
	public Integer escolher() {
		System.out.println("\nProvas:");

		for (Prova prova : provaCadastrada.listar()) {
		    System.out.println("ID: " + prova.getId());
		    System.out.println("Prova: " + prova);
		}

		System.out.print("Escolha o id da prova: ");

		try {
			Integer id = Integer.parseInt(in.nextLine());
			boolean existe = provaCadastrada.buscarPorId(id) !=null;
			if (!existe) {
				System.out.println("id inválido");
				return null;
			}
			return id;
		} catch (Exception e) {
			System.out.println("entrada inválida");
			return null;
		}
	}

}
