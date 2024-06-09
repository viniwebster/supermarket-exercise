package aplication;

import java.util.Locale;
import java.util.Scanner;

import implemetation.Supermarket;
import implemetation.SupermarketArray;

public class Program {
	
	private final static int SIZE = 3;
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Supermarket supermarket = new SupermarketArray(SIZE);
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\nLista de Compras");
			System.out.println("1 - Inserir");
			System.out.println("2 - Listar");
			System.out.println("3 - Remover");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opção: ");
			
			opcao = sc.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.print("Digite o item a ser inserido: ");
					String item = sc.next();
					supermarket.add(item);
					break;
				case 2:
					supermarket.print();
					break;
				case 3:
					System.out.print("Digite a posição do item a ser excluido: ");
					int index = sc.nextInt();
					supermarket.delete(index);
					break;
				case 4: 
					System.out.println("Encerrando o programa...");
					break;
				default: 
					System.out.println("Por favor, insira uma opção valida");
			}
			
		} while(opcao != 4);
		
		sc.close();	
	}

}
