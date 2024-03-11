package com.edubridge.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Mlat {

	public static void main(String[] args) {
		StringBuilder result = Stream.of("a", "b").parallel().collect(StringBuilder::new, StringBuilder::append,(a, b) -> b.append(a));
		System.out.println(result);
	}

}
