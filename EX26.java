import java.util.Scanner;

public class EX26 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int p=1;
		float l=0;
		float price;
		System.out.print("Informe o preço do pão: ");
		price=scan.nextFloat();
		l=price;
		System.out.println("Loja Quase Dois - Tabela de preços");
		for(int i=0;i<50;i++) {
			
			System.out.printf(p+"- R$ %.2f %n",l);
			l = l+ price;
			p++;
		}
		scan.close();
	}

}