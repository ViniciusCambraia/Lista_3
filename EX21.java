import java.util.Scanner;
public class EX21 {
	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		int n=0,idade,media=0;
		System.out.println("Quantas pessoas deseja informar? ");
		n=scan.nextInt();
		for(int i =0;i<n;i++) {
			System.out.println("Informe sua idade");
			idade=scan.nextInt();
			media+=idade;
			}
		
		media= media/n;
		if(media>=0 && media<=25) {
				System.out.println("A turma é jovem de acordo com a media");
		}
		else if(media>=26 && media<=60) {
			System.out.println("A turma é adulta de acordo com a media");
		}
		else {
			System.out.println("A turma é idosa de acordo com a media");
		}
		scan.close();
	}

}
