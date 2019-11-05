package com.binary;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Twofer {

	private static final String FER = Objects.toString("One for you, one for me.");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(twofer("Alice"));
       String name ="Alice";
       System.out.println(new Twofer().twofer(name));
	}

//	 static String twofer(String name) {
//		 Predicate<String> p = s -> s == "" || s == null;
//		 Function<String, String> fer = s -> {
//			 String who = p.test(s) ? "you" : s;
//			 return "One for "+who+", one for you";
//		 };
//		 
//		 return fer.apply(name);
//	 }
	 
	 String twofer(String name) {
		 
		return String.format("One for %s, one for me.", Objects.toString(name, "you"));
	 }
}
