package pokemon.model;

public class TissueBox extends Pokemon implements Derptastic{
	
	public TissueBox(String name, int number) 
	{
		super(name, number);
		
	}
	public int annoy(int level) {
		int annoyance = -911;
		return annoyance;
	}
	public String sayDerpy() {
		return "Derp derp derp derp";
	}
	public void derpDerpDerp() {
		System.out.println("Life sucks");
	}

}
