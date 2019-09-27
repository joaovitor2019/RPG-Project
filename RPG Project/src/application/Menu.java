package application;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// Menu Base - Exemplo ~ Protótipo

		Scanner input = new Scanner(System.in);

		boolean sair = false;
		boolean voltar = true;
		String opcao, opcaoCondicional;

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
				System.out.println("SINOPSE: \nX\n");
				System.out.println(
						"Desenvolvido e projetado por: \n - Caio Vinicius \n - João Vitor \n - Paulo Costa \n - Renan Scarpato");
				System.out.println("\nTodos os direitos reservados. ©");
				System.out.println("Voltar? (s/n)");
				opcaoCondicional = input.next();
				
				if (opcaoCondicional.equalsIgnoreCase("n")) {
					voltar = false;
					break;
				} else {
					voltar = true;
				}
			}

		} while (!sair || !voltar);

		input.close();
	}
}
