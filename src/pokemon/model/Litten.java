package pokemon.model;

public class Litten extends Pokemon implements Dark, Fire{
	public Litten() {
		super("Litten", 725);
		setup();
	}
	public Litten(String name) {
		super(name, 725);
		setup();
	}
	public Litten(String name, int number) {
		super(name, number);
		setup();
	}
	public void fireSpin() {
		
	}
	public void flameThrower() {
		
	}
	public void ember() {
		
	}
	public String crunch() {
		return "Nom";
	}
	public String bite() {
		return "Grrr";
	}
	public void persuit() {
		
	}
	protected void setup() {
		this.setAttackPoints(58);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.70);
		this.setHealthPoints(76);
	}
}
