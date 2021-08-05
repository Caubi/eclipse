import java.util.Scanner;

public class EscolhendoBonsNomes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ImprimirTraco();
		
		String cursoEscolhido = receberCursoDoUsuario(scanner);

		ImprimirTraco();
		
		String formaPagamentoEscolhida = receberFormasPagamento(scanner);
		
		ImprimirTraco();
		
		imprimirTexto("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento foi : " + formaPagamentoEscolhida);
		
		scanner.close();

	}
	
	static String receberFormasPagamento (Scanner scanner) {
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		imprimirTexto("Escolha dentre as formas de Pagamento :");
		
		interarEExibirPosicoesDoVetorString(formasPagamento);

		Integer posicaoFormasPagamentoEscolhida = receberIndiceValidoUsuario(formasPagamento, "O curso que você deseja é o : ", scanner);
		
		return formasPagamento[posicaoFormasPagamentoEscolhida];
	}
	
	static String receberCursoDoUsuario (Scanner scanner) {
		String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avançafo"};
		
		imprimirTexto("Escolha dentre os cursos abaixo: ");
		
		interarEExibirPosicoesDoVetorString(cursos);
		
		Integer posicaoCursoEscolhido = receberIndiceValidoUsuario(cursos, "O curso que você deseja é o : ", scanner);
		
		return cursos[posicaoCursoEscolhido];
	}
	
	static Integer receberIndiceValidoUsuario(String[] vetor, String texto, Scanner scanner) {
		Integer posicaoEscolhida = receberNumeroInteriroDoUsuario(texto, scanner);
		
		Boolean posisaoValidaCurso = verificarPosicaoEscolhidaPeloUsuario(posicaoEscolhida, vetor);
		
		if(!posisaoValidaCurso) {
			EncerrarProgramaOpacaoInvalida();
		}
		
		return posicaoEscolhida;
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
		interarEExibirPosicoesDoVetorString(vetor, 0);
	}
	
	static void interarEExibirPosicoesDoVetorString(String[] vetor, Integer i) {
		System.out.println("[" + i + "] " + vetor[i]);
		
		if (++i < vetor.length) {
			interarEExibirPosicoesDoVetorString(vetor, i);
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
