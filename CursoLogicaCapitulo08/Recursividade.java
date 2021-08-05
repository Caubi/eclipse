
public class Recursividade {

	public static void main(String[] args) {
		String[] alunos = new String[] {"Alexandre", "Junior", "José"};
		
		IterarNomes(alunos, 0);
//		ImprimriNumero(0);
	}

	static void IterarNomes(String[] alunos, Integer i) {
		
		System.out.println("Alunos : " + alunos[i]);
		
		if (++i < alunos.length ) {
			IterarNomes(alunos, i);
		}
//	static void ImprimriNumero(Integer numero, Integer i) {
//		System.out.println("Número" + numero);
//		if (numero < 10) {
//			ImprimriNumero(++numero);
//		}
	}

}
