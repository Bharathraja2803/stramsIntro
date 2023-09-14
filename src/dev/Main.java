package dev;



import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import bingo.Bingo;

public class Main {
	public static void main(String [] args) {
		Bingo bingo = new Bingo();
		bingo.loadGame();
//		bingo.printData();
//		System.out.println("=".repeat(50));
//		bingo.shuffleBingo();
//		bingo.printData();
//		System.out.println("=".repeat(50));
//		
		List<String> bingoList = bingo.getBingoData();
//		bingoList.stream()
//			.limit(15)
//			.filter(s -> s.charAt(0)=='G' || s.charAt(0)=='O')
//			.map(s -> s.charAt(0)+"_"+s.substring(1))
//			.forEach(System.out::println);
		
		
		int num = 1;
		
		var bStream = Stream.iterate(1, n ->  n+1)
				.limit(15)
				.map(n -> "B"+n);
		var iStream = Stream.iterate(16, n ->  n+1)
				.limit(15)
				.map(n -> "I"+n);
		var nStream = Stream.iterate(31, n ->  n+1)
				.limit(15)
				.map(n -> "N"+n);
		var gStream = Stream.iterate(46, n ->  n+1)
				.limit(15)
				.map(n -> "G"+n);
		var oStream = Stream.iterate(61, n ->  n+1)
				.limit(15)
				.map(n -> "O"+n);
		
//		bStream.forEach(System.out::print);
//		System.out.println();
//		iStream.forEach(System.out::print);
//		System.out.println();
//		nStream.forEach(System.out::print);
//		System.out.println();
//		gStream.forEach(System.out::print);
//		System.out.println();
//		oStream.forEach(System.out::print);
//		System.out.println();
		
		var allStream = Stream.concat(Stream.concat(Stream.concat(Stream.concat(bStream, iStream), nStream), gStream), oStream);
		
//		allStream.forEach(System.out::println);
		
		var mapList = allStream.collect(Collectors.groupingBy(s -> s.charAt(0)));
		
		mapList.forEach((k,v) -> System.out.println(k + v.get(0).substring(1)+"-"+v.get(v.size()-1).substring(1)));
	}
	
	
}
