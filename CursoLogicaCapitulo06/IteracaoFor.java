public class IteracaoFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		for (int i=0;i<=9;i++) {
//			System.out.println("Uma frase qualquer." + i);
//		}
		
		Double[] carrinhoDeCompras = new Double[] {50.0, 51.0, 2.0, 7.9 };
		Double total = 0.0;
		
		for (int i = 0; i < carrinhoDeCompras.length; i++) {
			System.out.println("Iteração " + i + " Total: " + total);
			total = total + carrinhoDeCompras[i];		
		}
		System.out.println("Total : " + total);
		
		for (int i=0; i <=10; i++) {
			if(i == 5) {
				System.out.println("Pare aqui");
				break;
			}
			System.out.println("Iteração: " + i);	
		}
		
		for (int i=0; i <=10; i++) {
			if(i == 5) {
				System.out.println("Vai continuar!");
				continue;
			}
			System.out.println("Iteração: " + i);	
		}
		
		Integer[] produtos = new Integer[] { 100, 225, 330 };

		for (int i=0; i < produtos.length; i++) {
			Integer  produto = produtos[i];

			System.out.println("Produto de código: " + produto);
			
			if(produtos.equals(225)) {
				System.out.println("Produto encontrado!");
				break;
			}
		}
	}

}
