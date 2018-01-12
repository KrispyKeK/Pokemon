package pokemon.view;


import java.awt.Color;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import pokemon.controller.PokemonController;
import pokemon.model.*;
import pokemon.controller.*;


public class PokemonPanel extends JPanel
{	
	PokemonController controller;
	
	private SpringLayout baseLayout;
	
	private JButton save;
	private JButton load;
	private JButton reset;
	
	private JComboBox scroll;
	
	private JCheckBox evolveBox;
	
	private JTextArea description;
	private JTextArea typeOne;
	private JTextArea typeTwo;
	private JTextArea typeThree;
	
	private JTextField nameBox;
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
	
	private String updateImage;
	
	public PokemonPanel(PokemonController controller) 
	{
		super();
		this.controller = controller;
		
		String updateImage = "pokemonBall";
		
		save = new JButton("Save");
		load = new JButton("Load");
		reset = new JButton("Reset");	
		
		scroll = new JComboBox();
		
		evolveBox = new JCheckBox();
		evolveBox.setEnabled(false);
		
		description = new JTextArea("Description: ");
		typeOne = new JTextArea("Type");
		typeTwo = new JTextArea("Type");
		typeThree = new JTextArea("Type");
		
		description.setEditable(false);
		typeOne.setEditable(false);
		typeTwo.setEditable(false);
		typeThree.setEditable(false);
		
		nameBox = new JTextField(7);
		numberField = new JTextField(7);
		healthField = new JTextField(7);
		modField = new JTextField(7);
		attackField = new JTextField(7);
		
		numberField.setEditable(false);
		healthField.setEditable(false);
		modField.setEditable(false);
		attackField.setEditable(false);
		
		numberBox = new JLabel("Number: ");
		healthBox = new JLabel("Health: ");
		attackBox = new JLabel("Attack: ");	
		modBox = new JLabel("Enhance: ");
		evolveLabel = new JLabel("Evolve: ");
		nameLabel = new JLabel("Name: ");
		image = new JLabel(new ImageIcon(getClass().getResource("images/" + updateImage + ".png")));
		
		baseLayout = new SpringLayout();
		
		setupLayout();
		setupPanel();
		setupListeners();
		setupComboBox();
	}
	private void setupPanel() 
	{
		this.setLayout(baseLayout);

		this.add(image);
		
		this.add(nameBox);
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
		this.add(typeOne);
		this.add(typeTwo);
		this.add(typeThree);
		
		this.add(numberBox);
		this.add(healthBox);
		this.add(modBox);
		this.add(evolveLabel);
		this.add(nameLabel);
		this.add(attackBox);
	}
	private void setupLayout() 
	{
		baseLayout.putConstraint(SpringLayout.NORTH, load, 0, SpringLayout.NORTH, save);
		baseLayout.putConstraint(SpringLayout.EAST, load, -6, SpringLayout.WEST, save);
		baseLayout.putConstraint(SpringLayout.SOUTH, scroll, -45, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, reset, 380, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, reset, 0, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, save, 0, SpringLayout.NORTH, reset);
		baseLayout.putConstraint(SpringLayout.WEST, save, -146, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, save, -6, SpringLayout.WEST, reset);
		baseLayout.putConstraint(SpringLayout.SOUTH, reset, 0, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, typeOne, 266, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, typeThree, 11, SpringLayout.SOUTH, description);
		baseLayout.putConstraint(SpringLayout.NORTH, typeTwo, 11, SpringLayout.SOUTH, description);
		baseLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 14, SpringLayout.SOUTH, numberBox);
		baseLayout.putConstraint(SpringLayout.NORTH, evolveBox, 6, SpringLayout.SOUTH, numberField);
		baseLayout.putConstraint(SpringLayout.WEST, evolveBox, 0, SpringLayout.WEST, nameBox);
		baseLayout.putConstraint(SpringLayout.WEST, evolveLabel, 0, SpringLayout.WEST, numberBox);
		baseLayout.putConstraint(SpringLayout.WEST, typeTwo, 82, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, typeThree, 6, SpringLayout.EAST, typeTwo);
		baseLayout.putConstraint(SpringLayout.NORTH, description, 6, SpringLayout.SOUTH, image);
		baseLayout.putConstraint(SpringLayout.SOUTH, description, -11, SpringLayout.NORTH, typeOne);
		baseLayout.putConstraint(SpringLayout.WEST, typeOne, 36, SpringLayout.WEST, image);
		baseLayout.putConstraint(SpringLayout.EAST, typeOne, -6, SpringLayout.WEST, typeTwo);
		baseLayout.putConstraint(SpringLayout.WEST, scroll, 265, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, scroll, 0, SpringLayout.EAST, nameBox);
		baseLayout.putConstraint(SpringLayout.WEST, description, 0, SpringLayout.WEST, image);
		baseLayout.putConstraint(SpringLayout.EAST, description, 198, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, image, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, image, -39, SpringLayout.WEST, numberBox);
		baseLayout.putConstraint(SpringLayout.NORTH, attackField, 184, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, modField, 10, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.SOUTH, modField, -11, SpringLayout.NORTH, attackField);
		baseLayout.putConstraint(SpringLayout.NORTH, nameBox, 15, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, image, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, image, 0, SpringLayout.SOUTH, attackBox);
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
		baseLayout.putConstraint(SpringLayout.EAST, modField, 0, SpringLayout.EAST, nameBox);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, nameBox);
		baseLayout.putConstraint(SpringLayout.EAST, nameBox, -50, SpringLayout.EAST, this);
	}
	private void setupListeners() 
	{
		scroll.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent selection) 
			{
				int currentPokemon = scroll.getSelectedIndex();
				updatePokedexInfo(currentPokemon);
				updateTypeLabel();
				updateDescription();
				updateImageLabel();
				repaint();
			}
		});
	}
	private void updateDescription() 
	{
		String[] type = controller.getPokedex().get(scroll.getSelectedIndex()).getPokemonTypes();
		if (type[0].equals("Fire")) {
			description.setText("Fire");
		}
		else if(type[0].equals("Dark")) {
			description.setText("Dark");
		}
		else if(type[0].equals("Ghost")) {
			description.setText("Ghost");
		}
		else if(type[0].equals("Flying")) {
			description.setText("Flying");
		}
		else if(type[0].equals("Water")) {
			description.setText("Water");
		}
		else {
		}
		if (type.length > 1) {
			if (type[1].equals("Fire")) 
			{
				description.append(", Fire");
			}
			else if(type[1].equals("Dark")) 
			{
				description.append(", Dark");
			}
			else if(type[1].equals("Ghost")) 
			{
				description.append(", Ghost");
			}
			else if(type[1].equals("Flying")) 
			{
				description.append(", Flying");
			}
			else if(type[1].equals("Water")) 
			{
				description.append(", Water");
			}
			else {
			}
		}
	}
	private void updatePokedexInfo(int index) 
	{
		nameBox.setText(controller.getPokedex().get(index).getName());
		evolveBox.setSelected(controller.getPokedex().get(index).isCanEvolve());
		numberField.setText(controller.getPokedex().get(index).getNumber() + "");
		attackField.setText(controller.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(controller.getPokedex().get(index).getHealthPoints() + "");
		modField.setText(controller.getPokedex().get(index).getEnhancementModifier() + "");
	}
	private void setupComboBox() 
	{
		DefaultComboBoxModel pokemonList = new DefaultComboBoxModel(controller.convertPokedex());
		scroll.setModel(pokemonList);
	}
	private void updateTypeLabel() 
	{
		String[] types = controller.getPokedex().get(scroll.getSelectedIndex()).getPokemonTypes();
		if (types[0].equals("Fire")) 
		{
			typeOne.setBackground(Color.ORANGE);
		}
		else if(types[0].equals("Dark")) 
		{
			typeOne.setBackground(Color.BLACK);
		}
		else if(types[0].equals("Ghost")) 
		{
			typeOne.setBackground(Color.GRAY);
		}
		else if(types[0].equals("Flying")) 
		{
			typeOne.setBackground(Color.CYAN);
		}
		else if(types[0].equals("Water")) 
		{
			typeOne.setBackground(Color.BLUE);
		}
		else 
		{
			typeOne.setBackground(Color.WHITE);
		}
		if (types.length > 1) 
		{
			if (types[1].equals("Fire")) 
			{
				typeTwo.setBackground(Color.ORANGE);
			}
			else if(types[1].equals("Dark")) 
			{
				typeTwo.setBackground(Color.BLACK);
			}
			else if(types[1].equals("Ghost")) 
			{
				typeTwo.setBackground(Color.GRAY);
			}
			else if(types[1].equals("Flying")) 
			{
				typeTwo.setBackground(Color.CYAN);
			}
			else if(types[1].equals("Water")) 
			{
				typeTwo.setBackground(Color.BLUE);
			}
		}
		else 
		{
			typeTwo.setBackground(Color.WHITE);
		}
	}
	private void updateImageLabel() {
		updateImage = controller.getPokedex().get(scroll.getSelectedIndex()).getName();
		image.setIcon(new ImageIcon(getClass().getResource("images/" + updateImage + ".png")));
	}
}
