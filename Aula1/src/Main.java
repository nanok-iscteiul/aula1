import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduza o seu nome.");
		
		String nome = sc.next();
		
		System.out.println("Ol� "+ nome+", bem vindo! Qual � a sua idade?");
		
		String aux = sc.next();
		
		int idade = Integer.parseInt(aux);
		
		if (idade>20) {
			System.out.println("Ahhhhh, "+ nome+ ", �s mesmo velho p�!");
		}else {
			System.out.println("Fogo! "+ nome+ ", �s bu� novo!");
		}

		Barbeiro b;
		if (nome.toLowerCase().contains("america")) {
			 b = new Barbeiro(nome, idade, false);
		}else {
			 b = new Barbeiro(nome, idade, true);
		}
		System.out.println(b.toString());
		if (!b.heroi()) {
			for(int i = 0; i<100; i++) {
				System.out.println("hahaha n�o e um heroi hahahah");
			}
		}
		
	}

}
