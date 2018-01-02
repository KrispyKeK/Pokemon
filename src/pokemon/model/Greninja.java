package pokemon.model;

public class Greninja extends Pokemon implements Dark{
	public Greninja() {
		super("Greninja", 658);
		setup();
	}
	public Greninja(String name) {
		super(name, 658);
		setup();
	}
	public Greninja(String name, int number) {
		super(name, number);
		setup();
	}
	public String bite() {
		return "Nom";
	}
	public String crunch() {
		return "Grrr";
	}
	public void persuit() {
		
	}
	protected void setup() {
		this.setAttackPoints(119);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.68);
		this.setHealthPoints(116);
	}
}
