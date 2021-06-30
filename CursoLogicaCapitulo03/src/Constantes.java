import java.util.Scanner;

public class Constantes {
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18; // Criado uma variável contante estática 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Boolean variavelVerdadeira = true;
		System.out.println("Variável verdadaeira : " + variavelVerdadeira);
		
		Boolean VariavelFalsa = false;
		System.out.println("Variável Falsas : " + VariavelFalsa);
		
		System.out.print("Digita a sua idade : ");
		Integer idade = scanner.nextInt();
		
		//final Integer IdadaeMinimaCarteira = 18; //Criação da constante usa-se o final no início
		
		Boolean PodeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;
		
		if (PodeTirarCarteira) {
			System.out.println("Dim! Ele(a) pode tirar a carteira !");
		}
		else {
			System.out.println("Não Ele(a) não pode tirar a carteira !");
		}
		
		scanner.close();
	}
}