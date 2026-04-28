package br.com.ucsal.olimpiadas.Operacao;

import java.util.Scanner;

import br.com.ucsal.olimpiadas.Participante;

public class CadastrarParticipanteNovo implements Execucao{
	
	private Scanner in;
	private Repository<Participante> cadastroParticipante;

	public CadastrarParticipanteNovo(Scanner in, Repository<Participante> cadastroParticipante) {
		super();
		this.in = in;
		this.cadastroParticipante = cadastroParticipante;
	}


	@Override
	public void executarAcao() {
		System.out.print("Nome: ");
		String nome = in.nextLine();

		System.out.print("Email (opcional): ");
		String email = in.nextLine();

		if (nome == null || nome.isBlank()) {
			System.out.println("nome inválido");
			return;
		}
		Participante p= new Participante();
		p.setNome(nome);
		p.setEmail(email);
		cadastroParticipante.salvar(p);

		System.out.println("Participante cadastrado: " + p);
	}


	
	
	 
	
	
	

}
