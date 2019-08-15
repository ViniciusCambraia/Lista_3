import java.util.Scanner;

public class EX22 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int voto,votante, candidato1=0,candidato2=0,candidato3=0;
		System.out.print("Quantos votantes são? ");
		votante = scan.nextInt();
		for(int i = 0; i<votante; i++) {
			do {
			System.out.println("Escolha seu candidato:\n1- João Goiaba\n2- Jorge Euclides\n3- Parmênides");
			voto=scan.nextInt();
			if(voto!=1&&voto!=2&&voto!=3) {
				System.out.println("Valor incorreto");
			}
			if(voto==1) {
				candidato1++;
			}
			else if(voto==2) {
				candidato2++;
			}
			else {
				candidato3++;
			}
			
			}while(voto!=1 && voto!=2 && voto!=3);
		}
		System.out.println("Candidato João Goiaba recebeu "+candidato1+" votos");
		System.out.println("Candidato Jorge Euclides recebeu "+candidato2+" votos");
		System.out.println("Candidato Parmênides recebeu "+candidato3+" votos");
		
		
		scan.close();
	}

}
