package dev;



import java.util.List;

import bingo.Bingo;

public class Main {
	public static void main(String [] args) {
		Bingo bingo = new Bingo();
		bingo.loadGame();
		bingo.printData();
		System.out.println("=".repeat(50));
		bingo.shuffleBingo();
		bingo.printData();
		System.out.println("=".repeat(50));
		
		List<String> bingoList = bingo.getBingoData();
		bingoList.stream()
			.limit(15)
			.filter(s -> s.charAt(0)=='G' || s.charAt(0)=='O')
			.map(s -> s.charAt(0)+"_"+s.substring(1))
			.forEach(System.out::println);
	}
	
	
}
