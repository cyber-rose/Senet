package senet;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import senet.model.SenetModel;

public class Main implements Runnable{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Main());
		
		//Windows does not fully implement cross-platform look and feel, which is used so button backgrounds work on Mac too
		if(!System.getProperty("os.name").contains("Windows")) {
			try {
			    UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
			 } catch (Exception e) {
				 e.printStackTrace();
			 }
		}
    }

    
	@Override
	public void run() {
		//new GameFrame(new SenetModel());
        new SenetModel();
	}

}