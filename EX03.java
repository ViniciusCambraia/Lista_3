import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
	 Scanner entrada= new Scanner(System.in);
	 String nome;
	 int idade;
	 float salario;
	 String sexo;
	 
	 do {
		 System.out.println("Digite o nome: ");
		 nome = entrada.nextLine(); 
		 if(nome.length()<=3) {
			 System.out.println("Nome invalido:");	
     }
	}while(nome.length()<=3);
	 do {
		 System.out.println("Digite a idade:");
		 idade = entrada.nextInt();
		 if(idade<0 || idade>150) {
		 System.out.println("Idade inválida: ");
		 }
	 }while(idade<0 || idade>150);
	 do {
		 System.out.println("Informe seu salario: ");
		 salario = entrada.nextFloat();
		 if(salario<=0) {
			 System.out.println("Valor invalido");
			 
		 }
	 }while(salario <=0);
	 do {
		 System.out.println("Infome seu sexo (F / M):");
		 sexo = entrada.nextLine();
		 
		 if("f".equalsIgnoreCase(sexo)&&("m".equalsIgnoreCase(sexo))) {
			 System.out.println("Valor invalido: ");
		 }
		 
		 }while("f".equalsIgnoreCase(sexo)&&("m".equalsIgnoreCase(sexo)));
		 
	 
	 
	 entrada.close();
	}
}