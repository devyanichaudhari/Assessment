package com.edubridge.streamapi.comparator;

import java.util.*;

public class SortbyRollNo implements Comparator<Student1>{

	public int compare(Student1 o1, Student1 o2) {
		return o1.roll_no - o2.roll_no;
	}
}
