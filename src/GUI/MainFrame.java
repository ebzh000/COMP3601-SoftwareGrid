package GUI;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	public MainFrame(){
		initialize();
	}

	private void initialize() {
//		setBounds(100, 100, 1200, 750);
		setPreferredSize(new Dimension(1200,750));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);	
		setVisible(true);
		setLocationRelativeTo(null);
//		setIconImage(new ImageIcon(getClass().getResource("resource/icon.png")).getImage());
		//setting background
		
		//setting GridBagLayout
		GridBagLayout gridBagLayout = new GridBagLayout();
//		gridBagLayout.rowHeights = new int[]{10, 0, 0, 0, 0};
//		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
//		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
//		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
	}
}
