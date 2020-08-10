package ex2;

import java.util.Comparator;

public class SortById implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int s1 = o1.getId();
		int s2 = o2.getId();
		int value;
		if (s1 > s2) {
			value = 1;
		} else if (s1 < s2) {
			value = -1;
		} else {
			value = 0;
		}
		return value;

	}

}
