
public class TipoLogico {
	
	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Variável verdadaeira : " + variavelVerdadeira);
		
		Boolean VariavelFalsa = false;
		System.out.println("Variável Falas : " + VariavelFalsa);
		
		Integer idade = 19;
		
		Boolean PodeTirarCarteira = idade >= 18;
		
		if (PodeTirarCarteira) {
			System.out.println("Dim! Ele(a) pode tirar a carteira !");
		}
		else {
			System.out.println("Não Ele(a) não pode tirar a carteira !");
		}
		//System.out.println("Pode tirar carteira ? : " + PodeTirarCarteira);
	}
}
