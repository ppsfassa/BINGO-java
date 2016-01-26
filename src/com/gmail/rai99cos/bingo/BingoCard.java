package com.gmail.rai99cos.bingo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BingoCard {

	public static void main(String[] args) {
		JFrame jframe = new JFrame("BINGO!");
		JPanel jpanel = new BingoJPanel();

		BingoMatrixGenerator logic = new BingoMatrixGenerator();
		logic.creatBingoMatrix();

		List<JButton> buttons = new ArrayList<>(BingoMatrixGenerator.SIZE);
		for (int i = 0; i < BingoMatrixGenerator.SIZE; i++) {
			JButton numberButton = null;

			if (i != BingoMatrixGenerator.CENTER_INDEX) {
				int number = logic.getNumber(i);
				numberButton = new JButton(String.valueOf(number));
				Font buttonFont = new Font("Century", Font.BOLD, 45);
				numberButton.setFont(buttonFont);

			} else {
				numberButton = new JButton("FREE");
				numberButton.setFont(new Font("Century", Font.BOLD, 20));
			}
			numberButton.setBackground(Color.WHITE);
			numberButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton jbutton = (JButton) e.getSource();
					Color defaultColor = Color.WHITE;
					Color pushedColor = Color.RED;
					if (jbutton.getBackground().equals(defaultColor)) {
						jbutton.setBackground(pushedColor);
					} else {
						jbutton.setBackground(defaultColor);
					}
				}
			});

			buttons.add(numberButton);
		}

		JPanel numbersPanel = new JPanel();
		numbersPanel.setLayout(new GridLayout(BingoMatrixGenerator.HEIGHT, BingoMatrixGenerator.WIDTH));
		for(JButton button : buttons){
			numbersPanel.add(button);
		}

		jpanel.add(numbersPanel, BorderLayout.CENTER);
		jframe.add(jpanel);
		jpanel.setBackground(Color.green);
		jframe.setSize(500, 700);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}
}
