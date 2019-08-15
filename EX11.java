import java.util.Scanner;
public class EX11 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n, par=0, impar=0;
		for(int i = 0; i<10;i++) {
			System.out.println("Informe um número: ");
			n=scan.nextInt();
			if(n%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("pares: " + par);
		System.out.println("Impares: "+impar);
		scan.close();
	}
}
