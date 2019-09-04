package RpgEducativo;

import java.util.Scanner;

public class RpgEducativo {

	static String dadosJogador[] = new String[4];
	static Scanner grava = new Scanner(System.in);
	static int contadorFrenquencia = 0;

	// Introdu��o do RPG
	static void introducao() {
		System.out.println("Ol� seja bem vindo ao jogo de Rpg. Autor: JO�O PAULO FERNANDES SOUZA,\n");
		System.out.println(
				"A hist�ria ir� ser contada por apenas um personagem onde as caracter�sticas (nome, idade, sexo, cidade, escola) ser�o informadas pelo jogador.\nO jogo se inicia com o jogador informando seus dados e no in�cio do ano letivo.\nEm seu semestre o personagem ser� submetido a 2 provas e 6 ADOs (Atividades a serem entregues). \n"
						+ "Ap�s os dados serem informados, ser� exibido para o jogador, um conte�do program�tico onde ele saber� quais s�o as pr�ximas etapas a realizar.\nNesse conte�do ir�o ter os assuntos da disciplina, diversas regras e os pesos de cada avalia��o para sua aprova��o.\n");
	}

	// Fun��o de cadastro do jogador
	static void cadastroJogador() {
		String texto = "";

		for (int i = 0; i < dadosJogador.length; i++) {
			if (i == 0) {
				texto = "Digite seu nome:";
			} else if (i == 1) {
				texto = "Digite sua idade:";
			} else if (i == 2) {
				texto = "Digite seu sexo:";
			} else if (i == 3) {
				texto = "Digite sua cidade:";
			} else if (i == 4) {
				texto = "Digite sua escola:";
			}
			System.out.println(texto);
			dadosJogador[i] = grava.nextLine();
		}
	}

	// Fun��o que exibe para o jogador o conteudo do semestre e suas regras
	static void conteudoProgramatico() {
		System.out.println("Vamos ver abaixo no conte�do program�tico\n");
		separacaoComLinhas();
		System.out.println("***** Conte�do program�tico: ");
		System.out.println("");
		System.out.println("*ADOs (6 Atividades)");
		System.out.println("--> ADO 1 ir� abordar o assunto: Equa��o de 1� Grau;\n"
				+ "--> ADO 2 ir� abordar o assunto: Equa��o de 2� Grau;\n"
				+ "--> ADO 3 ir� abordar o assunto: Teorema de Pit�goras;\n"
				+ "--> ADO 4 ir� abordar o assunto: Probabilidade;\n"
				+ "--> ADO 5 ir� abordar o assunto: C�lculo de �reas; \n"
				+ "--> ADO 6 ir� abordar o assunto: C�lculo do volume dos s�lidos geom�tricos;");
		System.out.println("");
		System.out.println("*Provas (P1,P2)");
		System.out.println(
				"--> P1 ir� abordar os assuntos das ADOs 1,2 e 3;\n" + "--> P2 ir� abordar os assuntos do semestre;");
		System.out.println("");
		System.out.println("***** Regras de aprova��o: ");
		System.out
				.println("--> Nota igual ou superior a 6,0\n" + "--> M�nimo de 5 tarefas das 8 solicitadas ao jogador");
		System.out.println("");
		System.out.println("***** Pesos: ");
		System.out.println("(P1 x 0,30% + P2 x 0,50% + ((ADO 1 + ADO 2 + ADO 3 + ADO 4 + ADO 5 + ADO 6) x 0,20%))");
		separacaoComLinhas();
	}

