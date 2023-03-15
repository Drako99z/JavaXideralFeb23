package com.curso.streams.v0;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {

		Stream<String> streamEmpty = Stream.empty();
		
		Collection<String> collection = Arrays.asList("a", "b", "c");
		Stream<String> streamOfCollection = collection.stream();
		
		Stream<String> streamOfArray = Stream.of("a", "b", "c");
		
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
		
		Stream<String> streamBuilder =
				  Stream.<String>builder().add("a").add("b").add("c").build();
		
		Stream<String> streamGenerated =
				  Stream.generate(() -> "element").limit(10);
		
		//streamGenerated.forEach(System.out::println);
		
		Stream<Integer> streamIterated = 
				Stream.iterate(40, n -> n + 2).limit(20);
		
		//streamIterated.forEach(System.out::println);
		
		IntStream intStream = IntStream.range(1, 10);
		LongStream longStream = LongStream.rangeClosed(1, 9);
		
		//intStream.forEach(System.out::println);
		
		IntSummaryStatistics intSum = intStream.summaryStatistics();
		
//		System.out.println(intSum.getCount());
//		System.out.println(intSum.getAverage());
//		System.out.println(intSum.getSum());
//		System.out.println(intSum.getMax());
		
		Random random = new Random();
		DoubleStream doubleStream = random.doubles(1.0,5.0).limit(5);
		//doubleStream.forEach(System.out::println);
		
		IntStream streamOfChars = "abc".chars();
		//streamOfChars.forEach(System.out::println);
		

		Stream<String> streamOfString =
				  Pattern.compile(", ").splitAsStream("a, b, c");
		streamOfString.forEach(System.out::println);
		
		String cadena = "Hola";
		
		PrintStream ps = System.out;
		
		ps.println(cadena);

	}
	
	
	
	public Stream<String> streamOf(List<String> list) {
	    return list == null 
	    		|| list.isEmpty() ? Stream.empty() : list.stream();
	}

}
