
public class Main {
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello World!");			
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Bye!");
		}
		Barbeiro b = new Barbeiro("Capitao america", 28, false);
		System.out.println(b.toString());
		if (!b.heroi()) {
			for(int i = 0; i<100; i++) {
				System.out.println("hahaha não e um heroi hahahah");
			}
		}
		
	}

}
