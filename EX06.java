import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		for(int i =0; i<=50;i++) {
			if(i % 2!=0) {
				System.out.println(i+" ");
			}
		}
		scan.close();
	}

}
