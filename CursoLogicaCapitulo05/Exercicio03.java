import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana : ");
		Integer DiaSemana = scanner.nextInt();
		
		String dia = null;
		
		switch (DiaSemana){
		case 1: dia = "Domingo"; 
			break;
		case 2: dia = "Segunda";
			break;
		case 3: dia = "Ter�a-Feira";
			break;
		case 4: dia = "Quarta-Feira";
			break;
		case 5: dia = "Quinta-Feira";
			break;
		case 6: dia = "Sexta-Feira";
			break;
		case 7: dia = "S�bado";
			break;
		default:
			System.err.println("Digito inv�lido ou incorreto");
			System.exit(1);
		}
		
		System.out.println("O dia da semana selecionado � : " + dia);
		
		
		scanner.close();
	}

}
