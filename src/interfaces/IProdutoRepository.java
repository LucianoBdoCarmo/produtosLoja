package interfaces;

import entities.Produto;

public interface IProdutoRepository {
	
	//m�todos abstratos
	void exportar(Produto produto) throws Exception;

}
