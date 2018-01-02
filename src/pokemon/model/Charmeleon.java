package pokemon.model;

public class Charmeleon extends Charmander{
	public Charmeleon() {
		super("Charmeleon", 5);
		setup();
	}
	public Charmeleon(String name) {
		super(name, 5);
		setup();
	}
	public Charmeleon(String name, int number) {
		super(name, number);
		setup();
	}
	@Override
	protected void setup() {
		super.setup();
		this.setAttackPoints(125);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.84);
		this.setHealthPoints(235);
	}
}
