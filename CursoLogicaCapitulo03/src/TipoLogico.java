
public class TipoLogico {
	
	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Vari�vel verdadaeira : " + variavelVerdadeira);
		
		Boolean VariavelFalsa = false;
		System.out.println("Vari�vel Falas : " + VariavelFalsa);
		
		Integer idade = 19;
		
		Boolean PodeTirarCarteira = idade >= 18;
		
		if (PodeTirarCarteira) {
			System.out.println("Dim! Ele(a) pode tirar a carteira !");
		}
		else {
			System.out.println("N�o Ele(a) n�o pode tirar a carteira !");
		}
		//System.out.println("Pode tirar carteira ? : " + PodeTirarCarteira);
	}
}
