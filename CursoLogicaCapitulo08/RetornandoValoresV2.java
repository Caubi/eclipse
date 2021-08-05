import java.util.Scanner;

public class RetornandoValoresV2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("---------------------------------------");
		ImprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avançafo"};
		
		imprimirTexto("Escolha dentre os cursos abaixo: ");
		
		interarEExibirPosicoesDoVetorString(cursos);
		
		Integer posicaoCursoEscolhido = receberNumeroInteriroDoUsuario("O curso que você escolheu é o : ", scanner);
		
		Boolean posisaoValidaCurso = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos);
		
		if(!posisaoValidaCurso) {
			EncerrarProgramaOpacaoInvalida();
		}
		
//		System.out.println("---------------------------------------");
		ImprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		imprimirTexto("Escolha dentre as formas de Pagamento :");
		
		interarEExibirPosicoesDoVetorString(formasPagamento);

		Integer posicaoFormasPagamentoEscolhida = receberNumeroInteriroDoUsuario("Sua forma de pagamento escolhido é : ", scanner);
		
		Boolean posisaoValidaPagamento = verificarPosicaoEscolhidaPeloUsuario(posicaoFormasPagamentoEscolhida, formasPagamento);
		
		if(!posisaoValidaPagamento) {
			EncerrarProgramaOpacaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormasPagamentoEscolhida];
		
//		System.out.println("---------------------------------------");
		ImprimirTraco();
		
		imprimirTexto("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento foi : " + formaPagamentoEscolhida);
		
		scanner.close();

	}
	
	static Integer receberNumeroInteriroDoUsuario(String texto, Scanner scanner) {
		imprimirEContinuarNaMesmaLinha(texto);
		Integer numero = scanner.nextInt();
		
		return numero;
	}
	
	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}
	
	static void imprimirTexto(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.println(texto);
	}
	
	static void interarEExibirPosicoesDoVetorString(String[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);
		}
	}
	
	static void ImprimirTraco() {
		System.out.println("---------------------------------------");
	}
	
	static void EncerrarProgramaOpacaoInvalida() {
		System.err.println("Posicao inválida!");
		System.exit(1);

	}
}
