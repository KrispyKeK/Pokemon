package pokemon.model;

public class Torracat extends Litten implements Fire, Dark
{
	public Torracat(String name,int number) 
	{
		super(name, number);
		setup();
	}
	public Torracat(String name) 
	{
		super(name, 726);
		setup();
	}
	public Torracat() 
	{
		super("Torracat", 726);
		setup();
	}
	@Override
	protected void setup() 
	{
		super.setup();
		this.setAttackPoints(78);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.7);
		this.setHealthPoints(103);
	}
}
