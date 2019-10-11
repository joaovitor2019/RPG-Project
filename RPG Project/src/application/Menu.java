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
		System.out.println("    ____  __                 __           ______                        ________                                    __    \r\n" + 
				"   / __ \\/ /___ _____  ___  / /_____ _   /_  __/__  ______________ _   / ____/ /_  ____ _____ ___  ____ _____  ____/ /___ \r\n" + 
				"  / /_/ / / __ `/ __ \\/ _ \\/ __/ __ `/    / / / _ \\/ ___/ ___/ __ `/  / /   / __ \\/ __ `/ __ `__ \\/ __ `/ __ \\/ __  / __ \\\r\n" + 
				" / ____/ / /_/ / / / /  __/ /_/ /_/ /    / / /  __/ /  / /  / /_/ /  / /___/ / / / /_/ / / / / / / /_/ / / / / /_/ / /_/ /\r\n" + 
				"/_/   /_/\\__,_/_/ /_/\\___/\\__/\\__,_/    /_/  \\___/_/  /_/   \\__,_/   \\____/_/ /_/\\__,_/_/ /_/ /_/\\__,_/_/ /_/\\__,_/\\____/ \r\n" + 
				"                                                                                                                          \r\n" + 
				"\r\n " + 
				"");
		System.out.println("                                1000000000001                              \r\n" + 
				"                           100000000000000000001                          \r\n" + 
				"                       10000000000010000000000000001                      \r\n" + 
				"                    1001 100001         11   000000000                    \r\n" + 
				"                   00  1  1001           11  00000000000                  \r\n" + 
				"                 10   00 00000   1110000001    0000000000                 \r\n" + 
				"                01     100000000000000000000 1  10100000001               \r\n" + 
				"               01         0000000000001 0000 00  00000000000              \r\n" + 
				"              01         000000000000000 000      11100000001             \r\n" + 
				"              0          000000000  0000   1         10000000             \r\n" + 
				"             001        000000000001000000            10000000            \r\n" + 
				"             011       000000000000000000000            000000            \r\n" + 
				"             0         000000000000000000011           0000000            \r\n" + 
				"             0         0000000000000000                 000000            \r\n" + 
				"             0         000000000000000                  100000            \r\n" + 
				"             01         000000000000                     00011            \r\n" + 
				"              0          1000     00                        0             \r\n" + 
				"              10          0000 11 000001                   01             \r\n" + 
				"               00           100001  00001                 01              \r\n" + 
				"                00              000   001100             01               \r\n" + 
				"                 101              1000000000000000000  10                 \r\n" + 
				"                   001        1    000000000000000001101                  \r\n" + 
				"                     101          10000000000000000111                    \r\n" + 
				"                       10011        10000000000000                        \r\n" + 
				"                            111       100000001                      \n\n");
		do {
			System.out.println("┌────────────────────────────┐\n" + "│  ╔═══╗ Bem-vindo! Welcome! │▒\n"
					+ "│  ╚═╦═╝         MENU        │▒\n" + "╞═╤══╩══╤════════════════════╡▒\n"
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