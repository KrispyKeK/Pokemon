package pokemon.model;

public class Charmander extends Pokemon implements Fire
{
	public Charmander() 
	{
		super("Charmander", 4);
		setup();
	}
	public Charmander(String name)
	{
		super(name, 4);
		setup();
	}
	public Charmander(String name, int number) 
	{
		super(name, number);
		setup();
	}
	public void ember() 
	{
		
	}
	public void fireSpin() 
	{
		
	}
	public void flameThrower() 
	{
		
	}
	protected void setup() 
	{
		this.setAttackPoints(66);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.5);
		this.setHealthPoints(75);
	}
}
