import java.util.Scanner;

public class ValidaAposentadoria {
	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
	
	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;
	
	public static void main(String[] args) {
		
		System.out.println("### VAlide sua aposentadoria com Java ###");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a idade : ");
		Integer Idade = scanner.nextInt();
		
		System.out.print("Quantos anos de contribuiÁ„o : ");
		Integer Tempo = scanner.nextInt();
		
		Boolean temIdadeParaAposentar = Idade >= IDADE_MINIMA_PARA_APOSENTAR;
		
		Boolean temTempoParaAposentar = Tempo >= TEMPO_MINIMO_DE_CONTRIBUICAO;
		
		Boolean PodeAposentar = temIdadeParaAposentar && temTempoParaAposentar;
		
		if (PodeAposentar) {
			System.out.println("Voc  est· apto(a) para se aposentar !");
		}else {
			System.out.println("Voc  n„o est· apto(a) para se aposentar !");
		}
		
		scanner.close();
	}
}
