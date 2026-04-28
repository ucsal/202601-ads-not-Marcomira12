package br.com.ucsal.olimpiadas.Operacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.ucsal.olimpiadas.Participante;

public class RepositorioParticipante implements Repository<Participante> {
	
	private Map<Integer, Participante> lista = new HashMap<>();
	private int proximoId = 0;
	@Override
	public void salvar(Participante p) {
		p.setId(proximoId++);
		lista.put(proximoId++, p);
		
	}

	@Override
	public Participante buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return lista.get(id);
	}

	@Override
	public List<Participante> listar() {
		return new ArrayList<>(lista.values());
	}

}
