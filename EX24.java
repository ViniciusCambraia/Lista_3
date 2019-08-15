import java.util.Scanner;

public class EX24 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int cd;
		float valor, valormedio=0;
		float media=0;
		System.out.println("Quantos CD's são: ");
		cd=scan.nextInt();
		if(cd!=0) {
			System.out.println("Agora informe o valor de cada um deles: ");
			for(int i=0;i<cd;i++) {
				System.out.println("insira o valor: ");
				valor=scan.nextFloat();
				media += valor;
			}
			valormedio=media/cd;
		}
		System.out.println("Foi investido: "+media+"R$");
		System.out.println("O valor medio dos Cd's é: "+ valormedio+"R$");
		scan.close();
	}
}
