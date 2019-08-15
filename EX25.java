import java.util.Scanner;

public class EX25 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float price=(float) 1.99;
		int p=1;
		System.out.println("Loja Quase Dois - Tabela de preços");
		
		for(int i=0;i<50;i++) {
			
		System.out.printf(p+"- R$ %.2f %n",price);
		price += 1.99;
		p++;
		}
		scan.close();
	}

}
