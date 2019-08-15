import java.util.Scanner;

public class EX18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num=0;
		System.out.println("Informe o numero: ");
		num=scan.nextInt();
		
		int cont= 0;
		
		if(num==1) {
			System.out.println("Esse numero não é Primo: ");
		}
		else {
			for(int i=2;i<num;i++) {
				if(num % i==0) {
					cont++;
					System.out.println("Divisivel por: "+i);
				}
			}if(cont==0){
			System.out.println("Esse numero é primo");
		}
		else{
			System.out.println("Esse numero não é primo");}
		}
		scan.close();
		}
	   
	}


