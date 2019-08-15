import java.util.Scanner;

public class EX16 {
	public static void main(String[]args) {
		Scanner scan =new Scanner(System.in);
		int a;
		int maior=0;
		int menor=0;
		int soma = 0;
		System.out.println("Quantos numeros serao digitados? ");
		a=scan.nextInt();
		int n[] = new int[a];
		for (int i = 0; i < a; i++) {
			System.out.println("Informe o número");
			n[i]=scan.nextInt();
			soma += n[i];
			if (i==0){
				maior = n[0];
			}
			else if(n[i]>maior) {
				menor=maior;
				maior = n[i];
			}
			else if(n[i]< menor) {
				menor = n[i];
			}
		}
		System.out.println("Maior numero: "+maior);
		System.out.println("Menor numero: "+menor);
		System.out.println("Soma dos numeros: "+soma);
		
		scan.close();
	}
}
