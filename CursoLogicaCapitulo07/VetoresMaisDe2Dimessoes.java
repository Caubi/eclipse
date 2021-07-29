
public class VetoresMaisDe2Dimessoes {

	public static void main(String[] args) {
		Double faturamentoDia = 1000.0;
		
		Double[] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 1700.0};
		Double[] faturamentoFevereiro = new Double[] {1800.0, 2500.0, 3000.0};
		Double[] faturamentoMarco = new Double[] {800.0, 7000.0, 9000.0};
		Double[] faturamentoAbril = new Double[] {400.0, 2500.0, 1900.0};
		
		Double[][] faturamentoAnual = new Double[][] {faturamentoJaneiro, faturamentoFevereiro, faturamentoMarco, faturamentoAbril }; 
				
		System.out.println("Faturamento do dia 1° de Janeiro: " + faturamentoAnual[0][0]);
		System.out.println("Faturamento do dia 3° de Fevereiro " + faturamentoAnual[1][2]);
		
		for (int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("Mês:" + i + 1 );
			
			Double[] mes = faturamentoAnual[i];
			
			for (int y = 0; y < mes.length; y++) {
				Double dia = mes[y];
				System.out.println("Dia " + y + ": " + dia);
			}
		}
	}

}
