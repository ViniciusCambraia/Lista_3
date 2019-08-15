import java.util.Scanner;
public class EX20 {
	public static void main(String[] arg) {
		Scanner scan= new Scanner(System.in);
		int n;
		int nota;
		float media=0;
		System.out.println("Quantas notas são? ");
		n = scan.nextInt();
		for(int i =0; i < n;i++) {
			System.out.println("Digite a nota: ");
			nota=scan.nextInt();
			media+=nota;
		}
		media= media/n;
		System.out.println("A media é: "+media);
		scan.close();
	}
}
