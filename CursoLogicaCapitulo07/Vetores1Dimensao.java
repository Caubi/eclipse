import java.util.Scanner;

public class Vetores1Dimensao {

	public static void main(String[] args) {
		String[] cardapio = new String[] { "Atum", "Calabresa", "Carne", "Presunto", "Queijo"};
		
		System.out.println("Escolha o seu sabor :");
		
		for(int i=0; i < cardapio.length; i++) {
			System.out.println("Sabor da lista :"+"["+i+"]"+"-"+cardapio[i] );
		}
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("Digite o numero referente ao sabor : ");
		Integer saborEscolhido = scanner.nextInt();
		
		
		System.out.println("O sabor esolhido foi : " + cardapio[saborEscolhido]);
		
		scanner.close();
	}

}
