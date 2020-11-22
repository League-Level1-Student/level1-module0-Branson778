package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JButton a = new JButton();
    JButton b = new JButton();
    JButton c = new JButton();
    JButton d = new JButton();
	public void showButton() {
    System.out.println("Button clicked");
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    frame.setVisible(true);
    frame.add(panel);
    a.addActionListener(this);
    b.addActionListener(this);
    c.addActionListener(this);
    d.addActionListener(this);
    a.setText("SOS In Morse Code");
    b.setText("Wood Being Sawed");
    c.setText("Alien Spaceship");
    d.setText("Muscle Car");
    panel.add(a);
    panel.add(b);
    panel.add(c);
    panel.add(d);
    frame.pack();
}

@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed.equals(a)) {
		playSound("sos-morse-code_daniel-simion.wav");
		System.out.println("011010101000101000010100101010010110101001010100101010100101010101010100101001010101010");
	}
	if(buttonPressed.equals(b)) {
		playSound("sawing-wood-daniel_simon.wav");
		System.out.println("Chh Csho");
	}
	if(buttonPressed.equals(c)) {
		playSound("alien-spaceship_daniel_simion.wav");
		System.out.println("Wherow Zhoo Yroom");
	}
	if(buttonPressed.equals(d)) {
		playSound("muscle-car-daniel_simon.wav");
		System.out.println("Vroom Vruum Vroum Vroom Pshk");
	}
}

private void playSound(String fileName) {
     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
     sound.play();
}

}
