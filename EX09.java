import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n ;
		System.out.println("Mostrar a tabuada de: ");
		n = scan.nextInt();
		System.out.println("Tabuada do: "+n);
		for(int i=1; i<11;i++ ) {
			System.out.println(n+" x "+i+" = "+ (n*i));
		}
		scan.close();
	}

}
