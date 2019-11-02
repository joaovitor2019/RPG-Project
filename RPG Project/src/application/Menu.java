package application;

import java.util.Scanner;

public class Menu {

	static Scanner input = new Scanner(System.in);

	static void telaInicial() {
		System.out.println(
				"    ____  __                 __           ______                        ________                                    __    \r\n"
						+ "   / __ \\/ /___ _____  ___  / /_____ _   /_  __/__  ______________ _   / ____/ /_  ____ _____ ___  ____ _____  ____/ /___ \r\n"
						+ "  / /_/ / / __ `/ __ \\/ _ \\/ __/ __ `/    / / / _ \\/ ___/ ___/ __ `/  / /   / __ \\/ __ `/ __ `__ \\/ __ `/ __ \\/ __  / __ \\\r\n"
						+ " / ____/ / /_/ / / / /  __/ /_/ /_/ /    / / /  __/ /  / /  / /_/ /  / /___/ / / / /_/ / / / / / / /_/ / / / / /_/ / /_/ /\r\n"
						+ "/_/   /_/\\__,_/_/ /_/\\___/\\__/\\__,_/    /_/  \\___/_/  /_/   \\__,_/   \\____/_/ /_/\\__,_/_/ /_/ /_/\\__,_/_/ /_/\\__,_/\\____/ \r\n"
						+ "                                                                                                                          \r\n"
						+ "\r\n " + "");
		System.out.println("                                1000000000001                              \r\n"
				+ "                           100000000000000000001                          \r\n"
				+ "                       10000000000010000000000000001                      \r\n"
				+ "                    1001 100001         11   000000000                    \r\n"
				+ "                   00  1  1001           11  00000000000                  \r\n"
				+ "                 10   00 00000   1110000001    0000000000                 \r\n"
				+ "                01     100000000000000000000 1  10100000001               \r\n"
				+ "               01         0000000000001 0000 00  00000000000              \r\n"
				+ "              01         000000000000000 000      11100000001             \r\n"
				+ "              0          000000000  0000   1         10000000             \r\n"
				+ "             001        000000000001000000            10000000            \r\n"
				+ "             011       000000000000000000000            000000            \r\n"
				+ "             0         000000000000000000011           0000000            \r\n"
				+ "             0         0000000000000000                 000000            \r\n"
				+ "             0         000000000000000                  100000            \r\n"
				+ "             01         000000000000                     00011            \r\n"
				+ "              0          1000     00                        0             \r\n"
				+ "              10          0000 11 000001                   01             \r\n"
				+ "               00           100001  00001                 01              \r\n"
				+ "                00              000   001100             01               \r\n"
				+ "                 101              1000000000000000000  10                 \r\n"
				+ "                   001        1    000000000000000001101                  \r\n"
				+ "                     101          10000000000000000111                    \r\n"
				+ "                       10011        10000000000000                        \r\n"
				+ "                            111       100000001                      \n\n");
	}

	static int menu() {
		int opcao = 0;
		System.out.println("┌────────────────────────────┐\n" + "│  ╔═══╗ Bem-vindo! Welcome! │▒\n"
				+ "│  ╚═╦═╝        MENU         │▒\n" + "╞═╤══╩══╤════════════════════╡▒\n"
				+ "│ ├──┬──┤     1. Jogar       │▒\n" + "│ └──┴──┘     2. Opções      │▒\n"
				+ "│             3. Sobre	     │▒\n" + "│             4. Sair        │▒\n"
				+ "└────────────────────────────┘");
		System.out.println("\n Digite uma opção: ");
		opcao = input.nextInt();
		return opcao;
	}

