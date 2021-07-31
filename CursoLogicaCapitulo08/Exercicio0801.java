import java.util.Scanner;

public class Exercicio0801 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---------------------------------------");
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avançafo"};
		
		System.out.println("Escolha dentre os cursos abaixo: ");
		
		for(int i=0; i < cursos.length;i++) {
			System.out.println("[" + i + "] " + cursos[i]);
		}
		
		System.out.print("O cursos que você deseja é o :");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posisaoValidaCurso = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if(!posisaoValidaCurso) {
			EncerrarProgramaOpacaoInvalida();
		}
		
//		System.out.println("---------------------------------------");
		ImprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		for(int i=0; i < formasPagamento.length;i++) {
			System.out.println("[" + i + "] " + formasPagamento[i]);
		}
		System.out.println("Escolha a forma de pagamento: ");
		Integer posicaoFormasPagamentoEscolhida = scanner.nextInt();
		
		Boolean posisaoValidaPagamento = posicaoFormasPagamentoEscolhida >= 0 && posicaoFormasPagamentoEscolhida < formasPagamento.length;
		
		if(!posisaoValidaPagamento) {
			EncerrarProgramaOpacaoInvalida();
		}
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormasPagamentoEscolhida];
		
//		System.out.println("---------------------------------------");
		
		ImprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento foi : " + formaPagamentoEscolhida);
		
		scanner.close();

	}
	
	static void ImprimirTraco() {
		System.out.println("---------------------------------------");
	}
	
	static void EncerrarProgramaOpacaoInvalida() {
		System.err.println("Posicao inválida!");
		System.exit(1);

	}
}
