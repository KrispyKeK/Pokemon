package pokemon.controller;

import pokemon.view.*;
import pokemon.model.*;
import java.util.*;

public class PokemonController 
{
	PokemonFrame frame;
	private List<Pokemon> pokedex;
	public PokemonController() 
	{
		pokedex = new ArrayList<Pokemon>();
		setupPokeDex();
		
		frame = new PokemonFrame(this);
	}
	public String[] convertPokedex() 
	{
		String[] names = new String[pokedex.size()];
		for (int index = 0; index < pokedex.size(); index++) 
		{
			names[index] = pokedex.get(index).getName();
		}
		return names;
	}
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	public boolean isInteger(String input) 
	{
		boolean condition = false;
		try 
		{
			int inp = Integer.parseInt(input);
			condition = true;
		}
		catch(Exception e) 
		{
			//do nothing
		}
		return condition;
	}
	public boolean isDouble(String input) 
	{
		boolean condition = false;
		try 
		{
			double inp = Double.parseDouble(input);
			condition = true;
		}
		catch(Exception e) 
		{
			//do nothing
		}
		return condition;
	}
	private void setupPokeDex() 
	{
		Darkrai darkrai = new Darkrai();
		Charizard charizard = new Charizard();
		Charmeleon charmeleon = new Charmeleon();
		Charmander charmander = new Charmander();
		Greninja greninja = new Greninja();
		Litten litten = new Litten();
		Torracat torracat = new Torracat();
		Incineroar incineroar = new Incineroar();
		MarshShadow marshshadow = new MarshShadow();
		pokedex.add(charmander);
		pokedex.add(charmeleon);
		pokedex.add(charizard);
		pokedex.add(litten);
		pokedex.add(torracat);
		pokedex.add(incineroar);
		pokedex.add(marshshadow);
		pokedex.add(greninja);
		pokedex.add(darkrai);
	}
	public void updatedSelected(int selection, int health, int attack, boolean evolve,double modify, String name) {
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancementModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
	}
}
