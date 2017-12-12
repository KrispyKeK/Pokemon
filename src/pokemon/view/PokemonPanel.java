package pokemon.view;

import javax.swing.*;
import pokemon.controller.PokemonController;

public class PokemonPanel extends JPanel{
	
	PokemonController controller;
	private SpringLayout baseLayout;
	private JLabel pokeBall;
	
	public PokemonPanel(PokemonController controller) {
		super();
		this.controller = controller;
		baseLayout = new SpringLayout();
		pokeBall = new JLabel(new ImageIcon(getClass().getResource("images/pokeBall.png")));
		
		setupLayout();
		setupPanel();
		setupListeners();
	}
	private void setupPanel() {
		this.setLayout(baseLayout);
	}
	private void setupLayout() {
		
	}
	private void setupListeners() {
		
	}
}
