import java.util.Scanner;

public class EX36 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int voto, candidato1=0,candidato2=0,candidato3=0,candidato4=0,nulo=0,branco = 0, cont=0;
			do {
			System.out.println("Escolha seu candidato:\n1- João Goiaba\n2- Jorge Euclides\n3- Parmênides\n4- Alex Lagartixa\n5- Voto Nulo\n6- Voto em Branco\n0- Para Sair");
			voto=scan.nextInt();
			
			
			
			if(voto!=0&&voto!=1&&voto!=2&&voto!=3&&voto!=4&&voto!=5&&voto!=6) {
				System.out.println("Valor incorreto");
			}else {
				cont++;
			}
			if(voto==1) {
				candidato1++;
			}
			else if(voto==2) {
				candidato2++;
			}
			else if(voto==3) {
				candidato3++;
			}
			else if(voto==4) {
				candidato4++;
			}
			else if(voto==5) {
				nulo++;
			}
			else if(voto==6) {
				branco++;
			}

			}while(voto!=0);
			System.out.println("Candidato João Goiaba recebeu "+candidato1+" votos");
			System.out.println("Candidato Jorge Euclides recebeu "+candidato2+" votos");
			System.out.println("Candidato Parmênides recebeu "+candidato3+" votos");
			System.out.println("Candidato Alex Lagartixa recebeu "+candidato4+" votos");
			System.out.println("O total de votos nulos é: "+ nulo);
			System.out.println("O total de votos em branco é: "+branco);
			System.out.println("A percentagem de votos nulos sobre o total de votos é: "+nulo/cont*100+"%");
			System.out.println("A percentagem de votos em branco sobre o total de votos é: "+branco/cont*100+"%");
			System.out.println("###############################################################################");
		
		scan.close();
	}

}