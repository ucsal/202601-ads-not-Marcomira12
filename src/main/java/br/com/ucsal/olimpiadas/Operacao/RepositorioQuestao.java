package br.com.ucsal.olimpiadas.Operacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.ucsal.olimpiadas.Questao;

public class RepositorioQuestao implements Repository<Questao> {
	private Map<Integer, Questao> lista = new HashMap<>();
	private int proximoId = 0;
    @Override
    public void salvar(Questao questao) {
    	questao.setId(proximoId++);
        lista.put(questao.getId(), questao);
    }


    @Override
    public List<Questao> listar() {
        return new ArrayList<>(lista.values());
    }

	@Override
	public Questao buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return lista.get(id);
	}

}