	// Fun��o das ADOS do semestre.
	static int ados(int opcao) {
		int resultado = 0;

		char alternativa;
		switch (opcao) {
		case 1:
			separacaoComLinhas();
			System.out.println("~~~ADO  1~~~");
			System.out
					.println("Existem tr�s n�meros inteiros consecutivos com soma igual a 393. Que n�meros s�o esses?");
			System.out.println("A)128,129,130.");
			System.out.println("B)125,126,127.");
			System.out.println("C)131,132,133.");
			System.out.println("D)130,131,132."); // Resposta correta: D
			System.out.println("E)126,127,128.\n");
			alternativa = grava.next().charAt(0);

			if ((alternativa == 'D') || (alternativa == 'd')) {
				resultado = resultado + 2;
			}

			break;
		case 2:
			separacaoComLinhas();
			System.out.println("~~~ADO  2~~~");
			System.out.println(
					"Se voc� multiplicar um n�mero real x por ele mesmo e do resultado subtrair 14, voc� vai obter o qu�ntuplo do n�mero x. Qual � esse n�mero?");
			System.out.println("A)7 ou -2."); // Alternativa correta A
			System.out.println("B)6 ou -1.");
			System.out.println("C)5 ou 0.");
			System.out.println("D)8 ou -3.");
			System.out.println("E)9 ou -4.\n");
			alternativa = grava.next().charAt(0);

			if ((alternativa == 'A') || (alternativa == 'a')) {
				resultado = resultado + 2;
			}
			break;
		case 3:
			separacaoComLinhas();
			System.out.println("~~~ADO  3~~~");
			System.out.println(
					"Um avi�o percorreu a dist�ncia de 5 000 metros na posi��o inclinada, e em rela��o ao solo, percorreu 3 000 metros. Determine a altura do avi�o.");
			System.out.println("A)3000.");
			System.out.println("B)2500.");
			System.out.println("C)4000."); // Alternativa correta C
			System.out.println("D)2000.");
			System.out.println("E)5000.\n");
			alternativa = grava.next().charAt(0);

			if ((alternativa == 'C') || (alternativa == 'c')) {
				resultado = resultado + 2;
			}
			break;
		case 4:
			separacaoComLinhas();
			System.out.println("~~~ADO 4~~~");
			System.out.println("");
			System.out.println(
					"Quatro moedas s�o lan�adas simultaneamente. Qual � a probabilidade de ocorrer coroa em uma s� moeda?");
			System.out.println("");
			System.out.println("A - 1/8");
			System.out.println("B - 2/9");
			System.out.println("C - 1/4"); // Resposta correta: C
			System.out.println("D - 1/3");
			System.out.println("E - 3/8");
			alternativa = grava.next().charAt(0);
			if ((alternativa == 'C') || (alternativa == 'c')) {
				resultado = resultado + 2;
			}
			break;
		case 5:
			separacaoComLinhas();
			System.out.println("~~~ADO 5~~~");
			System.out.println("");
			System.out.println("Calcule o per�metro do problema a seguir:");
			System.out.println("(Um ret�ngulo cuja �rea horizontal � de 12cm e �rea vertical � 6cm)");
			System.out.println("");
			System.out.println("A - 36"); // Resposta correta: A
			System.out.println("B - 35");
			System.out.println("C - 38");
			System.out.println("D - 56");
			System.out.println("E - 20");
			alternativa = grava.next().charAt(0);
			if ((alternativa == 'A') || (alternativa == 'a')) {
				resultado = resultado + 2;
			}
			break;
		case 6:
			separacaoComLinhas();
			System.out.println("~~~ADO 6~~~");
			System.out.println("");
			System.out.println(
					"Pol�cia Militar apreende mais de 3 kg de pasta base de coca�na em Linhares Em uma mochila foram apreendidos 84 tabletes \n"
							+ "plastificados de coca�na e um tablete grande medindo 20 x 10 cm da mesma subst�ncia, totalizando cerca de 3 quilos de coca�na, \n"
							+ "e R$ 91,00 em esp�cie. Caso o tablete grande mencionado tenha o formato de um paralelep�pedo reto ret�ngulo com 6 cm de altura, \n"
							+ "o valor do volume total de coca�na desse tablete, em cm�, ser� de:");
			System.out.println("");
			System.out.println("A - 400");
			System.out.println("B - 600");
			System.out.println("C - 800");
			System.out.println("D - 1.000");
			System.out.println("E - 1.200"); // Resposta correta: E
			alternativa = grava.next().charAt(0);
			if ((alternativa == 'E') || (alternativa == 'e')) {
				resultado = resultado + 2;
			}
			break;
		default:
			System.out.println("Ado inv�lida");
		}
		return resultado;
	}

