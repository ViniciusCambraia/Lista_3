import java.util.Scanner;

public class EX32 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float cidade, auto, acidentes,media_auto = 0, city1,city2,city3,city4 = 0,city5, maior=0,menor=0;
		
		for(int i=0;i<2;i++) {
		//cidade
			
			System.out.println("Informe o codigo da cidade: ");
			cidade=scan.nextFloat();
		//carro
			System.out.println("Informe o numero de automoveis (em 1999): ");
			auto=scan.nextFloat();
		//acidente
			System.out.println("Informe o numero de acidentes de transito com vitimas (em 1999)");
			acidentes=scan.nextFloat();
			if(i==0) {
				city1=acidentes/auto*100;
				maior=city1;
				menor=city1;
			}
			if(i==1) {
				city2=acidentes/auto*100;
				if(city2>maior) {
					maior=city2;
				}else {
					menor=city2;
				}
			}
			if(i==2) {
				city3=acidentes/auto*100;
				
				if(city3>maior) {
					maior=city3;
				}else {
					menor=city4;
			}
				}
				if(i==3) {
					city4=acidentes/auto*100;
					if(city4 > maior) {
						maior=city4;
					}else {
						menor=city4;
					}
				}
					if(i==4) {
						city5=acidentes/auto*100;
						if(city5>maior) {
							maior=city5;
						}else {
							menor=city5;
						}
					}
			media_auto+=media_auto;
			}
			
		System.out.printf("Maior indice: %.2f %n",maior,"%");
		System.out.printf("manor indice: %.2f %n",menor,"%");		
		
		
		scan.close();
	}			
		
}


