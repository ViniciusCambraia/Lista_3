import java.util.Scanner;
import java.text.NumberFormat;
public class EX333 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float divida=0,divida1=0;
		float parcela=0;
		float juros=0;
		System.out.println("Qual valor da sua divida? ");
		divida=scan.nextFloat();
		divida1=divida;
		System.out.println("Valor da Divida           Valor do Juros           Quantidade de parcelas           Valor das Parcelas");
		
		for(int i=1; i<13;i++) {
			System.out.print("     "+NumberFormat.getCurrencyInstance().format(divida));
			System.out.print("                             "+juros+"          ");
			parcela=divida/i;
			System.out.print("                   "+i+"                    ");
			System.out.println("      "+NumberFormat.getCurrencyInstance().format(parcela));
		
			
			
		if(i==2) {
				juros =(int)(divida1*0.1);
			}
			else if(i==5) {
				juros =(int)(divida1*0.15);
			}
			else if(i==8) {
				juros = (int)(divida1*0.2);
			}
			else if(i==11) {
				juros =(int)(divida1*0.25);		
				}
			divida = divida + juros;
		}
		
	
		scan.close();
	}
	

}
