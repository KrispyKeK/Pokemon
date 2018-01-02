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
	private JTextArea typeArea;
	
	private JTextField nameBox;
	private JTextField evolveField;
	private JTextField numberField;
	private JTextField healthField;
	private JTextField modField;
	private JTextField attackField;
	
	private JLabel numberBox;
	private JLabel healthBox;
	private JLabel attackBox;
	private JLabel modBox;
	private JLabel image;
	private JLabel evolveLabel;
	private JLabel nameLabel;
	
	
	public PokemonPanel(PokemonController controller) {
		super();
		this.controller = controller;
		
		save = new JButton("Save");
		load = new JButton("Load");
		reset = new JButton("Reset");	
		
		scroll = new JComboBox();
		
		evolveBox = new JCheckBox();
		
		description = new JTextArea();
		typeArea = new JTextArea();
		
		nameBox = new JTextField(7);
		evolveField = new JTextField(7);
		numberField = new JTextField(7);
		healthField = new JTextField(7);
		modField = new JTextField(7);
		attackField = new JTextField(7);
		
		numberBox = new JLabel("Number: ");
		healthBox = new JLabel("Health: ");
		attackBox = new JLabel("Attack: ");	
		modBox = new JLabel("Enhance: ");
		evolveLabel = new JLabel("Evolve: ");
		nameLabel = new JLabel("Name: ");
		
		
		baseLayout = new SpringLayout();
		
		setupLayout();
		setupPanel();
		setupListeners();
	}
	private void setupPanel() {
		this.setLayout(baseLayout);
		this.add(image);
		
		this.add(nameBox);
		this.add(evolveField);
		this.add(numberField);
		this.add(healthField);
		this.add(modField);
		this.add(attackField);
		
		this.add(save);
		this.add(load);
		this.add(reset);
		
		this.add(scroll);
		
		this.add(evolveBox);
		
		this.add(description);
		this.add(typeArea);
		
		this.add(numberBox);
		this.add(healthBox);
		this.add(modBox);
		this.add(evolveLabel);
		this.add(nameLabel);
		this.add(attackBox);
		
	}
	private void setupLayout() {
		baseLayout.putConstraint(SpringLayout.SOUTH, load, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, load, -159, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, save, 0, SpringLayout.NORTH, load);
		baseLayout.putConstraint(SpringLayout.WEST, save, 6, SpringLayout.EAST, load);
		baseLayout.putConstraint(SpringLayout.SOUTH, reset, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, reset, 0, SpringLayout.EAST, this);
		image = new JLabel(new ImageIcon(getClass().getResource("images/pokemonBall.png")));
		baseLayout.putConstraint(SpringLayout.SOUTH, attackField, 0, SpringLayout.SOUTH, image);
		baseLayout.putConstraint(SpringLayout.NORTH, nameBox, 0, SpringLayout.NORTH, image);
		baseLayout.putConstraint(SpringLayout.SOUTH, image, -6, SpringLayout.NORTH, scroll);
		baseLayout.putConstraint(SpringLayout.EAST, image, -252, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, image, 15, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, image, 10, SpringLayout.EAST, description);
		baseLayout.putConstraint(SpringLayout.NORTH, scroll, 216, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, scroll, 37, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, scroll, -278, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 5, SpringLayout.NORTH, evolveField);
		baseLayout.putConstraint(SpringLayout.WEST, evolveLabel, 0, SpringLayout.WEST, numberBox);
		baseLayout.putConstraint(SpringLayout.NORTH, evolveBox, 0, SpringLayout.NORTH, evolveField);
		baseLayout.putConstraint(SpringLayout.EAST, evolveBox, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, evolveField, 6, SpringLayout.SOUTH, numberField);
		baseLayout.putConstraint(SpringLayout.EAST, evolveField, 0, SpringLayout.EAST, nameBox);
		baseLayout.putConstraint(SpringLayout.EAST, numberBox, -11, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, healthBox, 5, SpringLayout.NORTH, healthField);
		baseLayout.putConstraint(SpringLayout.WEST, healthBox, 0, SpringLayout.WEST, numberBox);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 38, SpringLayout.SOUTH, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, 6, SpringLayout.SOUTH, nameBox);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, nameBox);
		baseLayout.putConstraint(SpringLayout.NORTH, numberBox, 16, SpringLayout.SOUTH, nameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, attackBox, -20, SpringLayout.WEST, attackField);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, -25, SpringLayout.WEST, nameBox);
		baseLayout.putConstraint(SpringLayout.EAST, modBox, -9, SpringLayout.WEST, modField);
		baseLayout.putConstraint(SpringLayout.NORTH, attackBox, 5, SpringLayout.NORTH, attackField);
		baseLayout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, nameBox);
		baseLayout.putConstraint(SpringLayout.NORTH, modBox, 5, SpringLayout.NORTH, modField);
		baseLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, nameBox);
		baseLayout.putConstraint(SpringLayout.NORTH, modField, 10, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.SOUTH, modField, -43, SpringLayout.NORTH, scroll);
		baseLayout.putConstraint(SpringLayout.EAST, modField, 0, SpringLayout.EAST, nameBox);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, nameBox);
		baseLayout.putConstraint(SpringLayout.EAST, nameBox, -50, SpringLayout.EAST, this);
	}
	private void setupListeners() {

		
	}
	private void updatePokedexInfo(int index) {
		nameBox.setText(controller.getPokedex().get(index).getName());
		evolveBox.setSelected(controller.getPokedex().get(index).isCanEvolve());
		numberField.setText(controller.getPokedex().get(index).getNumber() + "");
		attackField.setText(controller.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(controller.getPokedex().get(index).getHealthPoints() + "");
		modField.setText(controller.getPokedex().get(index).getEnhancementModifier() + "");
	}

}
