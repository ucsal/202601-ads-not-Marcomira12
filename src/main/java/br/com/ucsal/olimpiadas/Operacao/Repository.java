package br.com.ucsal.olimpiadas.Operacao;

import java.util.List;

public interface Repository<T> {
	void salvar(T questao);
    T buscarPorId(Integer id);
    List<T> listar();

}
