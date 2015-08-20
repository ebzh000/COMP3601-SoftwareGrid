package Control;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import Control.EncoderController;

public class Main {

	public static void main(String[] args) {
		System.out.println("The Purple Music Encoder Grid");

		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run() 
			{
				try
				{
					for(LookAndFeelInfo theme : UIManager.getInstalledLookAndFeels())
					{
						if(theme.getName().equalsIgnoreCase("Nimbus"))
						{
							UIManager.setLookAndFeel(theme.getClassName());
							break;
						}
					}
					new EncoderController();

				}
				catch (Exception e)
				{
					System.err.println(e.getMessage());
				}
			}
		});
	}

}