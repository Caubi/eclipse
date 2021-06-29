import java.util.Scanner;

public class AlunoPassou {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("O ALUNO PASSOU OU NÃO DE ANO ?");
		
		System.out.print("Digite a nota do Aluno : ");
		Double NotaAluno = scanner.nextDouble();
		
		Boolean Situacao = NotaAluno >= 70;
		
		if (Situacao) {
			
			System.out.println("Parabéns !! você passou de ano.");
		
		} else {
		
			System.out.println("Infelizmente, você ficou de recuperação.");
		}
		
		scanner.close();
	}
	
}
