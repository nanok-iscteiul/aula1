import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduza o seu nome.");
		
		String nome = sc.next();
		
		System.out.println("Olá "+ nome+", bem vindo! Qual é a sua idade?");
		
		String aux = sc.next();
		
		int idade = Integer.parseInt(aux);
		
		if (idade>20) {
			System.out.println("Ahhhhh, "+ nome+ ", és mesmo velho pá!");
		}else {
			System.out.println("Fogo! "+ nome+ ", és bué novo!");
		}

	}

}
