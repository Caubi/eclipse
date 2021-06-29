import java.util.Scanner;

public class CalcularImc {
	public static void main(String[] args) {
	
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("CÁLCULO DO ÍNDICE DE MASSA CORPORAL");
		
		System.out.print("Digite o valor da sua altura : ");
		Double ValorAltura = scanner.nextDouble();
		
		System.out.print("Digite o valor do seu peso : ");
		Double ValorPeso = scanner.nextDouble();
		
		Double ValorIMC = (ValorPeso / (ValorAltura * ValorAltura) );
		
		System.out.println("O seu IMC é igual a : " + ValorIMC);
		
		scanner.close();
	
	}
}
