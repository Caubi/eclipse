import java.util.Scanner;

public class AlunoPassou {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("O ALUNO PASSOU OU N�O DE ANO ?");
		
		System.out.print("Digite a nota do Aluno : ");
		Double NotaAluno = scanner.nextDouble();
		
		Boolean Situacao = NotaAluno >= 70;
		
		if (Situacao) {
			
			System.out.println("Parab�ns !! voc� passou de ano.");
		
		} else {
		
			System.out.println("Infelizmente, voc� ficou de recupera��o.");
		}
		
		scanner.close();
	}
	
}
