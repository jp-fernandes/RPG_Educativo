package RPG_Educativo;

import java.util.Scanner;

public class RPG_Educativo {

	static String dadosJogador[] = new String[5];
	static Scanner grava = new Scanner(System.in);
	static int contadorFrenquencia = 0;

	// Introdução do RPG
	static void introducao() {
		System.out.println("Olá seja bem vindo ao jogo de RPG. Autor: JOÃO PAULO FERNANDES SOUZA,\n");
		System.out.println(
				"A história irá ser contada por apenas um personagem onde as características (nome, idade, sexo, cidade, escola) serão informadas pelo jogador.\nO jogo se inicia com o jogador informando seus dados e no início do ano letivo.\nEm seu semestre o personagem será submetido a 2 provas e 6 ADOs (Atividades a serem entregues). \n"
						+ "Após os dados serem informados, será exibido para o jogador um conteúdo programático onde ele saberá quais são as próximas etapas a realizar.\nNesse conteúdo irão ter os assuntos da disciplina, diversas regras e os pesos de cada avaliação para sua aprovação.\n");
	}

	// Função de cadastro do jogador.
	static void cadastroJogador() {
		System.out.println("Digite seus dados para começar o jogo!\n");

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

	// Função que exibe para o jogador o conteudo do semestre e suas regras.
	static void conteudoProgramatico() {
		System.out.println("Vamos ver abaixo no conteúdo programático\n");
		separacaoComLinhas();
		System.out.println("***** Conteúdo programático: ");
		System.out.println("");
		System.out.println("*ADOs (6 Atividades)");
		System.out.println("--> ADO 1 irá abordar o assunto: Equação de 1º Grau;\n"
				+ "--> ADO 2 irá abordar o assunto: Equação de 2º Grau;\n"
				+ "--> ADO 3 irá abordar o assunto: Teorema de Pitágoras;\n"
				+ "--> ADO 4 irá abordar o assunto: Probabilidade;\n"
				+ "--> ADO 5 irá abordar o assunto: Cálculo de áreas; \n"
				+ "--> ADO 6 irá abordar o assunto: Cálculo do volume dos sólidos geométricos;");
		System.out.println("");
		System.out.println("*Provas (P1,P2)");
		System.out.println(
				"--> P1 irá abordar os assuntos das ADOs 1,2 e 3;\n" + "--> P2 irá abordar os assuntos do semestre;");
		System.out.println("");
		System.out.println("***** Regras de aprovação: ");
		System.out
				.println("--> Nota igual ou superior a 6,0\n" + "--> Mínimo de 5 tarefas das 8 solicitadas ao jogador");
		System.out.println("");
		System.out.println("***** Pesos: ");
		System.out.println("(P1 x 0,30% + P2 x 0,50% + ((ADO 1 + ADO 2 + ADO 3 + ADO 4 + ADO 5 + ADO 6) x 0,20%))");
		separacaoComLinhas();
	}

	// Função das ADOS do semestre.
	static int ados(int opcao) {
		int resultado = 0;

		char alternativa;
		switch (opcao) {
		case 1:
			separacaoComLinhas();
			System.out.println("~~~ADO  1~~~");
			System.out
					.println("Existem três números inteiros consecutivos com soma igual a 393. Que números são esses?");
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
					"Se você multiplicar um número real x por ele mesmo e do resultado subtrair 14, você vai obter o quíntuplo do número x. Qual é esse número?");
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
					"Um avião percorreu a distância de 5 000 metros na posição inclinada, e em relação ao solo, percorreu 3 000 metros. Determine a altura do avião.");
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
					"Quatro moedas são lançadas simultaneamente. Qual é a probabilidade de ocorrer coroa em uma só moeda?");
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
			System.out.println("Calcule o perímetro do problema a seguir:");
			System.out.println("(Um retângulo cuja área horizontal é de 12cm e área vertical é 6cm)");
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
					"Polícia Militar apreende mais de 3 kg de pasta base de cocaína em Linhares Em uma mochila foram apreendidos 84 tabletes \n"
							+ "plastificados de cocaína e um tablete grande medindo 20 x 10 cm da mesma substância, totalizando cerca de 3 quilos de cocaína, \n"
							+ "e R$ 91,00 em espécie. Caso o tablete grande mencionado tenha o formato de um paralelepípedo reto retângulo com 6 cm de altura, \n"
							+ "o valor do volume total de cocaína desse tablete, em cm³, será de:");
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
			System.out.println("Ado inválida");
		}
		return resultado;
	}

	// Função das provas do semestre.
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
					System.out.println("1)Resolva a equação a seguir e assinale a alternativa correta:\n"
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
					System.out.println("\n2)Resolva a equação a seguir e assinale a alternativa correta:\n"
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
					System.out.println("\n3)O número -3 é a raíz da equação x2 - 7x - 2c = 0. Nessas condições, "
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
					System.out.println("\n4)Uma escada de 12 metros de comprimento está apoiada sob um muro. "
							+ "A base da escada está distante do muro cerca de 8 metros.\n"
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
					separacaoComLinhas();
					System.out.println("PROVA 2 - (10,0 pontos)");
					System.out.println("");
					System.out.println("Questão 1 - (2,5 pontos)");
					System.out.println("");
					System.out.println(
							"Um caneco em formato de hemisfério cujo raio interno mede 20 cm é utilizado para transferir água de outro recipiente maior \n"
									+ "para copos em formato de cilindro circular reto, com raio da base medindo 4 cm e altura 15 cm. Considerando que esse caneco \n"
									+ "esteja com água equivalente a 4/5 do seu volume máximo, a água contida nele é suficiente para encher quantos copos?");
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
					System.out.println("Questão 2 - (2,5 pontos)");
					System.out.println("");
					System.out.println("Achar as raízes da equação: x2 - x - 20 = 0");
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
					System.out.println("Questão 3 - (2,5 pontos)");
					System.out.println("");
					System.out.println(
							"A probabilidade de um casal com quatro filhos ter dois do sexo masculino e dois do sexo feminino é:");
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
					System.out.println("Questão 4 - (2,5 pontos)");
					System.out.println("");
					System.out.println(
							"Calcule a metragem de arame utilizado para cercar um terreno triangular com as medidas\n"
									+ "perpendiculares de 60 e 80 metros, considerando que a cerca de arame terá 4 fios. ");
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
			System.out.println("Prova inválida");
		}
		return resultado;
	}

	// Função das aulas para aprendizado.
	static void aulas(int opcao) {

		switch (opcao) {
		case 1:
			separacaoComLinhas();
			System.out.println("AULA 1: \n"
					+ "\nEquação do 1º grau(primeiro grau) é nada mais do que uma igualdade entre as expressões, que as transformam em uma identidade numérica, \npara um ou para mais valores atribuídos as suas letras.\n"
					+ "\n" + "Exemplo: \n" + "5 + x = 8\n" + "Essa equação se transforma numa identidade, fazendo:\n"
					+ "X = 3 -> 5 + x = 8 -> 8 temos uma identidade.\n"
					+ "A letra x na equação, é denominada a variável da equação ou incógnita, enquanto que o número 3 é chamado de solução da equação, conjunto verdade ou raiz.\n"
					+ "\n"
					+ "Na equação acima, o que está antes da igualdade é chamado de primeiro membro, e o que está do lado direito é chamado de segundo membro da equação. \n"
					+ "\n" + "Exemplo:\n" + "3x - 12 =   7 + x \n" + "1º membro   2º membro\n");
			break;

		case 2:
			separacaoComLinhas();
			System.out.println("AULA 2: \n"
					+ "\nUma equação do 2º grau é uma equação que tem duas incógnitas x, sendo que uma delas possuem um grau igual a 2.\n"
					+ "\n" + "Exemplo:\n"
					+ "2x² + 5x + 3 = 0(essa é uma equação do segundo grau, veja o grau 2 na primeira incógnita)\n"
					+ "\n" + "Toda equação do 2º grau tem a seguinte forma:\n" + "\n" + "ax² + bx + c = 0\n");
			break;

		case 3:
			separacaoComLinhas();
			System.out.println("AULA 3: \n"
					+ "\nO teorema de Pitágoras relaciona as medidas dos catetos de um triângulo retângulo à medida de sua hipotenusa.\n"
					+ "Esse teorema só pode ser aplicado em um triângulo retângulo, que é aquele onde há um ângulo igual a 90°, que chamamos de ângulo reto.\n"
					+ "\n" + "a = hipotenusa \n" + "b = cateto \n" + "c = cateto \n" + "\n"
					+ "O teorema de Pitágoras diz que o quadrado da hipotenusa é igual à soma dos quadrados dos catetos. \n"
					+ "a2 = b2 + c2 \n");
			break;

		case 4:
			separacaoComLinhas();
			System.out.println("AULA 4: \n"
					+ "\nNa matemática, a probabilidade permite obter o cálculo das ocorrências possíveis num experimento aleatório\n"
					+ "Em outras palavras, a probabilidade analisa as chances de obter determinado resultado.\n"
					+ "A essas chances são atribuídos os números reais do intervalo entre 0 e 1. \n"
					+ "Resultados mais próximos de 1 têm mais chances de ocorrer.\n" + "\n"
					+ "Exemplo( Lançamento de um dado):\n"
					+ "Lançar um dado e observar qual é o número da face superior também é um experimento aleatório. \n"
					+ "Esse número pode ser 1, 2, 3, 4, 5 ou 6 e cada um desses resultados apresenta a mesma chance de ocorrer.\n"
					+ "Em cada lançamento, o resultado pode ser igual ao anterior ou diferente dele.\n");
			break;

		case 5:
			separacaoComLinhas();
			System.out.println("AULA 5: \n" + "\nÁrea é a medida de uma superfície.\n" + "\n"
					+ "A área do campo de futebol é a medida de sua superfície (gramado).\n" + "\n"
					+ "Se pegarmos outro campo de futebol e colocarmos em uma malha quadriculada, \n"
					+ "a sua área será equivalente à quantidade de quadradinho. Se cada quadrado for uma unidade de área:\n"
					+ "\n" + "Veremos que a área do campo de futebol é 70 unidades de área.\n"
					+ "A unidade de medida da área é: m2 (metros quadrados), cm2 (centímetros quadrados).\n");
			break;

		case 6:
			separacaoComLinhas();
			System.out.println("AULA 6: \n"
					+ "\nVolume de um sólido geométrico é a medida da região do espaço limitada por sua superfície.\n"
					+ "\n"
					+ "Em termos da Matemática, volume de um sólido é um número real positivo associado ao sólidos de forma que:\n"
					+ "*Sólidos congruentes têm volumes iguais.\n"
					+ "*Se um sólido S é a reunião de dois sólidos S1 e S2 que não têm pontos internos comuns, então o volume de S é a soma dos volumes de S1 e S2.\n"
					+ "\n" + "Os sólidos são medidos por uma unidade que, em geral, é um cubo.\n"
					+ "Portanto, o volume desse cubo é 1.Se sua aresta mede 1 cm, seu volume será 1 cm³.Se sua aresta medir 1 m, seu volume será 1 m³.\n"
					+ "\n" + "Exemplo:\n" + "Volume do cubo-> V = L.L.L = L³\n");
			break;
		}
	}

	// Função para o calculo das médias.
	static double media(double p1, double p2, int ado1, int ado2, int ado3, int ado4, int ado5, int ado6) {
		double media = 0;
		int totalAdos = 0;

		totalAdos = ado1 + ado2 + ado3 + ado4 + ado5;

		if (totalAdos < 10) {
			totalAdos = totalAdos + ado6;
		}

		media = ((p1 * 0.3) + (p2 * 0.5) + (totalAdos * 0.2));

		return media;
	}

	// Função que exibe o resultado final do semestre.
	static void resultadoSemestre(double media) {
		System.out.println("\nSua média semestral foi de: " + media + "\n");
		if ((media >= 6) && (contadorFrenquencia >= 3)) {
			System.out.println("\nParabéns " + dadosJogador[0] + ", você foi aprovado!!");
		} else if ((media >= 6) && (contadorFrenquencia < 3)) {
			System.out.println("\nSuas notas foram acima da média, mas você foi reprovado por FALTA!!");
		} else {
			System.out.println(
					dadosJogador[0] + " infelizmente suas notas foram insuficientes, e você acabou sendo reprovado!!");
		}
		/*
		 * como a regra de aprovação é >= 6 e ele tem que fazer pelo menos 5 atividades
		 * (PROVAS E ADOS). 2 provas o jogador ja tem de presença, então ele precisa de
		 * mais 3 ADOS feitas para contar a presença
		 */
	}

	// função para separar textos com linhas.
	static void separacaoComLinhas() {
		System.out.println(
				"*******************************************************************************************************************************************************************");
	}

	// funcao dialogos.
	static double dialogos(int opcao) {

		double resultadoProvas = 0;

		switch (opcao) {
		case 1:
			System.out.println("Bem-vindo! " + dadosJogador[0] + " ao nosso ano letivo.\n");
			break;
		case 2:
			System.out.println("\nAs aulas começaram finalmente! Caro(a) " + dadosJogador[0]
					+ ", na nossa primeira aula iremos abordar o assunto de [EQUAÇÃO de 1º GRAU] e contar com a nossa primeira ADO.\n");
			System.out.println("Vamos começar nossa primeira aula?\n");
			break;
		case 3:
			System.out.println(
					"\nMuito bem! Fizemos nossa primeira ADO e vamos continuar aprendendo ainda mais! Vamos para mais uma aula e logo em seguida mais uma ADO.\n");
			break;
		case 4:
			System.out.println(
					"\nAo decorrer das aulas você vai pegando o ritmo, vamos para a aula 3. Hoje vamos aprender [TEOREMA de PITÁGORAS].\n");
			break;
		case 5:
			separacaoComLinhas();
			System.out.println(
					"\nPrezado aluno estamos na metade de nosso período letivo assim iniciando a semana de PROVA. Estudou? Está preparado? Então vamos lá!\n");
			separacaoComLinhas();
			break;
		case 6:
			resultadoProvas = provas(1);
			System.out.println("A nota da sua prova 1 foi: " + resultadoProvas + "\n");
			break;
		case 7:
			separacaoComLinhas();
			System.out.println(
					"\nUfa!!! Já passou da metade, vamos abordar novos assuntos e praticar exercícios, Nessa aula 4 iremos abordar [PROBABILIDADE].\n");
			break;
		case 8:
			separacaoComLinhas();
			System.out.println(
					"Agora falta pouco para o semestre acabar, porém os desafios são ainda maiores, hoje na aula 5 iremos aprender o assunto [CALCULO de ÁREAS].\n");
			break;
		case 9:
			System.out.println(
					"\nCaro jogador, hoje teremos nossa última aula e última ADO antes da PROVA 2, nosso proximo assunto é [CÁLCULO do VOLUME dos SÓLIDOS GEOMÉTRICOS], vamos estudar!\n");
			break;
		case 10:
			separacaoComLinhas();
			System.out.println(
					"\nApós tantas horas de dedicação nos estudos essa é a hora para mostrar o que você realmente sabe! Hoje teremos a PROVA 2 que irá aborar todo o conteúdo do semestre, \n\n"
							+ "Boa sorte! " + dadosJogador[0] + "\n");
			break;
		case 11:
			resultadoProvas = provas(2);
			separacaoComLinhas();
			System.out.println("A nota da sua prova 2 foi: " + resultadoProvas);
			separacaoComLinhas();
			break;
		}
		return resultadoProvas;
	}

	// funcao continuar jogando.
	// funcao continuar jogando.
	static void continuarJogando() {

		int opcao = 0;

		System.out.println("Digite [1] para continuar");

		while (opcao != 1) {
			opcao = grava.nextInt();
			if (opcao == 1) {
				break;
			} else {
				System.out.println("Opcão inválida! " + "Digite Novamente:\n");

			}
		}
	}

	// funcao para escolher se vou fazer ou não as ADOS.

	// ACHO QUE VOU TER QUE FAZER UMA VARIAVEL DE RESULTADO PARA COLHER E JOGAR NO
	// MAIN
	// escolher ou nao fazer as ADOS.
	static int escolhaAdos(int opcao) {
		int resultado = 0;

		switch (opcao) {
		case 1:
			System.out.println("Deseja realizar a ADO 1? (Digite [1] para SIM | Digite [2] para NÃO)");
			int escolha = grava.nextInt();
			if (escolha == 1) {
				resultado = ados(1);
				if (resultado == 2) {
					System.out.println("[Parabéns você acertou a ADO 1!]\n");
				} else {
					System.out.println("[Você errou a ADO 1]\n");
				}
				contadorFrenquencia = contadorFrenquencia + 1;
			} else {
				System.out.println("[Você Tirou 0 pontos na ADO 1]\n");
			}
			break;
		case 2:
			System.out.println("Deseja realizar a ADO 2? (Digite [1] para SIM | Digite [2] para NÃO)");
			int escolha2 = grava.nextInt();
			if (escolha2 == 1) {
				resultado = ados(2);
				if (resultado == 2) {
					System.out.println("[Parabéns você acertou a ADO 2!]\n");
				} else {
					System.out.println("[Você errou a ADO 2]\n");
				}
				contadorFrenquencia = contadorFrenquencia + 1;
			} else {
				System.out.println("[Você Tirou 0 pontos na ADO 2]\n");
			}
			break;
		case 3:
			System.out.println("Deseja realizar a ADO 3? (Digite [1] para SIM | Digite [2] para NÃO)");
			int escolha3 = grava.nextInt();
			if (escolha3 == 1) {
				resultado = ados(3);
				if (resultado == 2) {
					System.out.println("[Parabéns você acertou a ADO 3!]\n");
				} else {
					System.out.println("[Você errou a ADO 3]\n");
				}
				contadorFrenquencia = contadorFrenquencia + 1;
			} else {
				System.out.println("[Você Tirou 0 pontos na ADO 3]\n");
			}
			break;
		case 4:
			System.out.println("Deseja realizar a ADO 4? (Digite [1] para SIM | Digite [2] para NÃO)");
			int escolha4 = grava.nextInt();
			if (escolha4 == 1) {
				resultado = ados(4);
				if (resultado == 2) {
					System.out.println("[Parabéns você acertou a ADO 4!]\n");
				} else {
					System.out.println("[Você errou a ADO 4]\n");
				}
				contadorFrenquencia = contadorFrenquencia + 1;
			} else {
				System.out.println("[Você Tirou 0 pontos na ADO 4]\n");
			}
			break;
		case 5:
			System.out.println("Deseja realizar a ADO 5? (Digite [1] para SIM | Digite [2] para NÃO)");
			int escolha5 = grava.nextInt();
			if (escolha5 == 1) {
				resultado = ados(5);
				if (resultado == 2) {
					System.out.println("[Parabéns você acertou a ADO 5!]\n");
				} else {
					System.out.println("[Você errou a ADO 5]\n");
				}
				contadorFrenquencia = contadorFrenquencia + 1;
			} else {
				System.out.println("[Você Tirou 0 pontos na ADO 5]\n");
			}
			break;

		case 6:
			System.out.println("Deseja realizar a ADO 6? (Digite [1] para SIM | Digite [2] para NÃO)");
			int escolha6 = grava.nextInt();
			if (escolha6 == 1) {
				resultado = ados(6);
				if (resultado == 2) {
					System.out.println("[Parabéns você acertou a ADO 6!]\n");
				} else {
					System.out.println("[Você errou a ADO 6]\n");
				}
				contadorFrenquencia = contadorFrenquencia + 1;
			} else {
				System.out.println("[Você Tirou 0 pontos na ADO 6]\n");
			}
			break;
		}
		return resultado;
	}

	// Funcao principal que chama todas as funções.
	public static void main(String[] args) {
		double prova1 = 0, prova2 = 0, media = 0;
		int ado1 = 0, ado2 = 0, ado3 = 0, ado4 = 0, ado5 = 0, ado6 = 0;

		introducao();

		cadastroJogador();

		dialogos(1);
		continuarJogando();

		conteudoProgramatico();

		dialogos(2);
		continuarJogando();

		aulas(1);
		ado1 = escolhaAdos(1);

		dialogos(3);

		aulas(2);
		ado2 = escolhaAdos(2);

		dialogos(4);

		aulas(3);
		ado3 = escolhaAdos(3);

		dialogos(5);
		
		continuarJogando();
		prova1 = dialogos(6);

		dialogos(7);

		aulas(4);
		ado4 = escolhaAdos(4);

		dialogos(8);

		aulas(5);
		ado5 = escolhaAdos(5);

		dialogos(9);

		aulas(6);
		ado6 = escolhaAdos(6);

		dialogos(10);
		
		continuarJogando();
		prova2 = dialogos(11);

		media = media(prova1, prova2, ado1, ado2, ado3, ado4, ado5, ado6);

		resultadoSemestre(media);

		separacaoComLinhas();
	}
}
