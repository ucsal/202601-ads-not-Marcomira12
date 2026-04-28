package br.com.ucsal.olimpiadas.Operacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.ucsal.olimpiadas.Prova;

public class RepositorioProva implements Repository<Prova> {
	private Map<Integer, Prova> lista = new HashMap<>();
	private int proximoId = 0;
	@Override
	public void salvar(Prova prova) {
		lista.put(proximoId++, prova);
		
	}

	@Override
	public Prova buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return lista.get(id);
	}

	@Override
	public List<Prova> listar() {
		// TODO Auto-generated method stub
		return new ArrayList<>(lista.values());
	}

}
