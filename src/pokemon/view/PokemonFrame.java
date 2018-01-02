package pokemon.view;

import javax.swing.*;
import pokemon.controller.PokemonController;

public class PokemonFrame extends JFrame{
	PokemonPanel panel;
	PokemonController controller;
	
	public PokemonFrame(PokemonController controller) {
		super();
		this.controller = controller;
		this.panel = new PokemonPanel(controller);
		setupFrame();
	}
	public void setupFrame() {
		this.setContentPane(panel);
		this.setTitle("PokeDex");
		this.setSize(450, 300);
		this.setResizable(false);
		this.setVisible(true);
	}
}
