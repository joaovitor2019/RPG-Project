package application;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// Menu Base - Exemplo ~ Protótipo v1.3

		/*
		 * ////// IMPORTANTE! ////// O caracter Unicode UTF-8 da sua IDE (Eclipse ou
		 * NetBeans) deve estar ativo/permitido para mostrar os desenhos em forma de
		 * caracteres desse jogo. -> No Eclipse, acesse: Window > Preferences > General
		 * > Workspace > Text File Encoding mude Other: para Unicode UTF-8. ~~ Feito
		 * isso, feche e abra o Eclipse novamente.
		 */
		Scanner input = new Scanner(System.in);

		boolean sair = false;
		String opcao, opcaoCondicional = null, opcaoInvalida = "Opção inválida.\nVoltar? (s/n)";
		String sobre = "SINOPSE: \n(A ser preenchido)\n\nDesenvolvido e projetado por: \n - Caio Vinicius \n - João Vitor \n - Paulo Costa \n - Renan Scarpato \n"
				+ "\nLinguagem desenvolvida: Java\nMatéria: Conceitos de Computação\n\n© Todos os direitos reservados.\n"; // temp = temporário
		String opcoes = "Você acessou as opções."; // temp
		String jogar = "Você acessou jogar."; // temp

		do {
			System.out.println("┌────────────────────────────┐\n" + "│  ╔═══╗ Bem-vindo! Welcome! │▒\n"
					+ "│  ╚═╦═╝ MENU (Nome do jogo) │▒\n" + "╞═╤══╩══╤════════════════════╡▒\n"
					+ "│ ├──┬──┤   1. Jogar         │▒\n" + "│ └──┴──┘   2. Opções        │▒\n"
					+ "│           3. Sobre	     │▒\n" + "│           4. Sair          │▒\n"
					+ "└────────────────────────────┘");
			System.out.println("\nDigite uma opção: ");
			opcao = input.next();

			switch (opcao.toLowerCase()) { // deixa toda a opcao lida com caixa baixa
			case "1":
			case "jogar":
				System.out.println(jogar);
				System.out.println("Voltar? (s/n)");
				opcaoCondicional = input.next();

				if (opcaoCondicional.equalsIgnoreCase("s")) {
					continue; // retorna ao Menu, o continue retorna o próximo laço condicional sem ser switch-case, no caso o DO-WHILE do menu.

				} else {
					do {
						if (opcaoCondicional.equalsIgnoreCase("s") || opcaoCondicional.equalsIgnoreCase("n")) {
							System.out.println(jogar);
						}
						System.out.println("Voltar? (s/n)");
						opcaoCondicional = input.next();
						while (!opcaoCondicional.equalsIgnoreCase("s") && !opcaoCondicional.equalsIgnoreCase("n")) {
							System.out.println(opcaoInvalida);
							opcaoCondicional = input.next();
						}
					} while (!opcaoCondicional.equalsIgnoreCase("s"));
					break; // impede o laço de descer diretamente ao próximo case
				}

			case "2":
			case "opcoes":
				System.out.println(opcoes);
				System.out.println("Voltar? (s/n)");
				opcaoCondicional = input.next();

				if (opcaoCondicional.equalsIgnoreCase("s")) {
					continue; // retorna ao Menu
				} else {
					do {
						if (opcaoCondicional.equalsIgnoreCase("s") || opcaoCondicional.equalsIgnoreCase("n")) {
							System.out.println(opcoes);
						}
						System.out.println("Voltar? (s/n)");
						opcaoCondicional = input.next();
						while (!opcaoCondicional.equalsIgnoreCase("s") && !opcaoCondicional.equalsIgnoreCase("n")) {
							System.out.println(opcaoInvalida);
							opcaoCondicional = input.next();
						}
					} while (!opcaoCondicional.equalsIgnoreCase("s"));
					break;
				}
			case "3":
			case "sobre":
				System.out.println(sobre);
				System.out.println("Voltar? (s/n)");
				opcaoCondicional = input.next();

				if (opcaoCondicional.equalsIgnoreCase("s")) {
					continue; // retorna ao Menu
				} else {
					do {
						if (opcaoCondicional.equalsIgnoreCase("s") || opcaoCondicional.equalsIgnoreCase("n")) {
							System.out.println(sobre);
						}
						System.out.println("Voltar? (s/n)");
						opcaoCondicional = input.next();
						while (!opcaoCondicional.equalsIgnoreCase("s") && !opcaoCondicional.equalsIgnoreCase("n")) { // diferente de "s" ou "n" = opcao invalida
							System.out.println(opcaoInvalida);
							opcaoCondicional = input.next();
						}
					} while (!opcaoCondicional.equalsIgnoreCase("s"));
					break;
				}
			case "4":
			case "sair":
				System.out.println("Você saiu do jogo.");
				sair = true; // novo valor aplicado para a variavel boolean (que faz o laço encerrar)
			}

		} while (!sair);

		input.close();
	}
}