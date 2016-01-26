package com.gmail.rai99cos.bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BingoMatrixGenerator {
	public static final int WIDTH = 5;
	public static final int HEIGHT = 5;
	public static final int SIZE = WIDTH * HEIGHT;
	public static final int CENTER_INDEX = SIZE / 2;

	List<Integer> bingoMatrix = new ArrayList<>(SIZE);

	public void creatBingoMatrix() {
		for (int col = 0; col < WIDTH; col++) {
			List<Integer> array = new ArrayList<>();
			for (int i = 0; i < 15; i++) {
				int offset = col * 15;
				array.add(offset + i + 1);
			}
			Collections.shuffle(array);
			for (int row = 0; row < HEIGHT; row++) {
				bingoMatrix.add(array.get(row));
			}
		}
	}

	public int getNumber(int index) {
		return bingoMatrix.get(index);
	}

}
