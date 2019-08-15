import java.util.Scanner;

public class EX29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,c,t ;
		System.out.println("Mostrar a tabuada de: ");
		n = scan.nextInt();
		System.out.println("Comecar em: ");
		c=scan.nextInt();
		System.out.println("Terminar em: ");
		t=scan.nextInt();
		System.out.println("Vou montar a tabuada de 5 começando em "+ c +" e terminando em "+ t +":");
		for(; c <= t; ) {
			System.out.println(n+" x "+c+" = "+(n*c));
			c++;
		}
		scan.close();
	}

}
