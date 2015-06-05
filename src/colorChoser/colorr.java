package colorChoser;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class colorr extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton b;
	private Color color = (Color.WHITE);
	private JPanel panel;
	private JPasswordField pas;

	public colorr() {
		super("The title comes here");

		panel = new JPanel();
		panel.setBackground(color);

		b = new JButton("Choose a color");
		b.setSize(20, 40);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				color = JColorChooser.showDialog(null, "Choose color here",
						color);
				if (color == null)
					color = (Color.WHITE);
				panel.setBackground(color);
			}

		});

		add(panel, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		
		pas = new JPasswordField(10);
		//pas.setSize(20,20);
		panel.add(pas);
	}

}
