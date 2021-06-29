import java.util.Scanner;

public class CalcularValorTroco {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			  
			System.out.print("Digite o valor do produto: ");
			Double valorProduto = scanner.nextDouble();
			
			System.out.print("Digite a quantidade passada pelo cliente: ");
			Double valorPassadoPeloCliente = scanner.nextDouble();
			
			Double resultado = (valorProduto - valorPassadoPeloCliente);
			System.out.println("Valor do troco é igual a: " + resultado);
		
		scanner.close();	
	}

}