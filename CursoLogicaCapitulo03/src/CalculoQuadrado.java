import java.util.Scanner;

public class CalculoQuadrado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CÁLCULO DO QUADRADO PERFEITO");
		
		System.out.print("Informe o número : ");
		Double numero = scanner.nextDouble();
		
		Double quadrado = (numero * numero);
		
		System.out.println("O quadrado de " + numero + " é igual a : " + quadrado + ".");
		
		scanner.close();
	}
}