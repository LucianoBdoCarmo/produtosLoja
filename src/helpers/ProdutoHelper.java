package helpers;

import java.util.Scanner;

import enums.CategoriaProduto;

public class ProdutoHelper {

	//método para ler o id do produto
	public static Integer lerIdProduto( ) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o id do produto....:");
		return Integer.parseInt(scanner.nextLine());
	}
	
	//método para ler o nome do produto
	public static String lerNome() throws Exception {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o nome......:");
		return scanner.nextLine();		
	}
	
	//método para ler o preço do produto
	public static Double lerPreço() throws Exception {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o preço......:");
		return Double.parseDouble(scanner.nextLine());
		
	}
	
	//método para ler a quantidade do produto
	public static Integer lerQuantidade() throws Exception {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade......:");
		return Integer.parseInt(scanner.nextLine());
		
	}
	
	//método para ler a categoria do produto
	public static CategoriaProduto lerCategoria() throws Exception {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("(1) Informática");
		System.out.println("(2) Eletrônicos");
		System.out.println("(3) Games");
		System.out.println("(4) Outros");
		
		System.out.println("Entre com a categoria......:");
		Integer categoria = Integer.parseInt(scanner.nextLine());
		
		switch (categoria) {
		case 1: return CategoriaProduto.INFORMÁTICA;
		case 2: return CategoriaProduto.ELETRÔNICOS;
		case 3: return CategoriaProduto.GAMES;
		case 4: return CategoriaProduto.OUTROS;
		default: return null; // vazio
		}
			
	}
 	
}
