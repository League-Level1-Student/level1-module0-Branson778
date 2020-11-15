package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
    public void showButton() {
        System.out.println("Button clicked");
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
        int rand = new Random().nextInt(5);
        if(rand==0) {
        	JOptionPane.showMessageDialog(null, "You will become Famous!");
        }
        else if(rand==1) {
        	JOptionPane.showMessageDialog(null, "You will get a Mysterious Package!");
        }
     else if(rand==2) {
    	 JOptionPane.showMessageDialog(null, "You, your friends, and family will all Live Long Lives!");
        }
     else if(rand==3) {
    	 JOptionPane.showMessageDialog(null, "You will become a Game Devloper!");
     }
     else if(rand==4) {
    	 JOptionPane.showMessageDialog(null, "You will becomer a YouTuber!");
     }
   }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
	}
}
