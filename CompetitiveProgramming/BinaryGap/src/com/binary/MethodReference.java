package com.binary;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interf i = MethodReference::m2;
		//i.m1();
		List<Integer> lst = new ArrayList<>();
		for(int j=0; j < 50; j++) {
			lst.add(j);
		}
		
		List<Integer> k = lst.stream().filter(i-> i%2 ==0).collect(Collectors.toList());
		//System.out.println(k);
		List<Integer> desc = lst.stream().filter(i-> i%2 ==0).sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		//System.out.println(desc);
		int max = lst.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		//System.out.println(max);
		//lst.stream().forEach(System.out::println);
		LocalDate date = LocalDate.now();
		System.out.println(date.getYear());
		LocalTime time = LocalTime.now();
		System.out.println(time);
		ZoneId zone = ZoneId.systemDefault();
		ZoneId z = ZoneId.of("America/New_York");
		System.out.println(zone);
		System.out.println(z);
	}

	public static void m2() {
		System.out.println("Method reference implementation.");
	}
}
