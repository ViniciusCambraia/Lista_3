import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1,n2,soma=0;
		System.out.println("Digite o primeiro numero: ");
		n1=scan.nextInt();
		System.out.println("Digite segundo numero: ");
		n2=scan.nextInt();
		for(;(n1)<n2;){
			System.out.println(n1+1);
			soma += n1;
			n1++;
		}
		soma += n2;
		if(n2<n1) {
			for(;(n2+1)<n1;) {
				System.out.println(n2+1);
				soma += n2;
				n2++;
			}
		}soma += n2;
		
		System.out.println("Soma: "+soma);
		scan.close();

	}

}
