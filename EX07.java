import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1;
		int n2;
		System.out.println("Digite o primeiro numero: ");
		n1=scan.nextInt();
		System.out.println("Digite segundo numero: ");
		n2=scan.nextInt();
		for(;(n1+1)<n2;){
			System.out.println(n1+1);
			n1++;
		}
		if(n2<n1) {
			for(;(n2+1)<n1;) {
				System.out.println(n2+1);
				n2++;
			}
		}
		scan.close();

	}

}
