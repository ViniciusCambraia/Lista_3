import java.util.Scanner;
public class EX17 {
	public static void main(String[]args){
		Scanner scan =new Scanner (System.in);
		int n;
		System.out.println("Digite um numero: ");
		n =scan.nextInt();
		
		int cont=0;
		
		if(n==1) {
			System.out.println("O numero não é primo");
		}
		else {
			for(int i=2; i<n; i++) {
				if(n % i==0) {
				cont++;
				}
			}
		}
		if(cont == 0) {
			System.out.println("O numero é primo");
		}else {
			System.out.println("O numero não é primo");
		}
		scan.close();
	}
}
