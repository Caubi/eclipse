import java.util.Scanner;

public class GastoFamiliar {
	public static void main(String[] args) {
		System.out.println("### Gasto Familiar###");
		 
		Scanner scanner = new Scanner(System.in);
		
		Double ValorTotal = 0.0;
		
		System.out.print("Qual o valor da sua conta de luz : ");
		ValorTotal += scanner.nextDouble();
		
		System.out.print("Qual o valor da sua conta de água : ");
		ValorTotal += scanner.nextDouble();
		
		System.out.print("Qual o valor da sua conta de Telefone : ");
		ValorTotal += scanner.nextDouble();
		
		System.out.print("Qual o valor da sua conta da escola do Filho  : ");
		ValorTotal += scanner.nextDouble();
		
		System.out.print("Qual o valor da sua fatura do cartão : ");
		ValorTotal += scanner.nextDouble();
		
		System.out.print("Qual o valor dos gastos supermercado : ");
		ValorTotal += scanner.nextDouble();
		
		System.out.println("O valor total das contas é igual a : " + ValorTotal);
		
		scanner.close();
	}
}
