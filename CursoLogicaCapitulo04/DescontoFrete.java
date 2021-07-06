import java.util.Scanner;

public class DescontoFrete {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("##### DESCONTO DE FRETE DE COMPRA #####");
		System.out.print("Digite o valor do produto : ");
		Double ValorProduto = scanner.nextDouble();
		
		Boolean precisaCobrarFrete = ValorProduto < 100;
		
		Double valorFinal = ValorProduto;
		
		if (precisaCobrarFrete) {
				valorFinal += 15.0;
		}
		
		System.out.println("O valor final é igual a : " + valorFinal);
		
		scanner.close();
	}
}