	// Fun��o das provas do semestre
	static double provas(int opcao) {
		double resultado = 0;
		int cont = 0;
		char alternativa;
		switch (opcao) {
		case 1:
			do {
				cont++;
				if (cont == 1) {
					System.out.println("PROVA 1 - (10,0 pontos) \n");
					System.out.println("1)Resolva a equa��o a seguir e assinale a alternativa correta:\n"
							+ "\n10y - 5 (1 + y) = 3 (2y - 2) - 20\n");
					System.out.println("A)21."); // Resposta correta: A
					System.out.println("B)22.");
					System.out.println("C)20.");
					System.out.println("D)19.");
					System.out.println("E)23.");
					alternativa = grava.next().charAt(0);

					if ((alternativa == 'A') || (alternativa == 'a')) {
						resultado = resultado + 2.5;
					}
				}
				if (cont == 2) {
					System.out.println("\n2)Resolva a equa��o a seguir e assinale a alternativa correta:\n"
							+ "\n(x - 5)/10 + (1 - 2x)/5 = (3-x)/4\n");
					System.out.println("A)-21."); // Resposta correta: A
					System.out.println("B)-22.");
					System.out.println("C)-20.");
					System.out.println("D)-19.");
					System.out.println("E)-23.");
					alternativa = grava.next().charAt(0);

					if ((alternativa == 'A') || (alternativa == 'a')) {
						resultado = resultado + 2.5;
					}

				}
				if (cont == 3) {
					System.out.println("\n3)O n�mero -3 � a ra�z da equa��o x2 - 7x - 2c = 0. Nessas condi��es, "
							+ "determine o valor do coeficiente c:\n");
					System.out.println("A)10.");
					System.out.println("B)11.");
					System.out.println("C)12.");
					System.out.println("D)14.");
					System.out.println("E)15."); // Resposta correta: E
					alternativa = grava.next().charAt(0);

					if ((alternativa == 'e') || (alternativa == 'E')) {
						resultado = resultado + 2.5;
					}

				}
				if (cont == 4) {
					System.out.println("\n4)Uma escada de 12 metros de comprimento est� apoiada sob um muro. "
							+ "A base da escada est� distante do muro cerca de 8 metros.\n"
							+ "Determine a altura do muro. \n");
					System.out.println("A)Aproximadamente 5,69 metros.");
					System.out.println("B)Aproximadamente 6,35 metros.");
					System.out.println("C)Aproximadamente 8,94 metros."); // Resposta correta: C
					System.out.println("D)Aproximadamente 8,00 metros.");
					System.out.println("E)Aproximadamente 7,64 metros.");
					alternativa = grava.next().charAt(0);

					if ((alternativa == 'C') || (alternativa == 'c')) {
						resultado = resultado + 2.5;
					}

				}

			} while (cont < 4);
			break;
		case 2:
			do {
				cont++;
				if (cont == 1) {
					System.out.println("PROVA 2 - (10,0 pontos)");
					System.out.println("");
					System.out.println("Quest�o 1 - (2,5 pontos)");
					System.out.println("");
					System.out.println(
							"Um caneco em formato de hemisf�rio cujo raio interno mede 20 cm � utilizado para transferir �gua de outro recipiente maior \n"
									+ "para copos em formato de cilindro circular reto, com raio da base medindo 4 cm e altura 15 cm. Considerando que esse caneco \n"
									+ "esteja com �gua equivalente a 4/5 do seu volume m�ximo, a �gua contida nele � suficiente para encher quantos copos?");
					System.out.println("");
					System.out.println("A - 13");
					System.out.println("B - 14");
					System.out.println("C - 10");
					System.out.println("D - 16");
					System.out.println("E - 17"); // Resposta correta: E
					alternativa = grava.next().charAt(0);
					if ((alternativa == 'E') || (alternativa == 'e')) {
						resultado = resultado + 2.5;
					}
				}
				if (cont == 2) {
					System.out.println("");
					System.out.println("Quest�o 2 - (2,5 pontos)");
					System.out.println("");
					System.out.println("Achar as ra�zes da equa��o: x2 - x - 20 = 0");
					System.out.println("");
					System.out.println("A - x' = 5 e x'' = -4"); // Resposta correta: A
					System.out.println("B - x' = 4 e x'' = -5");
					System.out.println("C - x' = 3 e x'' = -6");
					System.out.println("D - x' = 2 e x'' = -7");
					System.out.println("E - x' = 9 e x'' = -4");
					alternativa = grava.next().charAt(0);
					if ((alternativa == 'A') || (alternativa == 'a')) {
						resultado = resultado + 2.5;
					}
				}
				if (cont == 3) {
					System.out.println("");
					System.out.println("Quest�o 3 - (2,5 pontos)");
					System.out.println("");
					System.out.println(
							"A probabilidade de um casal com quatro filhos ter dois do sexo masculino e dois do sexo feminino �:");
					System.out.println("");
					System.out.println("A - 60%");
					System.out.println("B - 50%");
					System.out.println("C - 45%");
					System.out.println("D - 37,5%"); // Resposta correta: D
					System.out.println("E - 25%");
					alternativa = grava.next().charAt(0);
					if ((alternativa == 'D') || (alternativa == 'd')) {
						resultado = resultado + 2.5;
					}
				}
				if (cont == 4) {
					System.out.println("");
					System.out.println("Quest�o 4 - (2,5 pontos)");
					System.out.println("");
					System.out.println(
							"Calcule a metragem de arame utilizado para cercar um terreno triangular com as medidas\n"
									+ "perpendiculares de 60 e 80 metros, considerando que a cerca de arame ter� 4 fios. ");
					System.out.println("");
					System.out.println("A - 800 metros");
					System.out.println("B - 760 metros");
					System.out.println("C - 960 metros"); // Resposta correta: C
					System.out.println("D - 300 metros");
					System.out.println("E - 550 metros");
					alternativa = grava.next().charAt(0);
					if ((alternativa == 'C') || (alternativa == 'c')) {
						resultado = resultado + 2.5;
					}
				}
			} while (cont < 4);
			break;
		default:
			System.out.println("Prova inv�lida");
		}
		return resultado;
	}

