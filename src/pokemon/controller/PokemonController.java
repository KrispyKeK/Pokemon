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
		MarshShadow marshshadow = new MarshShadow();
		pokedex.add(marshshadow);
		pokedex.add(greninja);
		pokedex.add(darkrai);
		pokedex.add(charizard);
		pokedex.add(charmander);
		pokedex.add(charmeleon);
		pokedex.add(litten);
		
	}
}
