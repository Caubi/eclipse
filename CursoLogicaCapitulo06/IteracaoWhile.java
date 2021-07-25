public class IteracaoWhile {

	public static void main(String[] args) {
		
		int i = 0;
		while(i < 10) {
			if (i == 5) {
				System.out.println("Parar");
//				System.out.println("Vai continuarr");
				break;
//				i++;
//				continue;
			}
			System.out.println(i + ": Um texto qualquer.");
			i++;
		}

	}

}
