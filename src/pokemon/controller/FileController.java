package pokemon.controller;

import java.io.*;
import pokemon.model.*;
import java.util.*;

public class FileController 
{
	public static void savePokemonFile(ArrayList<Pokemon> pokedex) {
		File saveFile = new File("Saved Pokedex.txt");
		try {
			PrintWriter writeToDisk = new PrintWriter(saveFile);
			for(int index = 0; index < pokedex.size(); index++) {
				String name = pokedex.get(index).getName();
				int number = pokedex.get(index).getNumber();
				int attack = pokedex.get(index).getAttackPoints();
				int health = pokedex.get(index).getHealthPoints();
				boolean evolve = pokedex.get(index).isCanEvolve();
				double mod = pokedex.get(index).getEnhancementModifier();
				
				String row = name + "," + number + "," + health + "," + attack + "," + mod + "," + evolve;  
				writeToDisk.println(row);
			}
			writeToDisk.close();
		}
		catch(FileNotFoundException error) {
			System.out.println("There was an error: " + error.getMessage());
		}
	}
	public static String readPokemonFromFile() {
		String contents = "";
		String path = "Saved Pokedex.txt";
		try {
			Scanner scanner = new Scanner(new File(path));
			while(scanner.hasNextLine()) {
				String row = scanner.nextLine();
				contents += row + "\n";
			}
			scanner.close();
		}
		catch(FileNotFoundException error) {
			System.out.println("There was an error: " + error.getMessage());
		}
		return contents;
	}
}
