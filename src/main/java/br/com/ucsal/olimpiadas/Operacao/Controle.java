package br.com.ucsal.olimpiadas.Operacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.com.ucsal.olimpiadas.OperacaoInterna.*;
import criarObjetos.CriarTentativa;
import interfaces.ClassesConcretas.BuscarIdQuestoesProva;
import interfaces.ClassesConcretas.EscolherProvaId;

public class Controle {
	private Scanner in = new Scanner(System.in);
	private CadastrarParticipante cadastrar = new CadastrarParticipante();
	private CadastrarProva cadastraProva = new CadastrarProva();
	private CadastrarQuestao cadastrarQuestao = new CadastrarQuestao();
	private EscolherProva escolherProva = new EscolherProva();
	private AplicarProva aplicarProva = new AplicarProva();
	private ListarTentativa tentativas = new ListarTentativa();
	private Seed seed = new Seed();
	private CalcularNota calcularNota = new CalcularNota();
	private EscolherParticipante escolherParticipante = new EscolherParticipante();
	private ImprimirTabuleiroFen tabuleiro = new ImprimirTabuleiroFen();
	private EscolherProvaId escolherProvaId = new EscolherProvaId();
	private BuscarIdQuestoesProva buscarIdQuestoesProva = new BuscarIdQuestoesProva();
	private PrepararAplicacaoProva prepararAplicacaoProva = new PrepararAplicacaoProva();
	private CriarTentativa criarTentativa = new CriarTentativa();

	private static final List<Acao> lista = new ArrayList<>();

	public Controle() {
		if (lista.isEmpty()) {
			lista.add(cadastrar);
			lista.add(cadastraProva);
			lista.add(cadastrarQuestao);
			lista.add(aplicarProva);
			lista.add(tentativas);
		}
	}

	public EscolherProvaId getEscolherProvaId() {
		return escolherProvaId;
	}

	public BuscarIdQuestoesProva getBuscarIdQuestoesProva() {
		return buscarIdQuestoesProva;
	}

	public PrepararAplicacaoProva getPrepararAplicacaoProva() {
		return prepararAplicacaoProva;
	}

	public CriarTentativa getCriarTentativa() {
		return criarTentativa;
	}

	public static List<Acao> getLista() {
		return Collections.unmodifiableList(lista);
	}

	public ImprimirTabuleiroFen getTabuleiro() {
		return tabuleiro;
	}

	public EscolherParticipante getEscolherParticipante() {
		return escolherParticipante;
	}

	public CalcularNota getCalcularNota() {
		return calcularNota;
	}

	public Scanner getIn() {
		return in;
	}

	public CadastrarParticipante getCadastrar() {
		return cadastrar;
	}

	public CadastrarProva getCadastraProva() {
		return cadastraProva;
	}

	public CadastrarQuestao getCadastrarQuestao() {
		return cadastrarQuestao;
	}

	public EscolherProva getEscolherProva() {
		return escolherProva;
	}

	public AplicarProva getAplicarProva() {
		return aplicarProva;
	}

	public ListarTentativa getTentativas() {
		return tentativas;
	}

	public Seed getSeed() {
		return seed;
	}

}