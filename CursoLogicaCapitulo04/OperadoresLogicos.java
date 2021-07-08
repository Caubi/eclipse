
public class OperadoresLogicos {
	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = true;
		Boolean PeriodoDePromo = true;
		Boolean JaFezCompraNaloja = true;
		Boolean pagamentoAvista = true;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && PeriodoDePromo;

//		Boolean aplicarDesconto = carrinhoMaiorQue100 || PeriodoDePromo;
		
//		Boolean aplicarDesconto = PeriodoDePromo && carrinhoMaiorQue100 && JaFezCompraNaloja;
		
//		Boolean aplicarDesconto = PeriodoDePromo || carrinhoMaiorQue100 || JaFezCompraNaloja; 
		
		Boolean aplicarDesconto = PeriodoDePromo && (carrinhoMaiorQue100 || JaFezCompraNaloja) && pagamentoAvista; 
		
		if (aplicarDesconto) {
			System.out.println("Sim, aplique o desconto");
		} else {
			System.out.println("Não, não aplique o desconto");
		}
		
	}
}
