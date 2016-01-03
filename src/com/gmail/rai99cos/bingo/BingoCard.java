package com.gmail.rai99cos.bingo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BingoCard {

	public static void main(String[] args) {
		// swing here
		JFrame jframe = new JFrame("BINGO!");
		JPanel jpanel = new BingoJPanel();

		Logic logic = new Logic();
		logic.CreatNum();

		List<JButton> buttonList = new ArrayList<>();
		for (int i = 0; i < 25; i++) {
			buttonList.add(new JButton(logic.getNums(i)));
		}
		buttonList.remove(12);
		buttonList.add(12, new JButton("FREE"));

		Font font1 = new Font("Century", Font.BOLD, 45);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2 && j == 2) {
					buttonList.get((i * 5) + j).setFont(new Font("Century", Font.BOLD, 25));
				} else {
					buttonList.get((i * 5) + j).setFont(font1);
				}
				buttonList.get((i * 5) + j).setBounds((i * 100) + 10, (j + 1) * 100, 95, 95);
				buttonList.get((i * 5) + j).setForeground(Color.black);
				buttonList.get((i * 5) + j).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						/*
						 * ここを変更しました
						 * Background : 背景
						 * Foreground : 文字色
						 * defaultColorはjbutton.getBackground()をsysoutして
						 * 確認しました
						 * ColorクラスはコンストラクタでRGB設定が可能です
						 *  -> Color sample = new Color(128, 128, 128);//gray
						 */
						JButton jbutton = (JButton) e.getSource();
						Color defaultColor = new Color(238, 238, 238);
						Color pushedColor = Color.RED;
						if (jbutton.getBackground().equals(defaultColor)) {
							jbutton.setBackground(pushedColor);
						} else {
							jbutton.setBackground(defaultColor);
						}

						//if (jbutton.getForeground() == Color.black) {
						//	jbutton.setForeground(Color.red);
						//} else {
						//	jbutton.setForeground(Color.black);
						//}

					}
				});
				jframe.add(buttonList.get((i * 5) + j));
			}
		}

		jframe.add(jpanel);
		jpanel.setBackground(Color.green);
		jframe.setSize(515, 627);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}
}
