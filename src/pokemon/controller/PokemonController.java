package pokemon.controller;

import pokemon.view.*;
import pokemon.model.*;
import java.util.*;

public class PokemonController {
	PokemonFrame frame;
	public PokemonController() {
		frame = new PokemonFrame(this);
	}
	private List<Pokemon> pokedex;
	public List<Pokemon> getPokedex(){
		return pokedex;
	}
	public boolean isInteger(String input) {
		boolean condition = false;
		try {
			int inp = Integer.parseInt(input);
			condition = true;
		}
		catch(Exception e) {
			
		}
		return condition;
	}
	public boolean isDouble(String input) {
		boolean condition = false;
		try {
			double inp = Double.parseDouble(input);
			condition = true;
		}
		catch(Exception e) {
			
		}
		return condition;
	}
}