	// Fun��o das aulas para aprendizado
	static int aulas(int opcao) {

		switch (opcao) {
		case 1:
			separacaoComLinhas();
			System.out.println("AULA 1: \n"
					+ "\nEqua��o do 1� grau(primeiro grau) � nada mais do que uma igualdade entre as express�es, que as transformam em uma identidade num�rica, \npara um ou para mais valores atribu�dos as suas letras.\n"
					+ "\n" + "Exemplo: \n" + "5 + x = 8\n" + "Essa equa��o se transforma numa identidade, fazendo:\n"
					+ "X = 3 -> 5 + x = 8 -> 8 temos uma identidade.\n"
					+ "A letra x na equa��o, � denominada a vari�vel da equa��o ou inc�gnita, enquanto que o n�mero 3 � chamado de solu��o da equa��o, conjunto verdade ou raiz.\n"
					+ "\n"
					+ "Na equa��o acima, o que est� antes da igualdade � chamado de primeiro membro, e o que est� do lado direito � chamado de segundo membro da equa��o. \n"
					+ "\n" + "Exemplo:\n" + "3x - 12 =   7 + x \n" + "1� membro   2� membro\n");
			break;

		case 2:
			separacaoComLinhas();
			System.out.println("AULA 2: \n"
					+ "\nUma equa��o do 2� grau � uma equa��o que tem duas inc�gnitas x, sendo que uma delas possuem um grau igual a 2.\n"
					+ "\n" + "Exemplo:\n"
					+ "2x� + 5x + 3 = 0(essa � uma equa��o do segundo grau, veja o grau 2 na primeira inc�gnita)\n"
					+ "\n" + "Toda equa��o do 2� grau tem a seguinte forma:\n" + "\n" + "ax� + bx + c = 0\n");
			break;

		case 3:
			separacaoComLinhas();
			System.out.println("AULA 3: \n"
					+ "\nO teorema de Pit�goras relaciona as medidas dos catetos de um tri�ngulo ret�ngulo � medida de sua hipotenusa.\n"
					+ "Esse teorema s� pode ser aplicado em um tri�ngulo ret�ngulo, que � aquele onde h� um �ngulo igual a 90�, que chamamos de �ngulo reto.\n"
					+ "\n" + "a = hipotenusa \n" + "b = cateto \n" + "c = cateto \n" + "\n"
					+ "O teorema de Pit�goras diz que o quadrado da hipotenusa � igual � soma dos quadrados dos catetos. \n"
					+ "a2 = b2 + c2 \n");
			break;

		case 4:
			separacaoComLinhas();
			System.out.println("AULA 4: \n"
					+ "\nNa matem�tica, a probabilidade permite obter o c�lculo das ocorr�ncias poss�veis num experimento aleat�rio\n"
					+ "Em outras palavras, a probabilidade analisa as �chances� de obter determinado resultado.\n"
					+ "A essas chances s�o atribu�dos os n�meros reais do intervalo entre 0 e 1. \n"
					+ "Resultados mais pr�ximos de 1 t�m mais chances de ocorrer.\n" + "\n"
					+ "Exemplo( Lan�amento de um dado):\n"
					+ "Lan�ar um dado e observar qual � o n�mero da face superior tamb�m � um experimento aleat�rio. \n"
					+ "Esse n�mero pode ser 1, 2, 3, 4, 5 ou 6 e cada um desses resultados apresenta a mesma chance de ocorrer.\n"
					+ "Em cada lan�amento, o resultado pode ser igual ao anterior ou diferente dele.\n");
			break;

		case 5:
			separacaoComLinhas();
			System.out.println("AULA 5: \n" + "\n�rea � a medida de uma superf�cie.\n" + "\n"
					+ "A �rea do campo de futebol � a medida de sua superf�cie (gramado).\n" + "\n"
					+ "Se pegarmos outro campo de futebol e colocarmos em uma malha quadriculada, \n"
					+ "a sua �rea ser� equivalente � quantidade de quadradinho. Se cada quadrado for uma unidade de �rea:\n"
					+ "\n" + "Veremos que a �rea do campo de futebol � 70 unidades de �rea.\n"
					+ "A unidade de medida da �rea �: m2 (metros quadrados), cm2 (cent�metros quadrados).\n");
			break;

		case 6:
			separacaoComLinhas();
			System.out.println("AULA 6: \n"
					+ "\nVolume de um s�lido geom�trico � a medida da regi�o do espa�o limitada por sua superf�cie.\n"
					+ "\n"
					+ "Em termos da Matem�tica, volume de um s�lido � um n�mero real positivo associado ao s�lidos de forma que:\n"
					+ "*S�lidos congruentes t�m volumes iguais.\n"
					+ "*Se um s�lido S � a reuni�o de dois s�lidos S1 e S2 que n�o t�m pontos internos comuns, ent�o o volume de S � a soma dos volumes de S1 e S2.\n"
					+ "\n" + "Os s�lidos s�o medidos por uma unidade que, em geral, � um cubo.\n"
					+ "Portanto, o volume desse cubo � 1.Se sua aresta mede 1 cm, seu volume ser� 1 cm�.Se sua aresta medir 1 m, seu volume ser� 1 m�.\n"
					+ "\n" + "Exemplo:\n" + "Volume do cubo-> V = L.L.L = L�\n");
			break;
		}
		return opcao;
	}

