import java.util.Scanner;

public class EX12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n ;
		int sq=0;
		int ant=1;
		System.out.println("Informe até que termo a chegara a sequencia: ");
		n = scan.nextInt();
		System.out.println("Sua sequencia: ");
		for (int i = 0; i < n; i++) {
			System.out.println(ant);
			ant=sq+ant;
			sq=ant-sq;
		}
		scan.close();
	}

}
