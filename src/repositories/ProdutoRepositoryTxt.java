package repositories;


import java.io.PrintWriter;
import entities.Produto;
import interfaces.IProdutoRepository;

public class ProdutoRepositoryTxt implements IProdutoRepository{

	@Override
	public void exportar(Produto produto) throws Exception {
		
		//definindo o nome do arquivo que será gravado
		String path = "c:\\temp\\produto_" + produto.getIdProduto() + ".txt";
		
		//criando o arquivo em modo de escrita
		PrintWriter printWriter = new PrintWriter(path);
		
		//escrevendo o conteúdo do arquivo
		printWriter.write("\nId do produto...:" + produto.getIdProduto());
		printWriter.write("\nNome............:" + produto.getNome());
		printWriter.write("\nPreço...........:" + produto.getPreço());
		printWriter.write("\nQuantidade......:" + produto.getQuantidade());
		printWriter.write("\nCategoria.......:" + produto.getCategoria());
		
		//salvando e fechando o arquivo
		printWriter.flush();
		printWriter.close();		
		
	}
	
	

}
