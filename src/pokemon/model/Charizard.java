package pokemon.model;

public class Charizard extends Charmeleon implements Flying{
	public Charizard() {
		super("Charizard", 6);
		setup();
	}
	public Charizard(String name) {
		super(name, 6);
		setup();
	}
	public Charizard(String name, int number) {
		super(name, number);
		setup();
	}
	public void fly() {
		
	}
	public int roost(int amount) {
		int amountHeal = 120;
		return amountHeal;
	}
	public void airSlash() {
		
	}
	@Override
	protected void setup() {
		super.setup();
		this.setAttackPoints(95);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.6);
		this.setHealthPoints(109);
	}
}
