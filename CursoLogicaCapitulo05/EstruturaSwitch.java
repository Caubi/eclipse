import java.util.Scanner;

public class EstruturaSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o m�s : ");
		Integer mes = scanner.nextInt();
		
		Double desconto = 0.0;
		
//		if(mes.equals(1)) {
//			desconto = 0.0;
//		} else if (mes.equals(2)) {
//			desconto = 0.0;
//		} else if (mes.equals(3)) {
//			desconto = 15.0;
//		} else if (mes.equals(4)) {
//			desconto = 30.0;
//		} else if (mes.equals(5)) {
//			desconto = 30.0;
//		} else if (mes.equals(6)) {
//			desconto = 10.0;
//		} else if (mes.equals(7)) {
//			desconto = 10.0;
//		} else if (mes.equals(8)) {
//			desconto = 10.0;
//		} else if (mes.equals(9)) {
//			desconto = 10.0;
//		} else if (mes.equals(10)) {
//			desconto = 20.0;
//		} else if (mes.equals(11)) {
//			desconto = 10.0;
//		} else if (mes.equals(12)) {
//			desconto = 0.0;
//		} else {

		switch (mes){
		case 1: desconto = 0.0;
			break;
		case 2: desconto = 10.0;
			break;
		case 3: desconto = 15.0;
			break;
		case 4: desconto = 0.0;
			break;
		case 5: desconto = 11.0;
			break;
		case 6: desconto = 12.0;
			break;
		case 7: desconto = 15.0;
			break;
		case 8: desconto = 20.0;
			break;
		case 9: desconto = 10.0;
			break;
		case 10: desconto = 11.0;
			break;
		case 11: desconto = 19.0;
			break;
		case 12: desconto = 25.0;
			break;
		default:
			System.err.println("case 1: desconto = 0.0;Digite um m�s v�lido !"); // MENSAGEM DE ERRO PARA EXCESS�ES
			System.exit(1); // ENCERRAR O PROGRAMA
		}
		
		System.out.println("Seu desconto ser� de : " + desconto + "%");
		
		scanner.close();
	}

}
