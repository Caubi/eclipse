import java.util.Scanner;

public class AlterandoValorVariavel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto : ");
		Double ValorProduto = scanner.nextDouble();
		
		System.out.println("Digite o tipo de pagamento [1 = á vista / 2 = a prazo] : ");
		Integer TipoPagamento = scanner.nextInt();
		
		Boolean  pagamentoAvista = TipoPagamento.equals(1);
		
		Double juros = 0.0;
		
		if (pagamentoAvista) {
			
		}else {
			juros = 10.0; 
		}
		Double Acrescimo = ValorProduto * juros / 100;
		
		Double ValorTotal = Acrescimo + ValorProduto;
		
		System.out.println("Valor total:" + ValorTotal);
				
		scanner.close();
	}
}
