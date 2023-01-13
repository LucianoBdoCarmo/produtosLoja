package interfaces;

import entities.Produto;

public interface IProdutoRepository {
	
	//métodos abstratos
	void exportar(Produto produto) throws Exception;

}
