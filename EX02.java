import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		String usuario;
		String senha;
		System.out.println("Informe o Nome de Usuario:");
		usuario = entrada.nextLine();
		System.out.println("Informe sua senha: ");
		senha = entrada.nextLine();
		
		while(((usuario).equalsIgnoreCase(senha))) {
			System.out.println("Erro! Nome de Usuario e senha iguais\nInforme o Nome de Usuario novamente:");
		usuario = entrada.nextLine();
		System.out.println("Informe sua senha: ");
		senha = entrada.nextLine();
		
		}
			entrada.close();
	}
		
}
