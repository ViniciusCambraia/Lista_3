import java.util.Scanner;

public class EX37 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String ques1 = " ", ques2 = " ", ques3 = " ", ques4 = " ", ques5 = " ", ques6 = " ", ques7 = " ", ques8 = " ",ques9 = " ", ques10 = " ";
		String Q1 = " ",Q2 = " ",Q3 = " ",Q4 = " ",Q5 = " ",Q6 = " ",Q7 = " ",Q8 = " ",Q9 = " ",Q10 = " ";
		
		int maioracerto = 0, menoracerto = 0, nalunos = 0; 
		float mediaturma = 0;
		
		boolean outro = false, fi = true, prof = false;
		int acertos = 0;
		
		System.out.println("Você é o Professor? Y or N ");
		String resposta = entrada.next();
		
		if("Y".equalsIgnoreCase(resposta)) {
			prof = true;
		}
		
		while(prof == true) {
			
			System.out.println("Insira o gabarito da Prova");
			System.out.println("Informar as Resposta assim: A - B - C - D - E");
			
			System.out.println("\nResposta Q1: ");
			Q1 = entrada.next();
		
			System.out.println("Resposta Q2: ");
			Q2 = entrada.next();
			
			System.out.println("Resposta Q3: ");
			Q3 = entrada.next();
			
			System.out.println("Resposta Q4: ");
			Q4 = entrada.next();
		
			System.out.println("Resposta Q5: ");
			Q5 = entrada.next();
		
			System.out.println("Resposta Q6: ");
			Q6 = entrada.next();
			
			System.out.println("Resposta Q7: ");
			Q7 = entrada.next();
			
			System.out.println("Resposta Q8: ");
			Q8 = entrada.next();
			
			System.out.println("Resposta Q9: ");
			Q9 = entrada.next();
			
			System.out.println("Resposta Q10: ");
			Q10 = entrada.next();
			
			prof = false;
			outro = true;
		}
			
		while (outro != false) {

			System.out.println(" -== Prova ==-");
			System.out.println(" ");
			acertos = 0;

			System.out.println("1- Quantos minutos tem em três horas? (R: 180 minutos) "); // ( A )
			System.out.println("\nA - 180 min \nB - 150 min  \nC - 170 min \nD - 140 min \nE - 90 min");
			ques1 = entrada.next();

			if (Q1.equalsIgnoreCase(ques1))
				acertos++;

			System.out.println("2- Quantos filmes há numa trilogia?"); // ( B )
			System.out.println("\nA - 1 \nB - 3 \nC - 2 \nD - 4 \nE - Todas as Alternativas anteriores");
			ques2 = entrada.next();

			if (Q2.equalsIgnoreCase(ques2))
				acertos++;

			System.out.println("3- A europa fica localizada em qual continente ?"); // ( C )
			System.out.println(
					"\nA - Austrália \nB - América \nC - Continente Europeu \nD - África \nE - Todas as Alternativas anteriores");
			ques3 = entrada.next();

			if (Q3.equalsIgnoreCase(ques3))
				acertos++;

			System.out.println("4- Quantas estrelas tem um Cruzeiro de Cinco Estrelas?"); // ( D )
			System.out.println("\nA - 4 \nB - 3 \nC - 1 \nD - 5 \nE - Todas as Alternativas anteriores");
			ques4 = entrada.next();

			if (Q4.equalsIgnoreCase(ques4))
				acertos++;

			System.out.println("5- Quantos anos tem 15 anos?"); // ( E )
			System.out.println(
					"\nA - 12 Anos \nB - 30 Anos  \nC - 57 Anos \nD - Todas as Alternativas anteriores \nE - 15 Anos ");
			ques5 = entrada.next();

			if (Q5.equalsIgnoreCase(ques5))
				acertos++;

			System.out.println("6- Quais das estações do ano são corretas?"); // ( E )
			System.out.println(
					"\nA - Primavera \nB - Verão \nC - Outono \nD - Inverno \nE - Todas as Alternativas anteriores");
			ques6 = entrada.next();

			if (Q6.equalsIgnoreCase(ques6))
				acertos++;

			System.out.println("7- Como se chama Pão em português?"); // ( D )
			System.out.println("\nA - Arroz \nB - Bread \nC - Pon \nD - Pão \nE - Todas as Alternativas anteriores");
			ques7 = entrada.next();

			if (Q7.equalsIgnoreCase(ques7))
				acertos++;

			System.out.println("8- Um relógio de ponteiros, além das horas, marca o que mais?"); // ( C )
			System.out.println(
					"\nA - Minutes \nB - Segundos \nC - Minutos \nD - Bacia \nE - Todas as Alternativas anteriores");
			ques8 = entrada.next();

			if (Q8.equalsIgnoreCase(ques8))
				acertos++;

			System.out.println("9 - Quem é o personagem do folclore brasileiro conhecido só ter uma perna?"); // ( B )
			System.out.println(
					"\nA - Aleijadinho \nB - Saci \nC - Centopeia \nD - Saboneteira \nE - Todas as Alternativas anteriores");
			ques9 = entrada.next();

			if (Q9.equalsIgnoreCase(ques9))
				acertos++;

			System.out.println("10 - Quantos meses tem 1 mês?"); // ( A )
			System.out.println(
					"\nA - 1 Mês \nB - 365 dias \nC - Abelha \nD - Batata Oriental \nE - Todas as Alternativas anteriores");
			ques10 = entrada.next();

			if (Q10.equalsIgnoreCase(ques10))
				acertos++;

			System.out.println("Gabarito da Prova: \n01 = A \n02 = B \n03 = C \n04  D \n05  E \n06 = E \n07 = D \n08 = C \n09 = B \n10 = A");
			System.out.println("\nVocê teve "+acertos+" de 10 questões.");
			
			if(fi == true) {
				menoracerto = acertos;
				maioracerto = acertos;
				fi = false;
			}
			if(acertos < menoracerto) {
				menoracerto = acertos;
			}else if (acertos > maioracerto) {
				maioracerto = acertos;
			}
			
			mediaturma = mediaturma + acertos;
			nalunos++;
			
			System.out.println("Outro aluno vai utilizar?  Y or N");
			String outro1 = entrada.next();
			
			if ("N".equalsIgnoreCase(outro1))
				outro = false;
			
		}
			System.out.println("Maior acerto da turma: "+maioracerto);
			System.out.println("Menor acerto da turma: "+menoracerto);
			System.out.println("Total de alunos que utilizaram o sistema: "+nalunos);
			System.out.println("A Média das Notas da Turma:"+(mediaturma / nalunos));
			
			entrada.close();
	}

}