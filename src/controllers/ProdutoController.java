package controllers;

import java.util.Scanner;
import entities.Produto;
import enums.CategoriaProduto;
import helpers.ProdutoHelper;
import interfaces.IProdutoRepository;
import repositories.ProdutoRepositoryTxt;
import repositories.ProdutoRepositoryXml;

public class ProdutoController {

	//método para realizar o cadastro de um produto
	public void cadastrarProduto() {
		
		try {
			
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("\nCADASTRO DE PRODUTO:\n");
			
			//capturar dados do produto
			Integer idProduto = ProdutoHelper.lerIdProduto();
			String nome = ProdutoHelper.lerNome();
			Double preço = ProdutoHelper.lerPreço();
			Integer quantidade = ProdutoHelper.lerQuantidade();
			CategoriaProduto categoria = ProdutoHelper.lerCategoria();
			
			//criando um objeto da classe produto
			Produto produto = new Produto(idProduto, nome, preço, quantidade, categoria);
			
			
			System.out.println("\nSELECIONE O TIPO DE ARQUIVO PARA EXPORTAÇÃO:");
			System.out.println("Informe (1)TXT ou (2)XML:");
			Integer opcao = Integer.parseInt(scanner.nextLine());
			
			IProdutoRepository produtoRepository = null;
			
			switch(opcao) {
			case 1:
				produtoRepository = new ProdutoRepositoryTxt();
				break;
				
			case 2:
				produtoRepository = new ProdutoRepositoryXml();
				break;
			}
			
			produtoRepository.exportar(produto);
			
			System.out.println("\nDados gravados com sucesso!");			
			
		} 
		
		catch (Exception e) {
			System.out.println("\nErro ao cadastrar o produto!");
			e.printStackTrace();
		}
		
	}
	
}
