package pokemon.model;

public class Darkrai extends Pokemon implements Dark{
	public Darkrai() {
		super("Darkrai", 491);
		setup();
	}
	public Darkrai(String name) {
		super(name, 491);
		setup();
	}
	public Darkrai(String name, int number) {
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
		System.out.println("sneak sneak");
	}
	protected void setup() {
		this.setAttackPoints(115);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.76);
		this.setHealthPoints(115);
	}
}
