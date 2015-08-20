package Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import GUI.MainFrame;
import GUI.HeaderPanel;

@SuppressWarnings("serial")
public class EncoderController extends JFrame implements ActionListener, MouseListener {

	private MainFrame mainFrame;
	private HeaderPanel headerPanel;
	
	public EncoderController(){
		mainFrame = new MainFrame();
		viewHeaderPanel(mainFrame);
	}
	

	private void viewHeaderPanel(MainFrame mainFrame) {
		if(headerPanel == null)
		{
			mainFrame.setSize(1200, 750);
			headerPanel = new HeaderPanel(mainFrame);
			
		} else {
			mainFrame.setSize(1200, 750);
			headerPanel.setVisible(true);
		}		
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}




	
}
