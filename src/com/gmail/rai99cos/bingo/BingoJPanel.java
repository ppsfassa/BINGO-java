package com.gmail.rai99cos.bingo;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BingoJPanel extends JPanel {
	
	public BingoJPanel() {
		this.setLayout(new BorderLayout());
		
		JLabel label = new JLabel("BINGO");
		Font font = new Font("Century", Font.BOLD, 90);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		this.add(label, BorderLayout.NORTH);
	}
}
