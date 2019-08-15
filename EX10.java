import java.util.Scanner;
public class EX10 {
	public static void main (String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int b, e, r=0;
		System.out.println("Informe a base: ");
		b=scan.nextInt();
		System.out.println("Agora informe o expoente: ");
		e=scan.nextInt();
		r=b;
		for(int i=1; i < e;i++) {
				r=r*b;
		}
		System.out.println("O resultado é: "+r);
		
		scan.close();
	}
}
