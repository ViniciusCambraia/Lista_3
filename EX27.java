import java.util.Scanner;

public class EX27 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		float valor, valor_total=0, cash, troco;
		
		
		do {
		System.out.print("Informe o valor da mercadoria: ");		
		valor=scan.nextInt();
		valor_total += valor;
		
		if(valor==0) {
			System.out.println("O valor da compra foi: R$"+valor_total);
			System.out.println("Qual foi a quantidade de dinheiro entrege? ");
			cash=scan.nextInt();
			troco = cash - valor_total;
			System.out.println("O troco é de: "+troco);
		}
			
		}while(valor!=0);
		
		
		scan.close();
	}
}
