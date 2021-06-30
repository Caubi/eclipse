import java.util.Scanner;

public class Constantes {
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18; // Criado uma vari�vel contante est�tica 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Boolean variavelVerdadeira = true;
		System.out.println("Vari�vel verdadaeira : " + variavelVerdadeira);
		
		Boolean VariavelFalsa = false;
		System.out.println("Vari�vel Falsas : " + VariavelFalsa);
		
		System.out.print("Digita a sua idade : ");
		Integer idade = scanner.nextInt();
		
		//final Integer IdadaeMinimaCarteira = 18; //Cria��o da constante usa-se o final no in�cio
		
		Boolean PodeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;
		
		if (PodeTirarCarteira) {
			System.out.println("Dim! Ele(a) pode tirar a carteira !");
		}
		else {
			System.out.println("N�o Ele(a) n�o pode tirar a carteira !");
		}
		
		scanner.close();
	}
}