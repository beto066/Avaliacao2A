package prova_A2;

import java.util.List;

public interface CRUD<T> {

	public void incluir();
	public void alterar();
	public void excluir(List<T> lista);
	public void imprimirTudo(List<T> lista);
	public void imprimirOrdenado(List<T> lista);
	public void imprimirFiltro(List<T> lista, Object filtro);
	
}
