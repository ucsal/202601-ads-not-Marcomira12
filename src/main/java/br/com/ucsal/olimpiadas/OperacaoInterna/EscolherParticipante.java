package br.com.ucsal.olimpiadas.OperacaoInterna;

import br.com.ucsal.olimpiadas.Operacao.Controle;

public class EscolherParticipante {

	public Integer escolherParticipante(Controle f) {
		System.out.println("\nParticipantes:");
		for (var p : f.getCadastrar().getLista()) {
			System.out.printf("  %d) %s%n", p.getId(), p.getNome());
		}
		System.out.print("Escolha o id do participante: ");

		try {

		    Integer id = Integer.parseInt(f.getIn().nextLine());

			boolean existe = f.getCadastrar().getLista().stream().anyMatch(p -> p.getId() == id);
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
