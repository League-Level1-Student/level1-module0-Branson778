package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
static JButton button1 = new JButton();
static JButton button2 = new JButton();
static JButton button3 = new JButton();
public void showButton() {
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.add(panel);
	frame.setVisible(true);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button1.setText("Ducks");
	button2.setText("Frog");
	button3.setText("Fluffy Unicorns");
	frame.pack();
	
	

}
@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed.equals(button1)) {
		showDucks();
	}
	if(buttonPressed.equals(button2)) {
		showFrog();
	}
	if(buttonPressed.equals(button3)) {
		showFluffyUnicorns();
	}
}
static void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

static void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

static void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

static void playVideo(String videoID) {
    
    // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
    //work on some Linux implementations
    try {
    if (System.getProperty("os.name").toLowerCase().contains("linux")) {
    if (Runtime.getRuntime().exec(new String[] {
     "which", "xdg- open" }).getInputStream().read() != -1) {
    Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
    }
    } else {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    }      } catch (Exception e) {
         e.printStackTrace();
    }
}
	
	
	
	
	
	
	
}
