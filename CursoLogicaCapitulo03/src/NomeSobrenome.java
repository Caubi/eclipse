import java.util.Scanner;

public class NomeSobrenome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome : ");
		String PrimeiroNome = scanner.next();
		
		System.out.println("Digite seu segundo nome : ");
		String SegundoNome = scanner.next();
		
		String NomeCompleto = (PrimeiroNome + " " + SegundoNome);
		
		scanner.close();
		
		System.out.print("Seu nome completo é : "+ NomeCompleto);
		
	}

}
