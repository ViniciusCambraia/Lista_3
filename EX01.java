import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int nota;
		System.out.println("Insira uma nota entre 0 e 10: ");
		nota = entrada.nextInt();
		if (nota>=0 && nota<=10) {
			System.out.println("Valor valido");
		}
		else {
		do {
		System.out.println("Valor invalido");
		nota = entrada.nextInt();
		}while(nota<0 || nota > 10);
		}
	entrada.close();	
	}
}
