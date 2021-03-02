import java.util.Scanner;

public class testeAula {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int a = scan.nextInt();
		
		System.out.println("Digite o valor de B:");
		int b = scan.nextInt();
		
		System.out.println("Digite o valor de C:");
		int c = scan.nextInt();
		
		int quadrada = (int) Math.sqrt(b);
		int delta = quadrada-4*(a*c);
		
		System.out.println("O valor de Delta é: " + delta + "\n");
		
		System.out.println("Os valores de Bhaskara: ");
		System.out.println("x1: " + (-b+delta) / 2*a);
		System.out.println("x2: " + (-b-delta) / 2*a);		
		
	}
}
