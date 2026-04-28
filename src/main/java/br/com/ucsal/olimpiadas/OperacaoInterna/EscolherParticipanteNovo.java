package br.com.ucsal.olimpiadas.OperacaoInterna;

import java.util.Map.Entry;
import java.util.Scanner;

import br.com.ucsal.olimpiadas.Participante;
import br.com.ucsal.olimpiadas.Operacao.Repository;

public class EscolherParticipanteNovo implements EscolherObjetos{
	private Scanner in;
	private Repository<Participante> participanteCadastrado;


	public EscolherParticipanteNovo(Scanner in, Repository<Participante> participanteCadastrado) {
		this.in = in;
		this.participanteCadastrado = participanteCadastrado;
	}





	@Override
	public Integer escolher() {
		System.out.println("\nParticipantes:");
		
		for (Participante p: participanteCadastrado.listar()) {
			String nome = p.getNome();
			Integer id = p.getId();

			System.out.println("ID: " + id);
			System.out.println("Participante: " + nome);
		}
		
		System.out.print("Escolha o id do participante: ");

		try {

		    Integer id = Integer.parseInt(in.nextLine());

			boolean existe = participanteCadastrado.buscarPorId(id)!=null;
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
