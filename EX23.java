import java.util.Scanner;
public class EX23 {
	public static void main (String[] args) {
	Scanner entrada =new Scanner(System.in);
	int alunos,turma,soma=0,media=0;
	
	System.out.print("QUal é a quantidade de turmas? ");
	turma = entrada.nextInt();
	
	for(int i =1; i<=turma;i++){	
		do {
		System.out.print("Qual é a quantidade de alunos da "+i+"º turma?");
		alunos=entrada.nextInt();
		if(alunos>40) {
			System.out.println("\nQuantidade acima de 40!...Digite novamente\n");
		}
		else{soma+=alunos;}
		}while(alunos>40);
	}
		media=soma/turma;
		System.out.println("A media de alunos por turma é: "+media);
		
		entrada.close();
	}
}
