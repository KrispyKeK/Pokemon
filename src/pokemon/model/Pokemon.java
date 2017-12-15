package pokemon.model;

import java.util.*;

public abstract class Pokemon {
	private int healthPoints;
	private int attackPoints;
	private int number;
	private double enhancementModifier;
	private String name;
	private boolean canEvolve;
	
	public Pokemon(String name, int number){
		this.name = name;
		this.number = number;
	}
	public final String[] getPokemonTypes() {
		Class<?> [] types = getClass().getInterfaces();
		String[] pokeTypes = new String[types.length];
		for (int index = 0; index<types.length;index++) {
			String currentInterface = types[index].getCanonicalName();
			currentInterface = currentInterface.replace(this.getClass().getPackage().getName() + ".","");
			pokeTypes[index] = currentInterface;
		}
		return pokeTypes;
	}
	public String toString() {
		String string = "Hi, I am a " + name + " , and my HP is " + healthPoints + ". Impressive right?";
		return string;
	}
	public String getPokemonInformation() {
		String info = "This pokemon is of type: " + this.getClass().getSimpleName();
		return info;
	}
	public int getHealthPoints() {
		return healthPoints;
	}
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	public int getAttackPoints() {
		return attackPoints;
	}
	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}
	public double getEnhancementModifier() {
		return enhancementModifier;
	}
	public void setEnhancementModifier(double enhancementModifier) {
		this.enhancementModifier = enhancementModifier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCanEvolve() {
		return canEvolve;
	}
	public void setCanEvolve(boolean canEvolve) {
		this.canEvolve = canEvolve;
	}
	public int getNumber() {
		return number;
	}
	
	
}
