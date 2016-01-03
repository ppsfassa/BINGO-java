package com.gmail.rai99cos.bingo;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BingoJPanel extends JPanel {
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font font1 = new Font("Century", Font.BOLD, 90);
		g.setFont(font1);
		g.drawString("B", 30, 85);
		g.drawString("I", 140, 85);
		g.drawString("N", 220, 85);
		g.drawString("G", 325, 85);
		g.drawString("O", 425, 85);
	}
}
