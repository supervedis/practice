package com.binary;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class RaindropConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(convert(35));

	}

	 private static String convert(int number) {
		    Predicate<Integer> factorOf3 = n -> n%3 == 0;
		    Predicate<Integer> factorOf5 = n -> n%5 == 0;
		    Predicate<Integer> factorOf7 = n -> n%7 == 0;
	        Function<Integer, String> f1 = n -> {
	        	if(factorOf3.and(factorOf5).and(factorOf7).test(n)) {
	        		return "PlingPlangPlong";
	        	}else if(factorOf3.and(factorOf5).test(n)) {
	        		return "PlingPlang";
	        	}else if(factorOf3.and(factorOf7).test(n)) {
	        		return "PlingPlong";
	        	}else if(factorOf5.and(factorOf7).test(n)) {
	        		return "PlangPlong";
	        	}else if(factorOf3.test(n)) {
	        		return "Pling";
	        	}else if(factorOf5.test(n)) {
	        		return "Plang";
	        	}else if(factorOf7.test(n)) {
	        		return "Plong";
	        	}
				return String.valueOf(number);
	        	
	        };
	        
	        //Consumer<Integer> c = n -> System.out.println(f1.apply(number));
	        return f1.apply(number);
	 }
}
