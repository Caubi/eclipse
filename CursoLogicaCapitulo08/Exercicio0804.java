import java.util.Scanner;

public class Exercicio0804 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.print("Informe o número : ");
		Integer numero = scanner.nextInt();
		
		imprimirTabuada(numero, 0);
		
		scanner.close();
	}
	
	static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
		System.out.println( + multiplicando + " X " + multiplicador + " é igual a : " + multiplicando * multiplicador);
		
		if (++multiplicador < 10) {
			imprimirTabuada(multiplicando, multiplicador);
		}
		 
	}

}
