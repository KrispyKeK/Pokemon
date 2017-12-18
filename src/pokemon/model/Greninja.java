package pokemon.model;

public class Greninja extends Pokemon implements Dark{
	public Greninja(String name, int number) {
		super(name, number);
	}
	public String bite() {
		return "Nom";
	}
	public String crunch() {
		return "Grrr";
	}
	public void persuit() {
		
	}
}
