package pokemon.model;

public class Incineroar extends Torracat implements Fire, Dark
{
	public Incineroar(String name, int number)
	{
		super(name, number);
		setup();
	}
	public Incineroar(String name) 
	{
		super(name, 727);
		setup();
	}
	public Incineroar() 
	{
		super("Incineroar",727);
		setup();
	}
	@Override
	protected void setup() 
	{
		super.setup();
		this.setAttackPoints(87);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.72);
		this.setHealthPoints(133);
	}
}
