package pokemon.view;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.*;
import pokemon.controller.PokemonController;
import pokemon.model.*;
import pokemon.controller.*;

public class PokemonPanel extends JPanel{
	
	PokemonController controller;
	private SpringLayout baseLayout;
	private JButton save;
	private JButton load;
	private JButton reset;
	private JComboBox scroll;
	private JCheckBox evolveBox;
	private JTextArea description;
	private JTextField nameBox;
	private JLabel numberBox;
	private JLabel healthBox;
	private JLabel attackBox;
	private JLabel modBox;
	private JLabel pokeBall;
	private JLabel evolveLabel;
	
	
	public PokemonPanel(PokemonController controller) {
		super();
		this.controller = controller;
		save = new JButton("Save");
		load = new JButton("Load");
		reset = new JButton("Reset");	
		scroll = new JComboBox();
		evolveBox = new JCheckBox();
		description = new JTextArea();
		nameBox = new JTextField(7);
		numberBox = new JLabel();
		healthBox = new JLabel();
		attackBox = new JLabel();
		modBox = new JLabel();
		evolveLabel = new JLabel();
		baseLayout = new SpringLayout();
		
		setupLayout();
		setupPanel();
		setupListeners();
	}
	private void setupPanel() {
		this.setLayout(baseLayout);
		this.add(pokeBall);
		this.add(nameBox);
		this.add(save);
		this.add(load);
		this.add(reset);
		this.add(scroll);
		this.add(evolveBox);
		this.add(description);
		this.add(numberBox);
		this.add(healthBox);
		this.add(modBox);
		this.add(evolveLabel);
		
	}
	private void setupLayout() {
		baseLayout.putConstraint(SpringLayout.SOUTH, load, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, load, -159, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, save, 0, SpringLayout.NORTH, load);
		baseLayout.putConstraint(SpringLayout.WEST, save, 6, SpringLayout.EAST, load);
		baseLayout.putConstraint(SpringLayout.SOUTH, reset, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, reset, 0, SpringLayout.EAST, this);
		pokeBall = new JLabel(new ImageIcon(getClass().getResource("images/pokemonBall.png")));
		baseLayout.putConstraint(SpringLayout.SOUTH, pokeBall, -6, SpringLayout.NORTH, scroll);
		baseLayout.putConstraint(SpringLayout.EAST, pokeBall, -252, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, pokeBall, 15, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokeBall, 10, SpringLayout.EAST, description);
		baseLayout.putConstraint(SpringLayout.NORTH, scroll, 216, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, scroll, 37, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, scroll, -278, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, nameBox, 0, SpringLayout.WEST, save);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameBox, -23, SpringLayout.NORTH, evolveBox);
		baseLayout.putConstraint(SpringLayout.NORTH, evolveBox, 98, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, evolveBox, 0, SpringLayout.WEST, reset);
	}
	private void setupListeners() {

		
	}

}
