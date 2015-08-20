package GUI;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class HeaderPanel extends JPanel {
	
	private String[] durations = {"Semiquaver", "Tuplet", "Quaver", "Dotted Quaver", "Crotchet", "Minim", "Dotted Minim", "Semibreve", "Breve"};
	private Color customColor = new Color(172,181,253);
    private Border border = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
	
	
	public HeaderPanel(MainFrame mainFrame){
		initialize();
		validateToMainFrame(mainFrame);
	}

	private void initialize() {
		GridBagConstraints gbc = new GridBagConstraints();
		this.setPreferredSize(new Dimension(10,750));
		setLayout(new GridBagLayout());
		setBackground(Color.BLACK);
		
		JLabel titleLabel = new JLabel(" Piano Encoder");
		titleLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setBackground(Color.BLACK);
		gbc.gridx = 0;
		gbc.gridy = 0;
		this.add(titleLabel,gbc);
        
        JLabel noteLabel = new JLabel("Note Type:");
        noteLabel.setForeground(Color.WHITE);
        noteLabel.setBackground(Color.BLACK);
        gbc.gridx = 4;
		gbc.gridy = 0;
        this.add(noteLabel,gbc);
        
        JComboBox duration = new JComboBox(durations);
        duration.setName("instrument");
//        duration.addActionListener((ActionListener) this);
        duration.setForeground(Color.WHITE);
        duration.setBackground(Color.BLACK);
        gbc.gridx = 8;
		gbc.gridy = 0;
        this.add(duration,gbc);
        
        // Tempo label
        JLabel tempoLabel = new JLabel("Tempo:");
		tempoLabel.setForeground(Color.WHITE);
		tempoLabel.setBackground(Color.BLACK);
		gbc.gridx = 16;
		gbc.gridy = 0;
        this.add(tempoLabel,gbc);

        // Tempo text area
        JTextArea tempo = new JTextArea();
        tempo.setName("tempo");
        tempo.setText("80");
		tempo.setFont(new Font("Ariel", Font.BOLD, 12));
        tempo.setBorder(border);
		tempo.setForeground(Color.BLACK);
		tempo.setBackground(customColor);
		gbc.gridx = 32;
		gbc.gridy = 0;
        this.add(tempo,gbc);
        
        JButton help = new JButton("Help");
        help.setForeground(Color.WHITE);
        help.setBackground(Color.BLACK);
//        help.addActionListener(this);
        help.setName("help");
        gbc.gridx = 64;
		gbc.gridy = 0;
        this.add(help,gbc);		
		
	}
	
	private void validateToMainFrame(MainFrame mainFrame) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.BOTH;		
		mainFrame.getContentPane().add(this, gbc);
		mainFrame.validate();	
	}
}
