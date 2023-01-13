package repositories;

import java.io.PrintWriter;

import entities.Produto;
import interfaces.IProdutoRepository;

public class ProdutoRepositoryXml implements IProdutoRepository {

	@Override
	public void exportar(Produto produto) throws Exception {
		
		StringBuilder xml = new StringBuilder();
		
		xml.append("<?xml version='1.0' encoding='ISO-8859-1'?>");
		
		xml.append("<produto>");
			
			xml.append("<idProduto>");
			xml.append(produto.getIdProduto());
			xml.append("</idProduto>");
			
			xml.append("<nome>");
			xml.append(produto.getNome());
			xml.append("</nome>");
			
			xml.append("<preço>");
			xml.append(produto.getPreço());
			xml.append("</preço>");
			
			xml.append("<quantidade>");
			xml.append(produto.getQuantidade());
			xml.append("</quantidade>");
			
			xml.append("<categoria>");
			xml.append(produto.getCategoria());
			xml.append("</categoria>");
			
		xml.append("</produto>");
		
		String path = "c:\\temp\\produto_" + produto.getIdProduto() + ".xml";
		
		PrintWriter printWriter = new PrintWriter(path);
		printWriter.write(xml.toString());
		printWriter.flush();
		printWriter.close();
		
	}
	
}
