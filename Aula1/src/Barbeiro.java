
public class Barbeiro {
	
	private String name;
	private int age;
	private boolean heroi;
	
	Barbeiro(String name, int age, boolean heroi){
		this.name = name;
		this.age = age;
		this.heroi = heroi;
	}
	public boolean heroi() {
		return heroi;
	}
	@Override
	public String toString() {
		return "Barbeiro:"+this.name+"; Idade:"+this.age+"; Heroi:"+this.heroi+";";
	}
}
