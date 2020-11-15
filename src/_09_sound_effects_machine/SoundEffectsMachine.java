package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
public void showButton() {
    System.out.println("Button clicked");
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton a = new JButton();
    JButton b = new JButton();
    JButton c = new JButton();
    JButton d = new JButton();
    frame.setVisible(true);
    frame.add(panel);
    a.addActionListener(this);
    b.addActionListener(this);
    c.addActionListener(this);
    d.addActionListener(this);
    panel.add(a);
    panel.add(b);
    panel.add(c);
    panel.add(d);
    frame.pack();
}

@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed.equals(obj)) {
		
	}
}
}
