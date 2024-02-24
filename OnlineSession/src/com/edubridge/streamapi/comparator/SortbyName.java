package com.edubridge.streamapi.comparator;

import java.util.*;

public class SortbyName implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.name.compareTo(o2.name);
	}

}
