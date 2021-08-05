import java.util.Scanner;

public class Exercicio0803 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double numeroEsquerda = informeNumero(scanner);
		
		Imprimir();
		
		Integer operacao = escolhaAOperacao(scanner);
		
		Imprimir();
		
		Double numeroDireita = informeNumero(scanner);
		
		Imprimir();
		
		Double resultado = RealizarCalculo(operacao, numeroEsquerda, numeroDireita);
		
		System.out.println("O resultado da operação é : " + resultado);
		
		scanner.close();
	}
	
	static Double informeNumero(Scanner scanner) {
		System.out.print("Informa o número : ");
		return scanner.nextDouble();
	}
	
	static Integer escolhaAOperacao(Scanner scanner) {
		
		System.out.println("ESCOLHA A OPERAÇÃO : ");
		
		String[] operacoes = new String[]{"Adição", "Subtração", "Divisão", "Multiplicação"};
		
		for (int i = 0; i < operacoes.length; i++) {
			System.out.println( "[" + i + "]" + operacoes[i]);
		}
		
		System.out.print("Digite a operacao : ");
		return scanner.nextInt();
		
	}
	
	static Double RealizarCalculo(Integer operacao, Double numeroEsquerda, Double numeroDireita) {
		Double resultado = null;
		
		switch (operacao) {
		case 0:
			resultado = OperacaoAdicao(numeroEsquerda, numeroDireita);
			break;
		
		case 1:
			resultado = OperacaoSubtracao(numeroEsquerda, numeroDireita);
			break;
		
		case 2:
			resultado = OperacaoDivisao(numeroEsquerda, numeroDireita);
			break;
		
		case 3:
			resultado = OperacaoMultiplicacao(numeroEsquerda, numeroDireita);
			break;
		
		default:
			System.err.print("Escolha uma opção Válida");
			System.exit(0);
		}
		
		return resultado;
	}
	
	static Double OperacaoAdicao(Double numero1, Double numero2) {
		return numero1 + numero2;
		
	}
	
	static Double OperacaoSubtracao(Double numero1, Double numero2) {
		return numero1 - numero2;
	}
	
	static Double OperacaoDivisao(Double numero1, Double numero2) {
		return numero1 / numero2;
	}
	
	static Double OperacaoMultiplicacao(Double numero1, Double numero2) {
		return numero1 * numero2;
	}
	
	static void Imprimir() {
		System.out.println("-------------------------------");
	}

}
