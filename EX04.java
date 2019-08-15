    
import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float pais_a = 80000;
		float pais_b = 200000;
		int ano = 0; 
		
		while(pais_a <= pais_b) {
			pais_a = (float) (pais_a + (pais_a * 0.03));
			System.out.println(pais_a);
			pais_b = (float) (pais_b + (pais_b* 0.015));
			System.out.println(pais_b);
			System.out.println(+ano);
			ano++;	
		}
	System.out.println("Foi necessario de" +ano+" Anos para que o Pais A passasse o Pais B");
	
	}

}
