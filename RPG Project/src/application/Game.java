package application;

import java.util.Scanner;

public class Game {

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

	static char informacoesClasse(String classe) {
		char escolhaClasse = classe.charAt(0);

		if (escolhaClasse == 'a' || classe.equals("1") || escolhaClasse == 'A') {
			System.out.println("Descrição da classe Andromedans");
			escolhaClasse = '1';
		} else if (escolhaClasse == 's' || classe.equals("2") || escolhaClasse == 'S') {
			System.out.println("Descrição da classe Sirians");
			escolhaClasse = '2';
		} else if (escolhaClasse == 'r' || classe.equals("3") || escolhaClasse == 'R') {
			System.out.println("Descrição da classe Reptilians");
			escolhaClasse = '3';
		}
		return escolhaClasse;
	}

	static boolean validaClasse(char classe) {
		boolean validador = true;
		switch (classe) {
		case '1':
			System.out.println("Você escolheu Andromedans. Confirma escolha? (s/n)");
			if (input.next().charAt(0) != 's') {
				return validador = false;
			}
			return validador;
		case '2':
			System.out.println("Você escolheu Sirians. Confirma escolha? (s/n)");
			if (input.next().charAt(0) != 's') {
				return validador = false;
			}
			return validador;
		case '3':
			System.out.println("Você escolheu Reptilians. Confirma escolha? (s/n)");
			if (input.next().charAt(0) != 's') {
				return validador = false;
			}
			return validador;
		default:
			System.out.println("Classe inválida. Faça sua escolha novamente");
			return validador = false;
		}
	}

	static void salaComando() {
		System.out.println("╔═══════════════════════════════╗\r\n" + "║      SALA DE COMANDO    🚀               ║\r\n"
				+ "╠═══╦═══════════════════════════╣\r\n" + "║ 1 ║    Sala de Navegação      ║\r\n"
				+ "╠═══╬═══════════════════════════╣\r\n" + "║ 2 ║    Sala de Manutenção     ║\r\n"
				+ "╠═══╬═══════════════════════════╣\r\n" + "║ 3 ║    Dormitório             ║\r\n"
				+ "╠═══╬═══════════════════════════╣\r\n" + "║ 4 ║    Sala Médica            ║\r\n"
				+ "╚═══╩═══════════════════════════╝");
		int sala = 0;

		do {
			System.out.println("Digite para acessar: ");
			sala = input.nextInt();

			switch (sala) {
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
				System.out.println("Comando inválido, digite novamente: ");
			}
		} while (sala < 1 || sala > 4);
	}

	static void salaNavegacao() {
		System.out.println("Você está na Sala de Navegação.");

		System.out.println("Deseja voltar para Sala de Comando? (s/n)");
		char opcao = input.next().charAt(0);
		if (opcao == 's') {
			salaComando();
		} else {
			salaNavegacao();
		}
	}

	static void salaMedica() {
		System.out.println("Você está na Sala Médica.");

		System.out.println("Deseja voltar para Sala de Comando? (s/n)");
		char opcao = input.next().charAt(0);
		if (opcao == 's') {
			salaComando();
		} else {
			salaMedica();
		}
	}

	static void salaDormitorio() {
		System.out.println("Você está no Dormitório.");

		System.out.println("Deseja voltar para Sala de Comando? (s/n)");
		char opcao = input.next().charAt(0);
		if (opcao == 's') {
			salaComando();
		} else {
			salaDormitorio();
		}
	}

	static void salaManutencao() {
		System.out.println("Você está na Sala de Manutenção.");

		System.out.println("╔═══════════════════════════════╗\r\n" + "║      SALA DE MANUTENÇÃO 🔧               ║\r\n"
				+ "╠═══╦═══════════════════════════╣\r\n" + "║ 1 ║    Reparar Oxigénio       ║\r\n"
				+ "╠═══╬═══════════════════════════╣\r\n" + "║ 2 ║    Reparar Reator         ║\r\n"
				+ "╠═══╬═══════════════════════════╣\r\n" + "║ 3 ║    Reparar Portas         ║\r\n"
				+ "╠═══╬═══════════════════════════╣\r\n" + "║ 4 ║    Reparar ----           ║\r\n"
				+ "╚═══╩═══════════════════════════╝");
		
		int salaManutencao = 0;
		do {
			System.out.println("Digite para acessar: ");
			salaManutencao = input.nextInt();

			switch (salaManutencao) {
			case 1:
				PerguntasOxigenio();
				break;
			case 2:
				PerguntasReator();
				break;
			case 3:
				PerguntasPortas();
				break;
			case 4:
				PerguntasAA();
				break;
			default:
				System.out.println("Comando inválido, digite novamente: ");
			}
		} while (salaManutencao < 1 || salaManutencao > 4);
		
		
		System.out.println("Deseja voltar para Sala de Comando? (s/n)");
		char opcao = input.next().charAt(0);
		if (opcao == 's') {
			salaComando();
		} else {
			salaManutencao();
		}
	}
	static void PerguntasOxigenio() {
		System.out.println("Você Acesso reparos de Oxigénio!");
		//adicionar 5 perguntas e escolher uma atraves do random
		System.out.println("Deseja voltar para Sala de Comando? (s/n)");
		char opcao = input.next().charAt(0);
		if (opcao == 's') {
			salaComando();
		} else {
			PerguntasOxigenio();
		}
	}
static void PerguntasReator() {
	System.out.println("Você Acesso reparos do Reator!");
	//adicionar 5 perguntas e escolher uma atraves do random
	System.out.println("Deseja voltar para Sala de Comando? (s/n)");
		char opcao = input.next().charAt(0);
		if (opcao == 's') {
			salaComando();
		} else {
			PerguntasReator();
		}
	}
static void PerguntasPortas() {
	System.out.println("Você Acesso reparos das portas da nave!");
	//adicionar 5 perguntas e escolher uma atraves do random
	
	System.out.println("Deseja voltar para Sala de Comando? (s/n)");
	char opcao = input.next().charAt(0);
	if (opcao == 's') {
		salaComando();
	} else {
		PerguntasPortas();
	}
}
static void PerguntasAA() {
	
	System.out.println("Você Acesso reparos a (definir) !");
	//adicionar 5 perguntas e escolher uma atraves do random
	
	System.out.println("Deseja voltar para Sala de Comando? (s/n)");
	char opcao = input.next().charAt(0);
	if (opcao == 's') {
		salaComando();
	} else {
		PerguntasAA();
	}
}
	public static void main(String[] args) {
		int op;
		char classe;
		telaInicial(); // tela inicial com o logo e o nome do jogo
		do {
			op = menu(); // menu de opcoes
			if (op == 2) {
				opcoesJogo();
			}
			if (op == 3) {
				sobreJogo();
			}

		} while (op != 1 && op != 4);

		if (op == 4) {
			System.out.println("Você saiu do jogo.");
			return;
		}

		System.out.println("Você entrou no jogo!");
		System.out.println("\nÉ a sua primeira vez jogando? (s/n)");
		if (input.next().charAt(0) == 's') {
			System.out.println("Bem-vindo!");
			System.out.println("****** TUTORIAL ******");
		}

		System.out.println("\n ========== Introdução ========= \n");

		do {
			String classeEscolhida = escolhaClasse(); // introduz a tabela de classes
			classe = informacoesClasse(classeEscolhida); // pega a escolha de classe e traz pra variavel
		} while (validaClasse(classe) != true); // se a classe não for valida, volta ao procedimento de escolha

		salaComando();

		input.close();
	}

}
