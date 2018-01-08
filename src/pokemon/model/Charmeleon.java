package pokemon.model;

public class Charmeleon extends Charmander implements Fire{
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
		this.setCanEvolve(true);
		this.setEnhancementModifier(.84);
		this.setHealthPoints(235);
	}
}
