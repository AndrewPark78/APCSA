package unit12;

import java.util.ArrayList;

import unit11.Student;

public class ArrayListSorter {
	public static void main(String[] args) {
		ArrayList<Number> m = new ArrayList<Number>();
		for (int i = 10; i > 0; i--) {
			m.add(i);
		}
		System.out.println(m);
		sort(m);
	}

	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - 1; j++) {
				if (list.get(j).intValue() > (list.get(j + 1).intValue())) {
					Number temp = list.get(j + 1);
					list.set(j + 1, list.get(j));
					list.set(j, temp);
				}
			}
		}
		System.out.println(list);
	}

}
