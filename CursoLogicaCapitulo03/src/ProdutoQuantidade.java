import java.util.Scanner;

public class ProdutoQuantidade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("APLICA��O DE PRODUTO E PRE�O");
		
		System.out.print("Digite o valor do produtos : ");
		Double Valueprodutos = scanner.nextDouble();
		
		System.out.print("Digite a quantidade dos produtos : ");
		Integer qtdprodutos = scanner.nextInt();
		
		Double ValorTotal = (qtdprodutos * Valueprodutos);
		
		Boolean qtdMaiorOuIgualDez = qtdprodutos >= 10;
		
		Double percentualDesconto = 0.0; 
				
		
		if (qtdMaiorOuIgualDez) {
			percentualDesconto = 10.0;
		}
		
		Double desconto = ValorTotal * percentualDesconto / 100;
		
		Double ValorTotalComDesconto = ValorTotal - desconto;
		
		
		System.out.println("O valor total � igual a : "  + ValorTotalComDesconto);
		
		scanner.close();
	}
}
