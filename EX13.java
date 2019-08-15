import java.util.Scanner;

public class EX13 {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num1 = entrada.nextInt();
        int fat2 = num1;

        for (int i = 1;i < num1;i++) {
            fat2 = fat2 * (num1 - i);
        }
        System.out.print("\nO fatorial de "+num1+" é: "+fat2);
    
		
		entrada.close();
	}
}
