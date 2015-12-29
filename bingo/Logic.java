package com.gmail.rai99cos.bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logic {
	List<Integer> bingoCard = new ArrayList<>();

	public void CreatNum() {
		for (int i = 0; i < 5; i++) {
			List<Integer> array = new ArrayList<>();
			for (int j = 0; j < 15; j++) {
				array.add(i * 15 + j + 1);
			}
			Collections.shuffle(array);
			for (int j = 0; j < 5; j++) {
				bingoCard.add(array.get(j));
			}
		}
	}

	protected String getNums(int index) {
		return bingoCard.get(index).toString();
	}

}
