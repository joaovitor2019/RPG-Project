package application;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// Menu Base - Exemplo ~ Protótipo

		Scanner input = new Scanner(System.in);

		boolean sair = false;
		boolean voltar = true;
		String opcao, opcaoCondicional;
		String sinopse = "SINOPSE: \n( - A ser preenchido )\n\nDesenvolvido e projetado por: \n - Caio Vinicius \n - João Vitor \n - Paulo Costa \n - Renan Scarpato \n\nTodos os direitos reservados. ©";

		do {
			System.out.println("┌────────────────────────────┐\n" + "│  ╔═══╗ Bem-vindo! Welcome! │▒\n"
					+ "│  ╚═╦═╝ MENU (Nome do jogo) │▒\n" + "╞═╤══╩══╤════════════════════╡▒\n"
					+ "│ ├──┬──┤   1. Jogar         │▒\n" + "│ └──┴──┘   2. Opções        │▒\n"
					+ "│           3. Sobre	     │▒\n" + "│           4. Sair          │▒\n"
					+ "└────────────────────────────┘");
			System.out.println("\nDigite uma opção: ");
			opcao = input.next();

			if (opcao.contentEquals("4") || opcao.equalsIgnoreCase("sair")) {
				System.out.println("Você saiu.");
				sair = true;
			}
			
			if (opcao.contentEquals("3") || opcao.equalsIgnoreCase("sobre")) {
				
				System.out.println(sinopse);
				System.out.println("Voltar? (s/n)");
				opcaoCondicional = input.next();
				
				
					
					while (opcaoCondicional.equalsIgnoreCase("n")) {
						
					System.out.println(sinopse);
					System.out.println("Voltar? (s/n)");
					opcaoCondicional = input.next();
					
					
					};
					
				 if (opcaoCondicional.equalsIgnoreCase("s")) {
					voltar = true;
				}
				else {
					System.out.println("Opção inválida!! \n");
					return;
				}
			}

		} while (!sair || !voltar);

		input.close();
	}
}
