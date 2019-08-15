import java.util.Scanner;

public class EX14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n=1;
		int m=1;
		
		System.out.println("Quantos termos deseja que sejam impressos? ");
		int nt=scan.nextInt();
		for (int i = 0; i < nt ; i++) {
			System.out.println(n +"/"+ m);
			n++;
			m+=2;
		}
		scan.close();
	}

}
