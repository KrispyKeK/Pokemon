package pokemon.model;

public class Darkrai extends Pokemon implements Dark{
	public Darkrai(String name, int number) {
		super(name, number);
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
	
}