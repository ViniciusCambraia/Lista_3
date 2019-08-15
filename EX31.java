import java.util.Scanner;

public class EX31 {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 int baixo = 0, num, alto =0;
	 float alt,maior=0,menor=0;
	 
	 for(int i=0; i < 10; i++) {
		 System.out.print("Informe o numero do aluno: ");
		 num=scan.nextInt();
		 System.out.print("Informe a altura em centimetros: ");
		 alt=scan.nextFloat();
		 	if(i==0) {
		 		maior = alt;
		 		alto = num;
		 		menor = alt;
		 		baixo = num;
		 	}else if(alt > maior) {
			   maior = alt;
			   alto = num;
		   }else if(alt< menor) {
			   menor=alt;
			   baixo=num;
		   }
	 
	 }		
	System.out.println("O numero do aluno mais alto é: "+alto+" E sua altura é: "+maior+"cm");
	System.out.println("O numero do aluno menor é: "+baixo+" E sua altura é: "+menor+"cm");
	 
	 scan.close();
	}

}
