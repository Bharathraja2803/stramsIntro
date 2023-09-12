package bingo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Bingo {

	private List<String> bingoData = new ArrayList<>(75);
	
	

	//loading Bingo data
	public void loadGame() {	
		int start = 1;
		String value = "";
		for(char c : "BINGO".toCharArray()) {
			for(int i = start; i<start+15; i++) {
				value = ""+c+i;
				bingoData.add(value);
			}
			start +=15;
		}
	}

	//printing Bingo data 
	public void printData() {
		bingoData.forEach(System.out::println);
	}
	
	public void shuffleBingo() {
		Collections.shuffle(bingoData);
	}

	public List<String> getBingoData() {
		return new ArrayList<>(bingoData);
	}
	
	
}
