import java.util.Scanner;

public class Exercicio0701 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] tarefas = new String[5];
		
		for (int i = 0; i < tarefas.length; i++) {
			System.out.print("Tarefa " + i + ": ");
			tarefas[i] = scanner.nextLine();
		}
		
		System.out.print("Suas tarefas s�o: ");
		for (int i = 0; i < tarefas.length; i++) {
			System.out.print(i + ": " + tarefas[i]);
		}
		
		scanner.close();

	}

}
