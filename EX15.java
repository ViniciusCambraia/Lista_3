import java.util.Scanner;

public class EX15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 37, b = 38, c = 1;
		while (c <= 37) {
			System.out.println("(" + a + "*" + b + ")/" + c + "=" + (a * b) / c);
			a--;
			b--;
			c++;
		}
		scan.close();
	}
}