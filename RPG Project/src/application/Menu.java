package application;

import java.util.Scanner;

public class Menu {

	static Scanner input = new Scanner(System.in);

	static void telaInicial() {
		System.out.println(
				"    ____  __                 __           ______                        ________                                    __    \n"
						+ "   / __ \\/ /___ _____  ___  / /_____ _   /_  __/__  ______________ _   / ____/ /_  ____ _____ ___  ____ _____  ____/ /___ \n"
						+ "  / /_/ / / __ `/ __ \\/ _ \\/ __/ __ `/    / / / _ \\/ ___/ ___/ __ `/  / /   / __ \\/ __ `/ __ `__ \\/ __ `/ __ \\/ __  / __ \\\n"
						+ " / ____/ / /_/ / / / /  __/ /_/ /_/ /    / / /  __/ /  / /  / /_/ /  / /___/ / / / /_/ / / / / / / /_/ / / / / /_/ / /_/ /\n"
						+ "/_/   /_/\\__,_/_/ /_/\\___/\\__/\\__,_/    /_/  \\___/_/  /_/   \\__,_/   \\____/_/ /_/\\__,_/_/ /_/ /_/\\__,_/_/ /_/\\__,_/\\____/ \n"
						+ "                                                                                                                          \n"
						+ "\n " + "");
		System.out.println("                                1000000000001                              \n"
				+ "                           100000000000000000001                          \n"
				+ "                       10000000000010000000000000001                      \n"
				+ "                    1001 100001         11   000000000                    \n"
				+ "                   00  1  1001           11  00000000000                  \n"
				+ "                 10   00 00000   1110000001    0000000000                 \n"
				+ "                01     100000000000000000000 1  10100000001               \n"
				+ "               01         0000000000001 0000 00  00000000000              \n"
				+ "              01         000000000000000 000      11100000001             \n"
				+ "              0          000000000  0000   1         10000000             \n"
				+ "             001        000000000001000000            10000000            \n"
				+ "             011       000000000000000000000            000000            \n"
				+ "             0         000000000000000000011           0000000            \n"
				+ "             0         0000000000000000                 000000            \n"
				+ "             0         000000000000000                  100000            \n"
				+ "             01         000000000000                     00011            \n"
				+ "              0          1000     00                        0             \n"
				+ "              10          0000 11 000001                   01             \n"
				+ "               00           100001  00001                 01              \n"
				+ "                00              000   001100             01               \n"
				+ "                 101              1000000000000000000  10                 \n"
				+ "                   001        1    000000000000000001101                  \n"
				+ "                     101          10000000000000000111                    \n"
				+ "                       10011        10000000000000                        \n"
				+ "                            111       100000001                      \n\n");
	}

	static int menu() {
		int opcao = 0;
		System.out.println("┌────────────────────────────┐\n" + "│  ╔═══╗ Bem-vindo! Welcome! │▒\n"
				+ "│  ╚═╦═╝         MENU        │▒\n" + "╞═╤══╩══╤════════════════════╡▒\n"
				+ "│ ├──┬──┤   1. Jogar         │▒\n" + "│ └──┴──┘   2. Opções        │▒\n"
				+ "│           3. Sobre	     │▒\n" + "│           4. Sair          │▒\n"
				+ "└────────────────────────────┘");
		System.out.println("\n Digite uma opção: ");

		opcao = input.nextInt();

		return opcao;
	}

	static char opcoesJogo() {
		boolean escolha = true;
		char op = 'a';

		do {
			System.out.println("Opções do jogo");
			System.out.println("Deseja voltar? (s/n)");
			op = input.next().charAt(0);

			while (op != 's' && op != 'n') {
				System.out.println("Digite uma opção válida! ");
				System.out.println("Deseja voltar? (s/n)");
				op = input.next().charAt(0);
			}
			if (op == 'n') {
				escolha = false;
			} else if (op == 's') {
				escolha = true;
			}

		} while (!escolha);

		return op;
	}

	static char sobreJogo() {
		boolean escolha = true;
		char op = 'a';

		do {
			System.out.println("SINOPSE: \n     O rei alienígena Cehros em uma viagem tripulada à procura de vida, colonização e novos recursos, \nsome inexplicavelmente dentro do Sistema Solar, perdendo contato a sua civilização. \n" + 
					"     Seu último registro foi a mensagem indicando o avistamento de um planeta de cor azul e esverdeado, \nrodeado por branqueadas névoas.\n" + 
					"     A Galáxia de Andra-37, localizada a 20 anos-luz da Estrela de Icarus, inicia a missão dos vorazes \nviajantes: a marcha em resgate do seu Rei.\r\n" + 
					"\n\nDesenvolvido e projetado por: \n - Caio Vinicius \n - João Vitor Alves \n - Paulo Costa \n - Renan Scarpato \n" + 
					"				\nLinguagem desenvolvida: Java\nMatéria: Conceitos de Computação\n\n© Todos os direitos reservados.\n");
			System.out.println("Deseja voltar? (s/n)");
			op = input.next().charAt(0);

			while (op != 's' && op != 'n') {
				System.out.println("Digite uma opção válida! ");
				System.out.println("Deseja voltar? (s/n)");
				op = input.next().charAt(0);
			}
			if (op == 'n') {
				escolha = false;
			} else if (op == 's') {
				escolha = true;
			}

		} while (!escolha);
		return op;

	}

	public static void main(String[] args) {
		int op = 0;
		char returnMenu = 'a';
		
		telaInicial(); // tela inicial com o logo do jogo e o nome
		do {
			op = menu(); // menu de opcoes
			if (op == 2) {
				returnMenu = opcoesJogo();
			}

			if (op == 3) {
				returnMenu = sobreJogo();
			}

		} while (op != 1 && op != 4);

		if (op == 4) {
			System.out.println("Você saiu do jogo.");
			input.close();
		} else {
			System.out.println("Entrou no jogo.");
		}
	}

}
