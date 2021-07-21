import java.util.Scanner;

public class Exercicio01 {
	
	public static final Integer NOTA_MINIMA = 60;
	public static final Integer NOTA_MINIMA_GERAL = 150;

	public static void main(String[] args) {
		
		System.out.println("VERIFICANDO SE TEM NOTA SUFICIENTE PARA CONCURSO.");

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sua nota de Português : ");
		Double notaDePortugues = scanner.nextDouble();
		
		System.out.print("Digite sua nota de Matemática : ");
		Double notaDeMatematica = scanner.nextDouble();
		
		Boolean estaAcimaDoMinimoEmPortugues = notaDePortugues >= NOTA_MINIMA;
		Boolean estaAcimaDoMinimoEmMatematica = notaDePortugues >= NOTA_MINIMA;
		
		Double SomaDasNotas = notaDePortugues + notaDeMatematica;
		
		Boolean aprovado = SomaDasNotas >= NOTA_MINIMA_GERAL && estaAcimaDoMinimoEmMatematica && estaAcimaDoMinimoEmPortugues;
		
		if (aprovado) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		scanner.close();
	}

	
}