	// Fun��o para o calculo das m�dias
	static double media(double p1, double p2, int ado1, int ado2, int ado3, int ado4, int ado5, int ado6) {
		double media = 0;
		int totalAdos = 0;

		totalAdos = ado1 + ado2 + ado3 + ado4 + ado5;

		if (totalAdos < 10) {
			totalAdos = totalAdos + ado6;
		}

		media = ((p1 * 0.5) + (p2 * 0.3) + (totalAdos * 0.2));

		return media;
	}

	// Fun��o que exibe o resultado final do semestre
	static void resultadoSemestre(double media) {
		System.out.println("\nSua m�dia semestral foi de: " + media);
		if ((media >= 6) && (contadorFrenquencia >= 3)) {
			System.out.println("\nParab�ns " + dadosJogador[0] + ", voc� foi aprovado!!");
		} else if ((media >= 6) && (contadorFrenquencia < 3)) {
			System.out.println("\nSuas notas foram acima da m�dia, mas voc� foi reprovado por FALTA!!");
		} else {
			System.out.println("\nInfelizmente suas notas foram insuficientes, e voc� acabou sendo reprovado!!");
		}
		/*
		 * como a regra de aprova��o � >= 6 e ele tem que fazer pelo menos 5 atividades
		 * (PROVAS E ADOS). 2 provas o jogador ja tem de presen�a, ent�o ele precisa de
		 * mais 3 ADOS feitas para contar a presen�a
		 */
	}

