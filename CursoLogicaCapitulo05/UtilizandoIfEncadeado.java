import java.util.Scanner;

public class UtilizandoIfEncadeado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digiteo o peso do atleta : ");
		Double Peso = scanner.nextDouble();
		
		Boolean PesoLeve = (Peso <= 60) && (Peso > 0);
		Boolean PesoMedio = (Peso > 60) && (Peso <= 90);
		Boolean PesoPesado = (Peso > 90);
		
		if (PesoLeve) {
			System.out.println("O atleta � peso leve");
		} else if (PesoMedio){
			System.out.println("O atleta � peso M�dio !");
		} else if (PesoPesado) {
			System.out.println("O atlteta � peso Pesado !");
		} else {
			System.out.println("O atleta n�o se encaixa em categoria alguma ! ");
		}
		scanner.close();
	}

}
