import java.util.Scanner;

public class CalculoQuadrado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("C�LCULO DO QUADRADO PERFEITO");
		
		System.out.print("Informe o n�mero : ");
		Double numero = scanner.nextDouble();
		
		Double quadrado = (numero * numero);
		
		System.out.println("O quadrado de " + numero + " � igual a : " + quadrado + ".");
		
		scanner.close();
	}
}