	// fun��o para separar textos com linhas
	static void separacaoComLinhas() {
		System.out.println(
				"*******************************************************************************************************************************************************************");
	}

	// Funcao do codigo que chama todas as fun��es e foi montado todo o dialogo aqui
	public static void main(String[] args) {
		double prova1 = 0, prova2 = 0, media = 0;
		int ado1 = 0, ado2 = 0, ado3 = 0, ado4 = 0, ado5 = 0, ado6 = 0;

		// String informacoesJogador = "";

		introducao();

		System.out.println("Digite seus dados para come�ar o jogo!\n");

		cadastroJogador();

		System.out.println("Bem-vindo! " + dadosJogador[0] + " ao nosso ano letivo.\n");
		System.out.println("Digite [1] para continuar");
		int OpContinuar = 0;

		while (OpContinuar != 1) {
			OpContinuar = grava.nextInt();
			if (OpContinuar == 1) {
				break;
			} else {
				System.out.println("Opc�o inv�lida!\n");
				System.out.println("Digite Novamente:\n");
			}
		}

		conteudoProgramatico();

		System.out.println("\nAs aulas come�aram finalmente! Caro(a) " + dadosJogador[0]
				+ ", na nossa primeira aula iremos abordar o assunto de [EQUA��O de 1� GRAU] e contar com a nossa primeira ADO.\n");
		// editando
		System.out.println("Vamos come�ar nossa primeira aula?\n");
		System.out.println("Digite [1] para continuar\n");
		int OpContinuar1 = 0;

		while (OpContinuar1 != 1) {
			OpContinuar1 = grava.nextInt();
			if (OpContinuar1 == 1) {
				aulas(1);
			} else {
				System.out.println("Opc�o inv�lida!\n");
				System.out.println("Digite Novamente:\n");
			}
		}

		System.out.println("Deseja realizar a ADO 1? (Digite [1] para SIM | Digite [2] para N�O)");
		int escolha = grava.nextInt();
		if (escolha == 1) {
			ado1 = ados(1);
			if (ado1 == 2) {
				System.out.println("[Parab�ns voc� acertou a ADO 1!]");
			} else {
				System.out.println("[Voc� errou a ADO 1]");
			}
			contadorFrenquencia = contadorFrenquencia + 1;
		} else {
			System.out.println("[Voc� Tirou 0 pontos na ADO 1]");
		}

		System.out.println(
				"\nMuito bem! Fizemos nossa primeira ADO e vamos continuar aprendendo ainda mais! Vamos para mais uma aula e logo em seguida mais uma ADO.\n");

		aulas(2);

		System.out.println("Deseja realizar a ADO 2? (Digite [1] para SIM | Digite [2] para N�O)");
		int escolha2 = grava.nextInt();
		if (escolha2 == 1) {
			ado2 = ados(2);
			if (ado2 == 2) {
				System.out.println("[Parab�ns voc� acertou a ADO 2!]");
			} else {
				System.out.println("[Voc� errou a ADO 2]");
			}
			contadorFrenquencia = contadorFrenquencia + 1;
		} else {
			System.out.println("[Voc� Tirou 0 pontos na ADO 2]");
		}

		System.out.println(
				"\nAo decorrer das aulas voc� vai pegando o ritmo, vamos para a aula 3. Hoje vamos aprender [TEOREMA de PIT�GORAS].\n");

		aulas(3);

		System.out.println("Deseja realizar a ADO 3? (Digite [1] para SIM | Digite [2] para N�O)");
		int escolha3 = grava.nextInt();
		if (escolha3 == 1) {
			ado3 = ados(3);
			if (ado3 == 2) {
				System.out.println("[Parab�ns voc� acertou a ADO 3!]");
			} else {
				System.out.println("[Voc� errou a ADO 3]");
			}
			contadorFrenquencia = contadorFrenquencia + 1;
		} else {
			System.out.println("[Voc� Tirou 0 pontos na ADO 3]");
		}
		separacaoComLinhas();
		System.out.println(
				"\nPrezado aluno estamos na metade de nosso per�odo letivo assim iniciando a semana de PROVA. Estudou? Est� preparado? Ent�o vamos l�!\n");
		separacaoComLinhas();

		prova1 = provas(1);

		System.out.println("A nota da sua prova 1 foi: " + prova1 + "\n");

		separacaoComLinhas();
		System.out.println(
				"\nUfa!!! J� passou da metade, vamos abordar novos assuntos e praticar exerc�cios, Nessa aula 4 iremos abordar [PROBABILIDADE].\n");

		aulas(4);

		System.out.println("Deseja realizar a ADO 4? (Digite [1] para SIM | Digite [2] para N�O)");
		int escolha4 = grava.nextInt();
		if (escolha4 == 1) {
			ado4 = ados(4);
			if (ado4 == 2) {
				System.out.println("[Parab�ns voc� acertou a ADO 4!]");
			} else {
				System.out.println("[Voc� errou a ADO 4]\n");
			}
			contadorFrenquencia = contadorFrenquencia + 1;
		} else {
			System.out.println("[Voc� Tirou 0 pontos na ADO 4]");
		}

		System.out.println(
				"Agora falta pouco para o semestre acabar, por�m os desafios s�o ainda maiores, hoje na aula 5 iremos aprender o assunto [CALCULO de �REAS].\n");

		aulas(5);

		System.out.println("Deseja realizar a ADO 5? (Digite [1] para SIM | Digite [2] para N�O)");
		int escolha5 = grava.nextInt();
		if (escolha5 == 1) {
			ado5 = ados(5);
			if (ado5 == 2) {
				System.out.println("[Parab�ns voc� acertou a ADO 5!]");
			} else {
				System.out.println("[Voc� errou a ADO 5]");
			}
			contadorFrenquencia = contadorFrenquencia + 1;
		} else {
			System.out.println("[Voc� Tirou 0 pontos na ADO 5]");
		}

		System.out.println(
				"\nCaro jogador, hoje teremos nossa �ltima aula e �ltima ADO antes da PROVA 2, nosso proximo assunto � [C�LCULO do VOLUME dos S�LIDOS GEOM�TRICOS], vamos estudar!\n");

		aulas(6);

		System.out.println("Deseja realizar a ADO 6? (Digite [1] para SIM | Digite [2] para N�O)");
		int escolha6 = grava.nextInt();
		if (escolha6 == 1) {
			ado6 = ados(6);
			if (ado6 == 2) {
				System.out.println("[Parab�ns voc� acertou a ADO 6!]");
			} else {
				System.out.println("[Voc� errou a ADO 6]");
			}
			contadorFrenquencia = contadorFrenquencia + 1;
		} else {
			System.out.println("[Voc� Tirou 0 pontos na ADO 6]");
		}

		System.out.println(
				"\n Ap�s tantas horas de dedica��o nos estudos essa � a hora para mostrar o que voc� realmente sabe! \n Hoje teremos a PROVA 2 que ir� aborar todo o conte�do do semestre, Boa sorte jogador!\n");
		
		prova2 = provas(2);
		
		separacaoComLinhas();
		System.out.println("A nota da sua prova 2 foi: " + prova2);
		separacaoComLinhas();

		media = media(prova1, prova2, ado1, ado2, ado3, ado4, ado5, ado6);
		
		resultadoSemestre(media);
		separacaoComLinhas();
	}
}
