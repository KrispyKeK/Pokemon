package pokemon.model;

public class MarshShadow extends Pokemon implements Ghost
{
	public MarshShadow() 
	{
		super("Marshadow", 802);
		setup();
	}
	public MarshShadow(String name) 
	{
		super(name, 802);
		setup();
	}
	public MarshShadow(String name, int number) 
	{
		super(name, number);
		setup();
	}
	public void spook() 
	{
		
	}
	public void shadowSneak() 
	{
		
	}
	public void resistance()
	{
		
	}
	protected void setup() 
	{
		this.setAttackPoints(100);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.72);
		this.setHealthPoints(101);
	}
}