	static char opcoesJogo() {
		boolean escolha = true;
		char op = 0;

		do {
			System.out.println("Opcoes do jogo."); // temporário
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
		char op = 0;

		do {
			System.out.println("SINOPSE:\n"
					+ "    Um rei alienígena em uma viagem tripulada à procura \nde vida, colonização e novos recursos, some\r\n"
					+ "inexplicavelmente dentro do Sistema Solar, perdendo\r\n" + "contato a sua civilização.\r\n"
					+ "    Seu último registro foi a mensagem indicando o\r\n"
					+ "avistamento de um planeta de cor azul e esverdeado,\r\n" + "rodeado por branqueadas névoas.\r\n"
					+ "    A Galáxia de Andra-37, localizada a 20 anos-luz da\r\n"
					+ "Estrela de Icarus, inicia a missão dos vorazes viajantes:\r\n"
					+ "a marcha em resgate do seu Rei.\n");

			System.out.println(
					"Linguagem desenvolvida: Java\nMatéria: Conceitos de Computação\n\n© Todos os direitos reservados.\n");

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

	static String escolhaClasse() {
		System.out.println("╔═════════════╦═════════════════════════════════════════════════╗\r\n"
				+ "║   CLASSES   ║            (Habilidades a preencher)            ║\r\n"
				+ "╠═════════════╬═════════════════════════════════════════════════╣\r\n"
				+ "║ Andromedans ║                                                 ║\r\n"
				+ "╠═════════════╬═════════════════════════════════════════════════╣\r\n"
				+ "║   Sirians   ║                                                 ║\r\n"
				+ "╠═════════════╬═════════════════════════════════════════════════╣\r\n"
				+ "║  Reptilians ║                                                 ║\r\n"
				+ "╚═════════════╩═════════════════════════════════════════════════╝");

		System.out.println("Escolha sua classe!");
		String opcaoClasse = input.next();
		return opcaoClasse;
	}

	static String informacoesClasse(String classe) {
		if (classe.contains("andro") || classe.equals("1")) {
			System.out.println("Descrição da classe Andromedans");
			return "1";
		} else if (classe.contains("siri") || classe.equals("2")) {
			System.out.println("Descrição da classe Sirians");
			return "2";
		} else if (classe.contains("rep") || classe.equals("3")) {
			System.out.println("Descrição da classe Reptilians");
			return "3";
		}
		return classe;
	}

	static void salaComando() {
		System.out.println(
				"╔════════════════════════════════╗\r\n"
						+ "║        SALA DE COMANDO         ║\r\n"
						+ "╠═══╦════════════════════════════╣\r\n"
						+ "║ 1 ║    Sala de Navegação       ║\r\n"
						+ "╠═══╬════════════════════════════╣\r\n"
						+ "║ 2 ║    Sala de Manutenção      ║\r\n"
						+ "╠═══╬════════════════════════════╣\r\n"
						+ "║ 3 ║    Dormitório              ║\r\n"
						+ "╠═══╬════════════════════════════╣\r\n"
						+ "║ 4 ║    Sala Médica             ║\r\n"
						+ "╚═══╩════════════════════════════╝"
				
				);
		int retornoSala = 0;

		do {
			System.out.println("Digite para entrar: ");
			retornoSala = input.nextInt();

			switch (retornoSala) {
			case 1:
				salaNavegacao();
				break;
			case 2:
				salaManutencao();
				break;
			case 3:
				salaDormitorio();
				break;
			case 4:
				salaMedica();
				break;
			default:
				System.out.println("Comando inválido, digite novamente:");
			}
		} while (retornoSala < 1 || retornoSala > 4);

	}

	static void salaNavegacao() {
		System.out.println("Você está na Sala de Navegação.");
	}

	static void salaMedica() {
		System.out.println("Você está na Sala Médica.");

		System.out.println("Deseja voltar pra Sala de Comando? (s/n)");
		char opcao = input.next().charAt(0);
		if (opcao == 's') {
			salaComando();
		}
	}

	static void salaDormitorio() {
		System.out.println("Você está no Dormitório.");
	}

	static void salaManutencao() {
		System.out.println("Você está na Sala de Manutenção.");
	}

	public static void main(String[] args) {
		int op;
		char returnMenu;
		telaInicial(); // tela inicial com o logo e o nome do jogo
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
			return;
		}

		System.out.println("Você entrou no jogo!");
		System.out.println("\n ========== Introdução ========= \n");
		String classe = escolhaClasse();
		informacoesClasse(classe);

		System.out.println("Confirma escolha? (1-Sim, 2-Nao)");
		op = input.nextInt();
		if (op == 1) {
			salaComando();
		} else {
			classe = escolhaClasse();
			informacoesClasse(classe);
		}

		input.close();
	}

}
