package pokemon.model;

public class Charizard extends Charmeleon implements Flying{
	public Charizard(String name, int number) {
		//not sure if work
		super(name, number);
	}
	public void fly() {
		
	}
	public int roost(int amount) {
		int amountHeal = 120;
		return amountHeal;
	}
	public void airSlash() {
		
	}
}
