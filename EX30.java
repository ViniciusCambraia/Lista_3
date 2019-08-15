import java.util.Scanner;

public class EX30 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		float altura=0, peso=0, alto=0, baixo=48561,media_altura=0,media_peso=0, gordo=0, magro=1230;
		int codigo=1, maior=0, menor=0, gg = 0,mm=0;
		
		
		while(codigo!=0) {
			System.out.println("Informe seu codigo: \nSe quiser sair digite: 0 ");
			codigo=scan.nextInt();
			if(codigo!=0) {
			System.out.println("Informe sua altura: ");
			altura=scan.nextFloat();
			media_altura+=altura;
				
				if(altura>alto) {
					alto=altura;	
					maior=codigo;
			}	
				else if(altura<baixo) {
					baixo=altura;
					menor=codigo;
						
			}
			System.out.println("Informe seu peso: ");
			peso=scan.nextFloat();
			media_peso+=peso;
			
			if(peso>gordo) {
				gordo = peso;
				gg=codigo;
			}
			if(peso<magro) {
				magro = peso;
				mm=codigo;
			}
			}
				}
				System.out.println("Codigo do cliente mais alto é: "+maior+" e sua altura é: "+alto);
				System.out.println("Codigo do cliente mais baixo é: "+menor+" e Sua altura é: "+baixo);
				System.out.println("Codigo do cliente mais gordo é: "+gg+" seu peso é: "+gordo);
				System.out.println("Codigo do cliente mais magro é: "+mm+" seu peso é "+magro);
				System.out.println("Media de altura: "+media_altura);
				System.out.println("Media de peso: "+media_peso);
	scan.close();
	
			

}
}