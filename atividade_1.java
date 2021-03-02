import java.util.Scanner;

public class testeAula {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		double a = scan.nextDouble();
		
		System.out.println("Digite o valor de B:"); 
		double b = scan.nextDouble();
		
		System.out.println("Digite o valor de C:");
		double c = scan.nextDouble(); 
		 
		double delta = (b*b)-(4*a*c);
		
		System.out.printf("O valor de Delta é: %.5f \n", delta);
		
		if (a == 0 || delta < 0) {	
			System.out.print("Impossivel calcular a formula de Bhaskara\n");
			
        } else {
			double x1 = (double)(-b + Math.sqrt(delta)) / (2*a);
			System.out.printf("x1: %.5f", x1);
			
			double x2 = (double)(-b - Math.sqrt(delta)) / (2*a);
			System.out.printf("x2: %.5f", x2);		
		}
	}
}
